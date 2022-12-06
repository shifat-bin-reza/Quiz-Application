package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn_go_back = (Button) findViewById(R.id.btn_go_back);
        Button btn_mathematics = (Button) findViewById(R.id.topic1);
        Button btn_c_programming = (Button) findViewById(R.id.topic2);
        Button btn_social_science = (Button) findViewById(R.id.topic3);

        btn_go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Mathematics.class);
                startActivity(intent);
            }
        });

        btn_c_programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Programming.class);
                startActivity(intent);
            }
        });

        btn_social_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Social_Science.class);
                startActivity(intent);
            }
        });
    }
}