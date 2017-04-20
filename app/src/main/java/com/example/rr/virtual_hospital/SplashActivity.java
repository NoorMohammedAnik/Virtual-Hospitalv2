package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;



// Done By Rafid

public class SplashActivity extends AppCompatActivity {
   // ActionBar getActionBar;
    public static int SplashTime=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // getActionBar=getSupportActionBar();
//        getActionBar.hide();
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(in);
                Toast.makeText(SplashActivity.this, "App Starting", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashTime);

    }
}
