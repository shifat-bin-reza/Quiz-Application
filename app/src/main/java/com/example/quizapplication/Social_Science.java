package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Social_Science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_science);

        ImageButton ico_cross = (ImageButton) findViewById(R.id.ico_cross);
        RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.rb4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.rb5);
        RadioButton rb6 = (RadioButton) findViewById(R.id.rb6);
        RadioButton rb7 = (RadioButton) findViewById(R.id.rb7);
        RadioButton rb8 = (RadioButton) findViewById(R.id.rb8);
        RadioButton rb9 = (RadioButton) findViewById(R.id.rb9);
        RadioButton rb10 = (RadioButton) findViewById(R.id.rb10);
        RadioButton rb11 = (RadioButton) findViewById(R.id.rb11);
        RadioButton rb12 = (RadioButton) findViewById(R.id.rb12);
        RadioButton rb13 = (RadioButton) findViewById(R.id.rb13);
        RadioButton rb14 = (RadioButton) findViewById(R.id.rb14);
        RadioButton rb15 = (RadioButton) findViewById(R.id.rb15);
        RadioButton rb16 = (RadioButton) findViewById(R.id.rb16);
        RadioButton rb17 = (RadioButton) findViewById(R.id.rb17);
        RadioButton rb18 = (RadioButton) findViewById(R.id.rb18);
        RadioButton rb19 = (RadioButton) findViewById(R.id.rb19);
        RadioButton rb20 = (RadioButton) findViewById(R.id.rb20);
        Button submit_btn = (Button) findViewById(R.id.submit_btn);
        TextView ans1 = (TextView) findViewById(R.id.tit_ans1);
        TextView ans2 = (TextView) findViewById(R.id.tit_ans2);
        TextView ans3 = (TextView) findViewById(R.id.tit_ans3);
        TextView ans4 = (TextView) findViewById(R.id.tit_ans4);
        TextView ans5 = (TextView) findViewById(R.id.tit_ans5);
        TextView result = (TextView) findViewById(R.id.tit_result);
        TextView completed = (TextView) findViewById(R.id.tit_completed);
        TextView congrats = (TextView) findViewById(R.id.tit_congrats);

        ico_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Social_Science.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        if (rb2.isChecked()){
            rb1.setBackgroundColor(Color.WHITE);
        }

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double count = 0;
                if(view.getId() == R.id.submit_btn){
                    if(rb2.isChecked()){
                        count++;
                        rb2.setBackgroundColor(Color.GREEN);
                        rb2.setTextColor(Color.WHITE);
                        rb2.setTextColor(Color.WHITE);
                        ans1.setText("Answer: Correct");
                    }else{
                        rb2.setBackgroundColor(Color.GREEN);
                        if(rb1.isChecked()){
                            rb1.setBackgroundColor(Color.RED);
                            rb1.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: B");
                        }else if(rb3.isChecked()){
                            rb3.setBackgroundColor(Color.RED);
                            rb3.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: B");
                        }else if(rb4.isChecked()){
                            rb4.setBackgroundColor(Color.RED);
                            rb4.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: B");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb7.isChecked()){
                        count++;
                        rb7.setBackgroundColor(Color.GREEN);
                        rb7.setTextColor(Color.WHITE);
                        rb7.setTextColor(Color.WHITE);
                        ans2.setText("Answer: Correct");
                    }else{
                        rb7.setBackgroundColor(Color.GREEN);
                        if(rb6.isChecked()){
                            rb6.setBackgroundColor(Color.RED);
                            rb6.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: C");
                        }else if(rb5.isChecked()){
                            rb5.setBackgroundColor(Color.RED);
                            rb5.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: C");
                        }else if(rb8.isChecked()){
                            rb8.setBackgroundColor(Color.RED);
                            rb8.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: C");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb11.isChecked()){
                        count++;
                        rb11.setBackgroundColor(Color.GREEN);
                        rb11.setTextColor(Color.WHITE);
                        rb11.setTextColor(Color.WHITE);
                        ans3.setText("Answer: Correct");
                    }else{
                        rb11.setBackgroundColor(Color.GREEN);
                        if(rb9.isChecked()){
                            rb9.setBackgroundColor(Color.RED);
                            rb9.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: C");
                        }else if(rb10.isChecked()){
                            rb10.setBackgroundColor(Color.RED);
                            rb10.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: C");
                        }else if(rb12.isChecked()){
                            rb12.setBackgroundColor(Color.RED);
                            rb12.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: C");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb16.isChecked()){
                        count++;
                        rb16.setBackgroundColor(Color.GREEN);
                        rb16.setTextColor(Color.WHITE);
                        rb16.setTextColor(Color.WHITE);
                        ans4.setText("Answer: Correct");
                    }else{
                        rb16.setBackgroundColor(Color.GREEN);
                        if(rb13.isChecked()){
                            rb13.setBackgroundColor(Color.RED);
                            rb13.setTextColor(Color.WHITE);
                            ans4.setText("Answer: Wrong! Correct answer is: D");
                        }else if(rb14.isChecked()){
                            rb14.setBackgroundColor(Color.RED);
                            rb14.setTextColor(Color.WHITE);
                            ans4.setText("Answer: Wrong! Correct answer is: D");
                        }else if(rb15.isChecked()){
                            rb15.setBackgroundColor(Color.RED);
                            rb15.setTextColor(Color.WHITE);
                            ans4.setText("Answer: Wrong! Correct answer is: D");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb20.isChecked()){
                        count++;
                        rb20.setBackgroundColor(Color.GREEN);
                        rb20.setTextColor(Color.WHITE);
                        rb20.setTextColor(Color.WHITE);
                        ans5.setText("Answer: Correct");
                    }else{
                        rb20.setBackgroundColor(Color.GREEN);
                        if(rb17.isChecked()){
                            rb17.setBackgroundColor(Color.RED);
                            rb17.setTextColor(Color.WHITE);
                            ans5.setText("Answer: Wrong! Correct answer is: D");
                        }else if(rb18.isChecked()){
                            rb18.setBackgroundColor(Color.RED);
                            rb18.setTextColor(Color.WHITE);
                            ans5.setText("Answer: Wrong! Correct answer is: D");
                        }else if(rb19.isChecked()){
                            rb19.setBackgroundColor(Color.RED);
                            rb19.setTextColor(Color.WHITE);
                            ans5.setText("Answer: Wrong! Correct answer is: D");
                        }
                    }
                }
                double isPass = ((count*2.0)/10.0)*100.0;
                if(isPass < 80) {
                    congrats.setText("Better luck next time!");
                    result.setTextColor(Color.RED);
                } else{
                    congrats.setText("Congrats!");
                }
                result.setText((int)isPass + "% Score");
                completed.setVisibility(View.VISIBLE);

                submit_btn.setEnabled(false);
                submit_btn.setBackgroundColor(Color.GRAY);
            }
        });

    }
}