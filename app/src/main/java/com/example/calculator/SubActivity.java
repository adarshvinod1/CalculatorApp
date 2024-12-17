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

public class SubActivity extends AppCompatActivity {
    EditText et3, et4;
    Button b7, b8;
    String getNum3, getNum4, sum2;
    int num3, num4, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        et3 = (EditText) findViewById(R.id.ae3);
        et4 = (EditText) findViewById(R.id.ae4);
        b7 = (Button) findViewById(R.id.g2);
        b8 = (Button) findViewById(R.id.btm2);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum3 = et3.getText().toString();
                getNum4 = et4.getText().toString();
                num3 = Integer.parseInt(getNum3);
                num4 = Integer.parseInt(getNum4);
                result2 = num3 - num4;
                sum2 = String.valueOf(result2);
                Toast.makeText(getApplicationContext(), sum2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}