package com.example.user.hologrammini;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class embdes_logo extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tm1,tm2,tm3,tm4;

    TextView num1 , num2 , num3 , num4;
    static int num=0;
    private void updateTextView1()
    {

        num1.setText("70");


    }
    private void updateTextView2()
    {

        num1.setText("85");

    }
    private void updateTextView3()
    {

        num1.setText("80");


    }
    private void updateTextView4()
    {

        num1.setText("75");


    }
    /*  private void updateTextView() {
          Date noteTS = Calendar.getInstance().getTime();

          String time = "hh:mm:ss"; // 12:00
          tv1.setText(DateFormat.format(time, noteTS));

          String date = "dd:MMMM:yyyy"; // 01 January 2013
          tm1.setText(DateFormat.format(date, noteTS));
          String time1 = "hh:mm:ss"; // 12:00
          tv2.setText(DateFormat.format(time, noteTS));

          String date1 = "dd:MMMM:yyyy"; // 01 January 2013
          tm2.setText(DateFormat.format(date, noteTS));
          String time2 = "hh:mm:ss"; // 12:00
          tv3.setText(DateFormat.format(time, noteTS));

          String date2 = "dd:MMMM:yyyy"; // 01 January 2013
          tm3.setText(DateFormat.format(date, noteTS));
          String time3 = "hh:mm:ss"; // 12:00
          tv4.setText(DateFormat.format(time, noteTS));

          String date3 = "dd:MMMM:yyyy"; // 01 January 2013
          tm4.setText(DateFormat.format(date, noteTS));

      }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_embdes_logo);
        num1 = (TextView) findViewById(R.id.num1);

        num1.setText("127");
        num1.animate().rotationY(180f).scaleX(1f).scaleY(1f).setDuration(1000);

        ImageView logoimageView = (ImageView) findViewById(R.id.logoimageView);
        logoimageView.animate().scaleX(1f).scaleY(1f).rotationY(180f).setDuration(1000);

       /* tv1 = (TextView) findViewById(R.id.tv1);
       tm1 = (TextView) findViewById(R.id.tm1);*/

       /* Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                updateTextView();


                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();*/
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
                        Thread.sleep(1000);
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
        Thread t3 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(2000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView3();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t3.start();
        Thread t4 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(3000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView4();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t4.start();
        Handler mHandler1 = new Handler();
        mHandler1.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(embdes_logo.this, weather.class);


                startActivity(i);

            }

        }, 15000L);
    }


}

