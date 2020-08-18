package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);

    }

    public void OnClickButton(View view){

                    Intent intent = new Intent(this, SecondActivity.class);

                    intent.putExtra("n1", editText1.getText().toString());
                    intent.putExtra("n2", editText2.getText().toString());

                    Toast.makeText(this, "You just clicked the OK button", Toast.LENGTH_SHORT).show();

                    startActivity(intent);
                }
}