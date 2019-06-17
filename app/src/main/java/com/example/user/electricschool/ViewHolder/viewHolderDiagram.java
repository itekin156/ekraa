package com.example.user.electricschool.ViewHolder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.electricschool.R;

public class viewHolderDiagram extends RecyclerView.ViewHolder
{
//    public TextView txtday;
//    public TextView txtSession1;
//    public TextView txtSession2;
//    public TextView txtSession3;
//    public TextView txtSession4;
//    public TextView txtSession5;

    public  TextView Time;
    public TextView Material;
    public TextView Location;

    public viewHolderDiagram(View itemView)
    {
        super(itemView);

        Time=itemView.findViewById(R.id.Time);
        Material=itemView.findViewById(R.id.Material);
        Location=itemView.findViewById(R.id.location);

//        txtday = (TextView)itemView.findViewById(R.id.txtday);
//        txtSession1 = (TextView)itemView.findViewById(R.id.txtSession1);
//        txtSession2 = (TextView)itemView.findViewById(R.id.txtSession2);
//        txtSession3 = (TextView)itemView.findViewById(R.id.txtSession3);
//        txtSession4 = (TextView)itemView.findViewById(R.id.txtSession4);
//        txtSession5 = (TextView)itemView.findViewById(R.id.txtSession5);

    }
}
