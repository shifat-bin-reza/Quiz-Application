package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Mathematics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);

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
        Button submit_btn = (Button) findViewById(R.id.submit_btn);
        TextView ans1 = (TextView) findViewById(R.id.tit_ans1);
        TextView ans2 = (TextView) findViewById(R.id.tit_ans2);
        TextView ans3 = (TextView) findViewById(R.id.tit_ans3);
        TextView ans4 = (TextView) findViewById(R.id.tit_ans4);
        TextView result = (TextView) findViewById(R.id.tit_result);
        TextView completed = (TextView) findViewById(R.id.tit_completed);
        TextView congrats = (TextView) findViewById(R.id.tit_congrats);
        EditText fill1 = (EditText) findViewById(R.id.fill1);

        ico_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mathematics.this, MainActivity2.class);
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
                    if(rb1.isChecked()){
                        count++;
                        rb1.setBackgroundColor(Color.GREEN);
                        rb1.setTextColor(Color.WHITE);
                        ans1.setText("Answer: Correct");
                    }else{
                        rb1.setBackgroundColor(Color.GREEN);
                        if(rb2.isChecked()){
                            rb2.setBackgroundColor(Color.RED);
                            rb2.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: A");
                        }else if(rb3.isChecked()){
                            rb3.setBackgroundColor(Color.RED);
                            rb3.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: A");
                        }else if(rb4.isChecked()){
                            rb4.setBackgroundColor(Color.RED);
                            rb4.setTextColor(Color.WHITE);
                            ans1.setText("Answer: Wrong! Correct answer is: A");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb5.isChecked()){
                        count++;
                        rb5.setBackgroundColor(Color.GREEN);
                        rb5.setTextColor(Color.WHITE);
                        rb5.setTextColor(Color.WHITE);
                        ans2.setText("Answer: Correct");
                    }else{
                        rb5.setBackgroundColor(Color.GREEN);
                        if(rb6.isChecked()){
                            rb6.setBackgroundColor(Color.RED);
                            rb6.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: A");
                        }else if(rb7.isChecked()){
                            rb7.setBackgroundColor(Color.RED);
                            rb7.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: A");
                        }else if(rb8.isChecked()){
                            rb8.setBackgroundColor(Color.RED);
                            rb8.setTextColor(Color.WHITE);
                            ans2.setText("Answer: Wrong! Correct answer is: A");
                        }
                    }
                }
                if(view.getId() == R.id.submit_btn){
                    if(rb10.isChecked()){
                        count++;
                        rb10.setBackgroundColor(Color.GREEN);
                        rb10.setTextColor(Color.WHITE);
                        rb10.setTextColor(Color.WHITE);
                        ans3.setText("Answer: Correct");
                    }else{
                        rb10.setBackgroundColor(Color.GREEN);
                        if(rb9.isChecked()){
                            rb9.setBackgroundColor(Color.RED);
                            rb9.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: B");
                        }else if(rb11.isChecked()){
                            rb11.setBackgroundColor(Color.RED);
                            rb11.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: B");
                        }else if(rb12.isChecked()){
                            rb12.setBackgroundColor(Color.RED);
                            rb12.setTextColor(Color.WHITE);
                            ans3.setText("Answer: Wrong! Correct answer is: B");
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

                String a = fill1.getText().toString();

                //Fill In The Blanks
                if(a.equals("7")){
                    count++;
                    fill1.setTextColor(Color.GREEN);
                }else{
                    fill1.setTextColor(Color.RED);
                }

                //Counting Result
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