package com.example.user.electricschool.Model;

public class Diagram
{
    private String txtday;
    private String txtSession1;
    private String txtSession2;
    private String txtSession3;
    private String txtSession4;
    private String txtSession5;

    public Diagram(String txtday, String txtSession1, String txtSession2, String txtSession3, String txtSession4, String txtSession5) {
        this.txtday = txtday;
        this.txtSession1 = txtSession1;
        this.txtSession2 = txtSession2;
        this.txtSession3 = txtSession3;
        this.txtSession4 = txtSession4;
        this.txtSession5 = txtSession5;
    }

    public String getTxtday() {
        return txtday;
    }

    public void setTxtday(String txtday) {
        this.txtday = txtday;
    }

    public String getTxtSession1() {
        return txtSession1;
    }

    public void setTxtSession1(String txtSession1) {
        this.txtSession1 = txtSession1;
    }

    public String getTxtSession2() {
        return txtSession2;
    }

    public void setTxtSession2(String txtSession2) {
        this.txtSession2 = txtSession2;
    }

    public String getTxtSession3() {
        return txtSession3;
    }

    public void setTxtSession3(String txtSession3) {
        this.txtSession3 = txtSession3;
    }

    public String getTxtSession4() {
        return txtSession4;
    }

    public void setTxtSession4(String txtSession4) {
        this.txtSession4 = txtSession4;
    }

    public String getTxtSession5() {
        return txtSession5;
    }

    public void setTxtSession5(String txtSession5) {
        this.txtSession5 = txtSession5;
    }
}
