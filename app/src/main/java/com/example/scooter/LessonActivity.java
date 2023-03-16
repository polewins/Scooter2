package com.example.scooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        LinearLayout root = findViewById(R.id.root);
        int id = getIntent().getIntExtra("id", 0);
        Lesson lesson = Constant.LESSONS[id];

        root.addView(newItemView(lesson.title, lesson.summary ,"", null));

        root.addView(newItemView("", lesson.detail, "Start Quiz", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LessonActivity.this, QuizActivity.class);
                startActivity(intent);
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
        if (TextUtils.isEmpty(text1)) {
            textView1.setVisibility(View.GONE);
        }
        if (TextUtils.isEmpty(text3)) {
            button.setVisibility(View.GONE);
        }
        return root;
    }
}