package com.example.scooter;

public class Question {
    int id;
    String title;
    String[] options;
    int correctOption;

    public Question(int id, String title, String[] options, int correctOption) {
        this.id = id;
        this.title = title;
        this.options = options;
        this.correctOption = correctOption;
    }
}
