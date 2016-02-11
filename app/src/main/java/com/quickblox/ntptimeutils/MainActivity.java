package com.quickblox.ntptimeutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("LOG", "requesting time..");

                Date dt = SntpUtils.getUTCDate();
                Log.d("LOG", "dt: " +  dt.toString());

                long ts = SntpUtils.getUTCTimestamp();
                Log.d("LOG", "ts: " + ts);
            }
        }).start();
    }
}
