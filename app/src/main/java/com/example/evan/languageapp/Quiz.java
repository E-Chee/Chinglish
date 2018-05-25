package com.example.evan.languageapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 5/21/18.
 */

public class Quiz implements Parcelable {
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

    public Quiz(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public static List<Quiz> generateLessonOneQuestions() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("What is the character for wǒ?", "你", "我", "嗎", "是", "B"));
        quizzes.add(new Quiz("What is the difference between 我 and 你?", "你 means you and 我 means me","你 means me and 我 means you","你 can mean me or you but in singular form while 我 is the plural form", "你 is the plural form of me or you while 我 is the singular form","A"));
        quizzes.add(new Quiz("In a sentence listing three nouns, how many 和s would there be?","1","2","3","4","A"));
        quizzes.add(new Quiz("If you were to translate the phrase \"Tom's cat\", where would the \"的\" go?","Before \"Tom\"","After \"Tom\"","After \"cat\"","None of the above","B"));
        quizzes.add(new Quiz("Which of the following is the correct placement of \"嗎\" in a question?","你嗎好","嗎你好","嗎你好嗎","你好嗎","D"));
        quizzes.add(new Quiz("Which of these characters is not a noun?","我","她","他","是","D"));
        quizzes.add(new Quiz("Which of the following phrases don't make any sense?","是的","是嗎","是你","是不","C"));
        quizzes.add(new Quiz("Which phrase says \"He and I\"","他和我","她和我","也和我","我和她","A"));
        quizzes.add(new Quiz("Which of these words has two tones for the same definition?","好","你","她","不","D"));
        quizzes.add(new Quiz("What is the function of the character \"和\"?","connect adjective","connect nouns","both a and b","none of the above","B"));
        return quizzes;
    }

    public static List<Quiz> generateLessonTwoQuestions() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return quizzes;
    }

    public static List<Quiz> generateLessonThreeQuestions() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return quizzes;
    }

    public static List<Quiz> generateLessonFourQuestions() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return quizzes;
    }

    public static List<Quiz> generateLessonFiveQuestions() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("What is a door?", "an entryway", "a thing to smash", "blah", "blahblah", "blah"));
        return quizzes;
    }

    protected Quiz(Parcel in) {
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
    public static final Parcelable.Creator<Quiz> CREATOR = new Parcelable.Creator<Quiz>() {
        @Override
        public Quiz createFromParcel(Parcel in) {
            return new Quiz(in);
        }

        @Override
        public Quiz[] newArray(int size) {
            return new Quiz[size];
        }
    };
}