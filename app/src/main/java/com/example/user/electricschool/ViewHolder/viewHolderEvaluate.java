package com.example.user.electricschool.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.electricschool.R;

public class viewHolderEvaluate extends RecyclerView.ViewHolder
{
    public TextView txtsubname;
    public TextView txtevaluate;

    public viewHolderEvaluate(View itemView)
    {
        super(itemView);
        txtsubname = (TextView)itemView.findViewById(R.id.txtsubname);
        txtevaluate = (TextView)itemView.findViewById(R.id.txtevaluate);

    }
}
