package com.kcjsoft.calligraphy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LodingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding);

        Handler handler= new Handler();
        handler.postDelayed(my,3000);
    }
    Runnable my= new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(LodingActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

        }
    };
}
