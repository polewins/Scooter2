package com.example.scooter;

public class Constant {

    public static final Lesson[] LESSONS = new Lesson[] {

            new Lesson(1, "Lesson 1: Rules of the Road",
                    "This lesson covers how to keep yourself and others safe while using e-scooters on roads.",
                    "* Private e-scooters are still illegal in the UK. E-scooters are only legal within trial areas.\n" +
                            "* E-scooters are required to have motor insurance, though for hired e-scooters, this will be provided through e-scooter rental operator.\n" +
                            "* You must carry at least a provisional driving licence to operate an e-scooter in the UK.\n" +
                            "* Helmets are recommended though are not a legal requirement.\n" +
                            "* E-scooters are allowed on roads (except motorways) and cycle lanes in the UK.\n" +
                            "* You should not use an e-scooter on pavements."),
            new Lesson(2, "Lesson 2: Starting Your Scooter", "This lesson will teach you how to get started with operating your e-scooter.","")
    };

    public static final Question[] QUESTIONS = new Question[] {

            new Question(1, "Question 1: You are not required to have your e-scooter insured within the UK.",
                    new String[] {"true", "false"}, 1),
            new Question(2, "Question 2: Where can e-scooters currently be operated within trial areas in the UK?",
                    new String[] {"All Roads", "Cycle Lanes", "Roads (excluding motorways)", "Pavements"}, 0),
            new Question(3, "Question 3: You are required to have at least a provisional driver’s licence to operate an e-scooter in the UK.",
                    new String[] {"true", "false"}, 0)
    };

    public static final Quiz[] QUIZZES = new Quiz[] {
            new Quiz(1, "Quiz 1: Rules of the Road", "Take the Rules of the Road quiz to pass to level 2!", new Question[] {QUESTIONS[0], QUESTIONS[1], QUESTIONS[2]}),
            new Quiz(2, "Quiz 2: Starting Your Scooter", "Take the Starting Your Scooter quiz to pass to level 2!", null)
    };
}
