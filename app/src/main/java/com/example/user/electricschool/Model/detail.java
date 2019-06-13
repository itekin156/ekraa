package com.example.user.electricschool.Model;

public class detail
{

    private int imgSubdetail;
    private String nameSubdetail;
    private String nameTeacherdetail;

    public detail(int imgSubdetail, String nameSubdetail, String nameTeacherdetail)
    {
        this.imgSubdetail = imgSubdetail;
        this.nameSubdetail = nameSubdetail;
        this.nameTeacherdetail = nameTeacherdetail;
    }
    public int getImgSubdetail()
    {
        return imgSubdetail;
    }

    public void setImgSubdetail(int imgSubdetail)
    {
        this.imgSubdetail = imgSubdetail;
    }

    public String getNameSubdetail() {
        return nameSubdetail;
    }

    public void setNameSubdetail(String nameSubdetail)
    {
        this.nameSubdetail = nameSubdetail;
    }

    public String getNameTeacherdetail() {
        return nameTeacherdetail;
    }

    public void setNameTeacherdetail(String nameTeacherdetail)
    {
        this.nameTeacherdetail = nameTeacherdetail;
    }
}
