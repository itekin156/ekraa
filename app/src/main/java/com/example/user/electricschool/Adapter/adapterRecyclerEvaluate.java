package com.example.user.electricschool.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Toast;

import com.example.user.electricschool.ExpandAndCollapseViewUtil;
import com.example.user.electricschool.Model.Evaluate;
import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderEvaluate;

import java.util.ArrayList;

import static com.example.user.electricschool.ViewHolder.viewHolderEvaluate.DURATION;

public class adapterRecyclerEvaluate extends RecyclerView.Adapter<viewHolderEvaluate> {

    private ArrayList<Evaluate> evaluats;

    public adapterRecyclerEvaluate(Context context, ArrayList<Evaluate> evaluats) {
        Context context1 = context;

        this.evaluats = evaluats;
    }


    @NonNull
    @Override
    public viewHolderEvaluate onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_evaluation, viewGroup, false);
        return new viewHolderEvaluate(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final viewHolderEvaluate viewHolderEvaluate, final int position) {


        viewHolderEvaluate.TxtTeacherName.setText(evaluats.get(position).getNameTeacher());
        viewHolderEvaluate.TxtStudent_Dscripe.setText(evaluats.get(position).getDescripation());
        viewHolderEvaluate.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (viewHolderEvaluate.linearLayoutDetails.getVisibility() == View.GONE) {
                        ExpandAndCollapseViewUtil.expand(viewHolderEvaluate.linearLayoutDetails, DURATION);
                        viewHolderEvaluate. imageViewExpand.setImageResource(R.drawable.more);
                        viewHolderEvaluate.rotate(-180.0f);
                        viewHolderEvaluate.badges1.setVisibility(View.INVISIBLE);
                    } else {
                        ExpandAndCollapseViewUtil.collapse(viewHolderEvaluate.linearLayoutDetails, DURATION);
                        viewHolderEvaluate. imageViewExpand.setImageResource(R.drawable.less);
                        viewHolderEvaluate.rotate(180.0f);
                    }




            }
        });

    }

    @Override
    public int getItemCount() {
        return evaluats.size();
    }
}
