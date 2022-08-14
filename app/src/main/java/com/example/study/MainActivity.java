package com.example.study;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            TextView tv = findViewById(R.id.tv);

            Random random = new Random();
            String[] arr ={"가","나","다","라","마"};
            tv.setText(arr[random.nextInt(5)]);


    }
}