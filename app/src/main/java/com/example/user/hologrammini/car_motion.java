package com.example.user.hologrammini;



import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class car_motion extends AppCompatActivity {

    TextView fr1, fr2, fr3, fr4, fl1, fl2, fl3, fl4, br1, br2, br3, br4, bl1, bl2, bl3, bl4;

    private void updateTextView1() {

        fr1.setText("31 psi");

        fl1.setText("31 psi");

        br1.setText("34 psi");
        bl1.setText("34 psi");

        br1.setText("34 psi");

    }

    private void updateTextView2() {

        fr1.setText("32 psi");

        fl1.setText("32 psi");

        br1.setText("33 psi");
        bl1.setText("33 psi");



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        
        setContentView(R.layout.activity_car_motion);
        ImageView carimageView = (ImageView) findViewById(R.id.carimageView);

        ImageView carimageView5 = (ImageView) findViewById(R.id.carimageView5);

        fl1 = (TextView) findViewById(R.id.fl1);
        fr1 = (TextView) findViewById(R.id.fr1);
        br1 = (TextView) findViewById(R.id.br1);
        bl1 = (TextView) findViewById(R.id.bl1);
        fr1.setText("34 psi");
        fr1.setRotation(180f);
        fr1.setRotationX(180f);
        fr1.animate().alpha(1f).setDuration(15000);

        fl1.setText("34 psi");
        fl1.setRotation(180f);
        fl1.setRotationX(180f);
        fl1.animate().alpha(1f).setDuration(15000);

        bl1.setText("32 psi");
        bl1.setRotation(180f);
        bl1.setRotationX(180f);
        bl1.animate().alpha(1f).setDuration(15000);

        br1.setText("32 psi");
        br1.setRotation(180f);
        br1.setRotationX(180f);
        br1.animate().alpha(1f).setDuration(15000);

        carimageView5.animate().translationX(-100f).setDuration(5000).alpha(0f);

        carimageView.animate().alpha(1f).translationY(-10f).setDuration(10000);
        carimageView.setAlpha(1f);

        Thread t1 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(4000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView1();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t1.start();
        Thread t2 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(4500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView2();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t2.start();
        Handler mHandler1 = new Handler();
        mHandler1.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(car_motion.this, embdes_logo.class);


                startActivity(i);

            }

        }, 20000L);

    }

}