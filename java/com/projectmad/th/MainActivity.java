package com.projectmad.th;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView i1;
    ImageView i2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.logo);
        i2 = (ImageView) findViewById(R.id.startpic);
        txt = (TextView) findViewById(R.id.tech);
        Animation myanime = AnimationUtils.loadAnimation(this,R.anim.anime);
        txt.startAnimation(myanime);
        i2.startAnimation(myanime);
        i1.startAnimation(myanime);
        final Intent i = new Intent(this,AppBase.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();
    }
}