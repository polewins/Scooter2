package com.example.scooter;

public class Quiz {
    int id;
    String title;
    String summary;
    Question[] questions;

    public Quiz(int id, String title, String summary, Question[] questions) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.questions = questions;
    }
}
