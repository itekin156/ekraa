package com.example.user.electricschool.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.electricschool.R;

public class viewHolderMark extends RecyclerView.ViewHolder
{

    public ImageView imgSub;
    public TextView txtNameSub;
    public TextView txtQuiz1;
    public TextView txtQuiz2;
    public TextView txtExam;

    public viewHolderMark(@NonNull View v)
    {
        super(v);
        imgSub =(ImageView)v.findViewById(R.id.imageSub);
        txtQuiz1 =(TextView)v.findViewById(R.id.Quiz1);
        txtQuiz2 =(TextView)v.findViewById(R.id.Quiz2);
        txtExam =(TextView)v.findViewById(R.id.Quiz3);
        txtNameSub =(TextView)v.findViewById(R.id.nameSub);
    }

}
