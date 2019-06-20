package com.example.user.electricschool.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.electricschool.Model.Mark;
import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderMark;

import java.util.ArrayList;

public class adapterRecyclerMark extends RecyclerView.Adapter<viewHolderMark>
{
    private ArrayList<Mark> marks;

    public adapterRecyclerMark(Context context, ArrayList<Mark> marks)
    {
        Context context1 = context;
        this.marks = marks;
    }


    @NonNull
    @Override
    public viewHolderMark onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {

        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mark, viewGroup,false);
        viewHolderMark viewholdermark = new viewHolderMark(view);
        return viewholdermark;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderMark viewHolderMark, int position)
    {

        viewHolderMark.txtNameSub.setText(marks.get(position).getNameSub());
        viewHolderMark.imgSub.setImageResource(marks.get(position).getImgSub());
        viewHolderMark.txtQuiz1.setText(marks.get(position).getQuiz1()+"");
        viewHolderMark.txtQuiz2.setText(marks.get(position).getQuiz2()+"");
        viewHolderMark.txtExam.setText(marks.get(position).getExam()+"");


    }

    @Override
    public int getItemCount() {
        return marks.size();
    }
}
