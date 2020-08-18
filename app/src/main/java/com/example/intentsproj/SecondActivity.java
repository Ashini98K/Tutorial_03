package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    String num1;
    String num2;

    TextView sum;

    int n1, n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 = findViewById(R.id.n1);
        editText2 = findViewById(R.id.n2);
        sum = findViewById(R.id.textView6);

        Intent intent = getIntent();

        num1 = intent.getStringExtra("n1");
        num2 = intent.getStringExtra("n2");

        editText1.setText(num1);
        editText2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public  void add(View view){
        sum.setText(num1 + "+" + num1 + "=" + "n1+n2");
    }
    public  void sub(View view){
        sum.setText(num1 + "-" + num1 + "=" + "n1-n2");
    }
    public  void multi(View view){
        sum.setText(num1 + "*" + num1 + "=" + "n1*n2");
    }
    public  void div(View view){
        sum.setText(num1 + "/" + num1 + "=" + "n1/n2");
    }

}