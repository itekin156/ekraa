package com.example.user.electricschool.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.electricschool.Model.Evaluate;
import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderEvaluate;

import java.util.ArrayList;

public class adapterRecyclerEvaluate extends RecyclerView.Adapter<viewHolderEvaluate>
{

    private Context context;
    private ArrayList<Evaluate> evaluats;

    public adapterRecyclerEvaluate(Context context, ArrayList<Evaluate> evaluats)
    {
        this.context = context;
        this.evaluats = evaluats;
    }




    @NonNull
    @Override
    public viewHolderEvaluate onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_evaluation, viewGroup,false);
        viewHolderEvaluate viewholderevaluate = new viewHolderEvaluate(view);
        return viewholderevaluate ;
    }



    @Override
    public void onBindViewHolder(@NonNull viewHolderEvaluate viewHolderEvaluate, int position) {


        viewHolderEvaluate.txtsubname.setText(evaluats.get(position).getNamesub().toString());
        viewHolderEvaluate.txtevaluate.setText(evaluats.get(position).getEvaluateteach().toString());


    }

    @Override
    public int getItemCount() {
        return evaluats.size();
    }
}
