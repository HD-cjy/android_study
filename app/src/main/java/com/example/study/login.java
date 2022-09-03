package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button btn;
    private EditText id;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;
    }

    public login() {
        super();
    }

    private login activity;

    public void next(View v) {
        btn = findViewById(R.id.login);
        id = findViewById(R.id.id);
        password = findViewById(R.id.password);

        if (id.getText().toString().equals("") || id.getText().toString() == null) {
            Toast.makeText(login.this, "아이디를 입력해주세요", Toast.LENGTH_LONG).show();
        }
        else if (password.getText().toString().equals("") || password.getText().toString() == null) {
            Toast.makeText(login.this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(activity,calcmain.class);
            startActivity(intent);
        }
    }
}