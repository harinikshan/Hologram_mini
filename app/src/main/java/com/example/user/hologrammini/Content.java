package com.example.user.hologrammini;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_content);
        ImageView contentimageView = (ImageView) findViewById(R.id.contentimageView);
        contentimageView.animate().scaleX(2f).scaleY(2f).rotationY(360f).setDuration(10000);
        ImageView contentimageView2 = (ImageView) findViewById(R.id.contentimageView2);
        contentimageView2.animate().scaleX(2f).scaleY(2f).rotationX(360f).setDuration(10000);
        ImageView contentimageView3 = (ImageView) findViewById(R.id.contentimageView3);
        contentimageView3.animate().scaleX(2f).scaleY(2f).rotationX(360f).setDuration(10000);
        ImageView contentimageView4 = (ImageView) findViewById(R.id.contentimageView4);
        contentimageView4.animate().scaleX(2f).scaleY(2f).rotationY(360f).setDuration(10000);


        Handler mHandler1 = new Handler();
        mHandler1.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Content.this, embdes_logo.class);


                startActivity(i);

            }

        }, 5000L);


    }
}
