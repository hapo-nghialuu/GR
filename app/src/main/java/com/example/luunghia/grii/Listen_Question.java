package com.example.luunghia.grii;

import android.media.MediaPlayer;


public class Listen_Question {

    private MediaPlayer questionSound;
    private  String answer, option1, option2, option3;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public MediaPlayer getQuestionSound() {
        return questionSound;
    }

    public void setQuestionSound(MediaPlayer questionSound) {
        this.questionSound = questionSound;
    }

    public Listen_Question(MediaPlayer questionSound, String answer, String option1, String option2, String option3){
        this.answer = answer;
        this.questionSound = questionSound;
        this.option1 = option1;
        this.option2 = option2;
        this.option3= option3;
    }
}
