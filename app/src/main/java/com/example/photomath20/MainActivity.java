package com.example.photomath20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        EditText edit3 = findViewById(R.id.edit3);
        String s1 = edit1.getText().toString();
        String s2 = edit2.getText().toString();
        String s3 = edit3.getText().toString();
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = Double.parseDouble(s3);
        double D, x1, x2;
        String answer;
        if ((a == 0) && (b == 0) && (c == 0))
            answer = "R";
        else if (a == 0)
            answer = String.valueOf(-c/b);
        else {
            D = b*b-4*a*c;
            if (D < 0)
                answer = "Пустое множество";
            else if (D == 0)
                answer = String.valueOf(-b/2*a);
            else {
                answer = String.valueOf((-b + Math.sqrt(D))/2*a);
                answer += ", " + String.valueOf((-b - Math.sqrt(D))/2*a);
            }
        }
        TextView ans = findViewById(R.id.answer);
        ans.setText(answer);
    }
}