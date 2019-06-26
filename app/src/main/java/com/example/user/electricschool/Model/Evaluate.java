package com.example.user.electricschool.Model;

public class Evaluate {

    String NameTeacher;
    String Descripation;

    public Evaluate(String nameTeacher, String descripation) {
        NameTeacher = nameTeacher;
        Descripation = descripation;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        NameTeacher = nameTeacher;
    }

    public String getDescripation() {
        return Descripation;
    }

    public void setDescripation(String descripation) {
        Descripation = descripation;
    }
}