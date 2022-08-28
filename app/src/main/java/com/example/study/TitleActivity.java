package com.example.study;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        activity = this;
        moveMain(1);	//1초 후 main activity 로 넘어감
    }

    public TitleActivity(){super();}
    private TitleActivity activity;
    private void moveMain(int sec) {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(activity,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000 * sec);
    }
}