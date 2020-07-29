package com.heartmeetsoul.saimantra;

import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
RelativeLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
lay=(RelativeLayout)findViewById(R.id.lay);


     lay.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale));
     new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              startActivity(  new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },2500);

    }
}
