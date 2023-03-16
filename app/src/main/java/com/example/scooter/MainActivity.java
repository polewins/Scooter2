package com.example.scooter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.ll_content);

        linearLayout.addView(newItemView(Constant.LESSONS[0].title, Constant.LESSONS[0].summary, "Start Lesson", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LessonActivity.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        }));
        linearLayout.addView(newItemView(Constant.QUIZZES[0].title, Constant.QUIZZES[0].summary, "Start Quiz", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        }));
        linearLayout.addView(newItemView(Constant.LESSONS[1].title, Constant.LESSONS[1].summary, "Lesson not yet unlocked", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));
        linearLayout.addView(newItemView(Constant.QUIZZES[1].title, Constant.QUIZZES[1].summary, "Quiz not yet unlocked", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));
    }

    private View newItemView(String text1, String text2, String text3, View.OnClickListener onClickListener) {
        View root = getLayoutInflater().inflate(R.layout.item_layout, null);
        TextView textView1 = root.findViewById(R.id.text1);
        TextView textView2 = root.findViewById(R.id.text2);
        Button button = root.findViewById(R.id.button);
        button.setText(text3);

        textView1.setText(text1);
        textView2.setText(text2);
        button.setOnClickListener(onClickListener);
        return root;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.all_list_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.login: {
                Intent intent = new Intent(MainActivity.this, SigninActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.profile: {

                break;
            }
        }
        return true;
    }
}