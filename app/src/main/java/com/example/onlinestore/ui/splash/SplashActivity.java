package com.example.onlinestore.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.onlinestore.R;
import com.example.onlinestore.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity  {

    ImageView imageLogo;
    View view;
    SplashPresenter splashPresenter;
    private static int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenter();
        imageLogo = findViewById(R.id.splsh_logo);
        view = findViewById(R.id.splah_line);

        splashPresenter.getToken(this);
        setAnimation();

    }

    public void setAnimation(){

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        imageLogo.setAnimation(anim);
        view.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mySuperIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mySuperIntent);

                finish();

            }
        }, SPLASH_TIME);
    }



}
