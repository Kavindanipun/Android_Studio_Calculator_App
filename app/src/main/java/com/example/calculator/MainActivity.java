package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    EditText value1,value2;
    TextView text4;

    float result;
    int num1,num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        value1=findViewById(R.id.value1);
        value2=findViewById(R.id.value2);
        text4=findViewById(R.id.text4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(value1.getText().toString());
                num2=Integer.parseInt(value2.getText().toString());
                result=num1+num2;
                text4.setText(String.valueOf(result));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(value1.getText().toString());
                num2=Integer.parseInt(value2.getText().toString());
                result=num1+num2;
                text4.setText(String.valueOf(result));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(value1.getText().toString());
                num2=Integer.parseInt(value2.getText().toString());
                result=num1-num2;
                text4.setText((String.valueOf(result)));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(value1.getText().toString());
                num2=Integer.parseInt(value2.getText().toString());
                result=num1*num2;
                text4.setText(String.valueOf(result));

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(value1.getText().toString());
                num2=Integer.parseInt(value2.getText().toString());
                result=num1/num2;
                text4.setText(String.valueOf(result));
            }
        });

    }
}