package com.example.scooter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        RadioButton radioButton1 = findViewById(R.id.radio1);
        RadioButton radioButton2 = findViewById(R.id.radio2);
        RadioButton radioButton3 = findViewById(R.id.radio3);
        RadioButton radioButton4 = findViewById(R.id.radio4);
        RadioButton radioButton5 = findViewById(R.id.radio5);
        RadioButton radioButton6 = findViewById(R.id.radio6);
        RadioButton radioButton7 = findViewById(R.id.radio7);
        RadioButton radioButton8 = findViewById(R.id.radio8);
        Button button = findViewById(R.id.button);

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioButton5.setChecked(false);
                    radioButton6.setChecked(false);
                }
            }
        });
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioButton5.setChecked(false);
                    radioButton6.setChecked(false);
                }
            }
        });
        radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioButton3.setChecked(false);
                    radioButton4.setChecked(false);
                }
            }
        });
        radioButton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioButton3.setChecked(false);
                    radioButton4.setChecked(false);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = "";
                String summary = "";
                if (radioButton2.isChecked() && radioButton3.isChecked() && radioButton7.isChecked()) {
                    title = "Congratulations! You passed!";
                    summary = "Congratulations, you passed Lesson 1: Rules of the Road. Please carry on to Lesson 2.";
                } else {
                    title = "You failed this quiz.";
                    summary = "Unfortunately you did not pass this quiz. Please reread Lesson 1: Rules of the Road and then retake this quiz";
                }

                View view = getLayoutInflater().inflate(R.layout.item_layout, null);
                TextView textView1 = view.findViewById(R.id.text1);
                TextView textView2 = view.findViewById(R.id.text2);
                view.findViewById(R.id.button).setVisibility(View.GONE);

                textView1.setText(title);
                textView2.setText(summary);
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
                builder.setView(view).show();

            }
        });
    }
}