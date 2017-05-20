package com.example.luunghia.grii;


public class Game_Question {

    public Game_Question(int questionImage, String answer, String option1, String option2, String option3){
        this.answer = answer;
        this.questionImage = questionImage;
        this.option1 = option1;
        this.option2 = option2;
        this.option3= option3;
    }

    private  int questionImage;
    private  String answer, option1, option2, option3;

    public int getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(int questionImage) {
        this.questionImage = questionImage;
    }

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

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

}
