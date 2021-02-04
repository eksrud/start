    package com.swhackathon.polystar;

    import androidx.appcompat.app.ActionBar;
    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;

    public class JoinActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_join);
            //타이틀바 삭제 시작
            ActionBar actionBar = getSupportActionBar();
            actionBar.hide();
            //타이틀바 삭제 종료

        }
    }