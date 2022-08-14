package com.example.study;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/*
public class MainActivity extends AppCompatActivity {
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//            TextView tv = findViewById(R.id.tv);
//
//            Random random = new Random();
//            String[] arr ={"가","나","다","라","마"};
//            tv.setText(arr[random.nextInt(5)]);
        edit = (EditText) findViewById(R.id.et);
        text = (TextView) findViewById(R.id.tv);

        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View view) {
        text.setText(edit.getText());
    }

}
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit = (EditText) findViewById(R.id.et);
        final TextView text = (TextView) findViewById(R.id.tv);

        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(edit.getText());
            }
        });

    }

}
