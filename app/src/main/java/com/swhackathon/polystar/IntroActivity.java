package com.swhackathon.polystar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        //타이틀바 삭제 시작
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀바 삭제 종료
        Handler handler = new Handler();
        handler.postDelayed((new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }),5000);
    }
    protected  void onPause(){
        super.onPause();
        finish();
    }
}