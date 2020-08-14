package com.example.button_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd1, btnAdd2, btnAdd3, btnAdd4;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("계산기");

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);

        btnAdd1 = (Button) findViewById(R.id.btnAdd1);
        btnAdd2 = (Button) findViewById(R.id.btnAdd2);
        btnAdd3 = (Button) findViewById(R.id.btnAdd3);
        btnAdd4 = (Button) findViewById(R.id.btnAdd4);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd1.setOnTouchListener(new View.OnTouchListener(){ //더하기
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산 결과는 " +result.toString() +"입니다");

                return false;
            }
        });

        btnAdd2.setOnTouchListener(new View.OnTouchListener(){ //빼기
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText("계산 결과는 " +result.toString() +"입니다");

                return false;
            }
        });

        btnAdd3.setOnTouchListener(new View.OnTouchListener(){ //곱하기
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산 결과는 " +result.toString() +"입니다");

                return false;
            }
        });

        btnAdd4.setOnTouchListener(new View.OnTouchListener(){ //나누기
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                double num3 = Double.parseDouble(edit1.getText().toString());
                double num4 = Double.parseDouble(edit2.getText().toString());

               double result2 = num3 /num4;
                textResult.setText("계산 결과는 " +result2 +"입니다");

                return false;
            }
        });

    }



}
