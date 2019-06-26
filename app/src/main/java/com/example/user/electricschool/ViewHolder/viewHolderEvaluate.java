package com.example.user.electricschool.ViewHolder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.electricschool.R;

public class viewHolderEvaluate extends RecyclerView.ViewHolder
{
    public TextView TxtTeacherName;
    public TextView TxtStudent_Dscripe;
    public ViewGroup linearLayoutDetails;
    public  ImageView imageViewExpand;
    public ImageView badges1;
    public static final int DURATION = 250;
    public viewHolderEvaluate(View itemView)
    {
        super(itemView);
        TxtTeacherName = (TextView)itemView.findViewById(R.id.txtTeacherName);
        TxtStudent_Dscripe = (TextView)itemView.findViewById(R.id.txtViewDetalis);
        linearLayoutDetails = itemView.findViewById(R.id.linearLayoutDetails);
        imageViewExpand = itemView.findViewById(R.id.imageViewExpand);
        badges1 = itemView.findViewById(R.id.imgbdg);
    }

    public void rotate(float angle) {
        Animation animation = new RotateAnimation(0.0f, angle, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setFillAfter(true);
        animation.setDuration(DURATION);
        imageViewExpand.startAnimation(animation);
    }
}
