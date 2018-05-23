package com.example.evan.languageapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 5/21/18.
 */

public class Question implements Parcelable {
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public static List<Question> generateLessonOneQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return questions;
    }

    public static List<Question> generateLessonTwoQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return questions;
    }

    public static List<Question> generateLessonThreeQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return questions;
    }

    public static List<Question> generateLessonFourQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return questions;
    }

    public static List<Question> generateLessonFiveQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return questions;
    }

    protected Question(Parcel in) {
        question = in.readString();
        answerA = in.readString();
        answerB = in.readString();
        answerC = in.readString();
        answerD = in.readString();
        correctAnswer = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(answerA);
        dest.writeString(answerB);
        dest.writeString(answerC);
        dest.writeString(answerD);
        dest.writeString(correctAnswer);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Question> CREATOR = new Parcelable.Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };
}