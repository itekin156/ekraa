package com.example.user.electricschool.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.electricschool.R;

public class viewHolderDiagram extends RecyclerView.ViewHolder
{
    public TextView txtday;
    public TextView txtSession1;
    public TextView txtSession2;
    public TextView txtSession3;
    public TextView txtSession4;
    public TextView txtSession5;

    public viewHolderDiagram(View itemView)
    {
        super(itemView);
        txtday = (TextView)itemView.findViewById(R.id.txtday);
        txtSession1 = (TextView)itemView.findViewById(R.id.txtSession1);
        txtSession2 = (TextView)itemView.findViewById(R.id.txtSession2);
        txtSession3 = (TextView)itemView.findViewById(R.id.txtSession3);
        txtSession4 = (TextView)itemView.findViewById(R.id.txtSession4);
        txtSession5 = (TextView)itemView.findViewById(R.id.txtSession5);

    }
}
