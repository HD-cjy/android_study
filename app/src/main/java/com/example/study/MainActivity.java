package com.example.study;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input_text= findViewById(R.id.input_text);
        Button input_btn= findViewById(R.id.input_btn);
        TextView box1= findViewById(R.id.box1);
        TextView box2= findViewById(R.id.box2);
        TextView box3= findViewById(R.id.box3);
        TextView box4= findViewById(R.id.box4);
        TextView box5= findViewById(R.id.box5);
        TextView output_text = findViewById(R.id.output_text);
        Random random = new Random();
        String [] arr= new String[5];
        input_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (count) {
                    case 0:
                        arr[count] = input_text.getText().toString();
                        box1.setText(arr[count]);
                        count++;
                        input_text.setText(null);
                        break;
                    case 1:
                        arr[count] = input_text.getText().toString();
                        box2.setText(arr[count]);
                        count++;
                        input_text.setText(null);
                        break;
                    case 2:
                        arr[count] = input_text.getText().toString();
                        box3.setText(arr[count]);
                        count++;
                        input_text.setText(null);
                        break;
                    case 3:
                        arr[count] = input_text.getText().toString();
                        box4.setText(arr[count]);
                        count++;
                        input_text.setText(null);
                        break;
                    case 4:
                        arr[count] = input_text.getText().toString();
                        box5.setText(arr[count]);
                        input_btn.setText("변환");
                        count++;
                        input_text.setText(null);
                        break;
                    case 5:
                        output_text.setText(arr[random.nextInt(5)]);
                        break;
                }
            }
        });
    }
}