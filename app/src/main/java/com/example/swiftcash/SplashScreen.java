package com.example.swiftcash;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.swiftcash.R;
import com.jaredrummler.android.widget.AnimatedSvgView;

public class SplashScreen extends AppCompatActivity implements AnimatedSvgView.OnStateChangeListener{

    AnimatedSvgView logo_maker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo_maker = findViewById(R.id.animated_svg_view);
        logo_maker.start();
        logo_maker.setOnStateChangeListener(this);
    }

    @Override
    public void onStateChange(int state) {
        if(state == AnimatedSvgView.STATE_FINISHED){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                    finish();
                }
            },500);
        }
    }
}