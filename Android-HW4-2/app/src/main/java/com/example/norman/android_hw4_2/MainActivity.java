package com.example.norman.android_hw4_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Norman on 2017/4/23.
 */

public class MainActivity extends AppCompatActivity {
    private TextView tvSayHello;



    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener((view)->
                {
                        Snackbar.make(view,"Replace with your own action"),Snackbar.LENGTH_LONG
                        .setAction("Action",null).show();

                });
        tvSayHello = (TextView)findViewById(R.id.tv_say_hello);
        Intent intent = getIntent();
        String hello = "Hello";
        if(intent !=null)
        {
            String name = intent.getStringExtra("Name");
            if(name!=null)
            {
                hello = hello + name;

            }

        }
        tvSayHello.setText(hello);


    }
}
