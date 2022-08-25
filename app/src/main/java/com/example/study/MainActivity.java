package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this; //
        btn = findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(activity,test02.class);
                startActivity(i);
            }
        });

    }
    public MainActivity(){super();}
    private MainActivity activity;
//    public void login(View v){
//    btn = findViewById(R.id.login);
    /*     Intent i = new Intent(activity,test01.class);

     */
    }
