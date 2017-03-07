package com.example.xavin.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    ImageView logo;
    TextView titulo_app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        titulo_app = (TextView) findViewById(R.id.titulo_app);

        animaciones();
        fuente();
        splash();

    }

    private void splash() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash
                        .this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

    private void fuente() {
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titulo_app.setTypeface(myFont);

    }

    private void animaciones() {
        Drawable drawable = getResources().getDrawable(R.drawable.fox);
        logo.setImageDrawable(drawable);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);

        Animation shake2 = AnimationUtils.loadAnimation(this, R.anim.shake);


        logo.startAnimation(shake);
        titulo_app.startAnimation(shake2);


    }
}
