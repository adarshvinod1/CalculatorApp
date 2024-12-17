package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity extends AppCompatActivity {
    EditText et7,et8;
    Button b11,b12;

    String getNum7,getNum8,sum4;
    int num7,num8,result4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        et7 = (EditText) findViewById(R.id.ae7);
        et8 = (EditText) findViewById(R.id.ae8);
        b11 = (Button) findViewById(R.id.g4);
        b12 = (Button) findViewById(R.id.btm4);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum7 = et7.getText().toString();
                getNum8 = et8.getText().toString();
                num7 = Integer.parseInt(getNum7);
                num8 = Integer.parseInt(getNum8);
                result4 = num7 / num8;
                sum4 = String.valueOf(result4);
                Toast.makeText(getApplicationContext(), sum4, Toast.LENGTH_SHORT).show();
            }
        });
    }
}