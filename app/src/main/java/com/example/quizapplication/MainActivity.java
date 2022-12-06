package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    EditText hit_name, hit_email, hit_password;
    DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hit_name = (EditText) findViewById(R.id.hit_name);
        hit_email = (EditText) findViewById(R.id.hit_email);
        hit_password = (EditText) findViewById(R.id.hit_password);
        Button btn_login = (Button) findViewById(R.id.btn_login);

        database = FirebaseDatabase.getInstance().getReference("key");

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { save(); }
        });
    }

    private void save(){
        String name = hit_name.getText().toString().trim();
        String email = hit_email.getText().toString().trim();
        String password = hit_password.getText().toString().trim();

        if(name.matches("")){
            Toast.makeText(getApplicationContext(), "Please enter your username", Toast.LENGTH_LONG).show();
            return;
        }
        if(email.matches("")){
            Toast.makeText(getApplicationContext(), "Please enter your email", Toast.LENGTH_LONG).show();
            return;
        }
        if(password.matches("")){
            Toast.makeText(getApplicationContext(), "Please enter your password", Toast.LENGTH_LONG).show();
            return;
        }
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        intent.putExtra("RED", name);
        startActivity(intent);

        String key = database.push().getKey();
        information m = new information(name, email, password);
        database.child(key).setValue(m);

        Toast.makeText(getApplicationContext(), "Registration Completed Successfully!", Toast.LENGTH_LONG).show();
    }
}