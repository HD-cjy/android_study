package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calcmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcmain);
        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_plus = findViewById(R.id.btn_plus);
        Button btn_miners = findViewById(R.id.btn_miners);
        Button btn_multiply = findViewById(R.id.btn_multiply);
        Button btn_divide = findViewById(R.id.btn_divide);
        Button btn_result = findViewById(R.id.btn_result);
        Button btn_back_space = findViewById(R.id.btn_back_space);
        Button btn_clear = findViewById(R.id.btn_clear);
        Button btn_clear_entry = findViewById(R.id.btn_clear_entry);
        Button btn_dot = findViewById(R.id.btn_dot);
        TextView main = findViewById(R.id.main);
        TextView text_timeline = findViewById(R.id.text_timeline);


    }
}

/*




        final Map<String, String> calc = new HashMap<String, String>();
        calc.put("reset", "N");

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), ((Button) v).getText(), Toast.LENGTH_SHORT).show();

                String text = "";

                // 숫자라면 input
                if ( !((Button) v).getText().equals("+")
                        && !((Button) v).getText().equals("-")
                        && !((Button) v).getText().equals("/")
                        && !((Button) v).getText().equals("*")
                        && !((Button) v).getText().equals("=")) {

                    if ( calc.get("reset").equals("Y") ) {
                        calc.put("reset", "N");
                        calc.put("number1", "");
                        calc.put("operation", "");

                        text = (String) ((Button) v).getText();
                        textView.setText( Integer.parseInt(text) + "" );
                    }
                    else {
                        text = (String) textView.getText();
                        text += ((Button) v).getText();

                        textView.setText( Integer.parseInt(text) + "" );
                    }
                }

                // 연산자라면 연산자와 이전에 입력한 숫자 input
                if ( ((Button) v).getText().equals("+")
                        || ((Button) v).getText().equals("-")
                        || ((Button) v).getText().equals("/")
                        || ((Button) v).getText().equals("*")) {
                    calc.put("operation", (String) ((Button) v).getText());
                    calc.put("number1", (String) textView.getText());
                    textView.setText( "0" );
                }

                // = 이퀄 시 연산
                if ( ((Button) v).getText().equals("=") ) {
                    int number1 = Integer.parseInt(calc.get("number1"));
                    int number2 = Integer.parseInt((String) textView.getText());

                    int result = 0;

                    // 연산자에 따른 연산 처리
                    if ( calc.get("operation").equals("+") ) {
                        result = number1 + number2;
                    }
                    else if ( calc.get("operation").equals("-") ) {
                        result = number1 - number2;
                    }
                    else if ( calc.get("operation").equals("*") ) {
                        result = number1 * number2;
                    }
                    else if ( calc.get("operation").equals("/") ) {
                        double divResult = number1 / number2;
                        result = (int) divResult;
                    }

                    // 리셋 값 (결과 시)
                    calc.put("reset", "Y");

                    textView.setText( result + "" );
                }
            }
        };

        btn0.setOnClickListener(clickListener);
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btnAdd.setOnClickListener(clickListener);
        btnSub.setOnClickListener(clickListener);
        btnMul.setOnClickListener(clickListener);
        btnDiv.setOnClickListener(clickListener);
        btnEqual.setOnClickListener(clickListener);
    }
}*/