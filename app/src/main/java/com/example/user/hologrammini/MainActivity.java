package com.example.user.hologrammini;


import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.animate().translationX(-75f).translationY(50f).scaleX(1f).scaleY(1f).setDuration(15000).alpha(0);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.animate().translationY(-75f).translationY(-50f).scaleX(1f).scaleY(1f).alpha(0).setDuration(15000);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.animate().translationY(75f).translationX(50f).scaleX(1f).scaleY(1f).alpha(0).setDuration(15000);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.animate().translationX(75f).translationY(-50f).scaleX(1f).scaleY(1f).alpha(0).setDuration(15000);
        Handler mHandler1 = new Handler();
        mHandler1.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, weather.class);


                startActivity(i);

            }

        }, 15000L);
    }
}
