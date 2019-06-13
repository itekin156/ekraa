package com.example.user.electricschool.Model;

public class Mark
{

    private int imgSub;
    private String nameSub;
    private int Quiz1;
    private int Quiz2;
    private int Exam;

    public Mark(int imgSub, String nameSub, int quiz1, int quiz2, int exam) {
        this.imgSub = imgSub;
        this.nameSub = nameSub;
        Quiz1 = quiz1;
        Quiz2 = quiz2;
        Exam = exam;
    }

    public int getImgSub() {
        return imgSub;
    }

    public void setImgSub(int imgSub) {
        this.imgSub = imgSub;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    public int getQuiz1() {
        return Quiz1;
    }

    public void setQuiz1(int quiz1) {
        Quiz1 = quiz1;
    }

    public int getQuiz2() {
        return Quiz2;
    }

    public void setQuiz2(int quiz2) {
        Quiz2 = quiz2;
    }

    public int getExam() {
        return Exam;
    }

    public void setExam(int exam) {
        Exam = exam;
    }

}
