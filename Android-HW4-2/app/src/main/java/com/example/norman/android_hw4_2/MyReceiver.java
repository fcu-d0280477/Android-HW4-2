package com.example.norman.android_hw4_2;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @SuppressLint("NewApi")
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.


        String name = intent.getStringExtra("Name");

        Intent newIntent = new Intent();
        newIntent.setClass(context,MainActivity.class);
        newIntent.putExtra("Name",name);

        PendingIntent pi = PendingIntent.getActivities(context,0,newIntent,PendingIntent.FLAG_CANCEL_CURRENT);
        builder.setContentTitle("Hello");
        builder.setContentText(name);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(pi);
        builder.setTicker(name);
        builder.setWhen(System.currentTimeMillis());
        Notification notify = builder.build();

        NotificationManager notificationManager = (NotificationManager)context.
        getSystemService(Context.NOTIFICATION_SERVICE);


        notificationManager.notify(id++,notify);

        Log.v("Sammy",name);


    }
}
