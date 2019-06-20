package com.example.user.electricschool.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.electricschool.Model.newDiagram;
import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderDiagram;

import java.util.ArrayList;

public class adapterRecyclerDiagram  extends RecyclerView.Adapter<viewHolderDiagram>
{

    private ArrayList<newDiagram> diagrams;

    public adapterRecyclerDiagram(Context context, ArrayList<newDiagram> diagrams)
    {
        Context context1 = context;
        this.diagrams = diagrams;
    }

    @NonNull
    @Override
    public viewHolderDiagram onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_diagram, viewGroup,false);
        return new viewHolderDiagram(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDiagram viewHolderDiagram, int position)
    {
//        viewHolderDiagram.txtday.setText(diagrams.get(position).getTxtday().toString());
//        viewHolderDiagram.txtSession1.setText(diagrams.get(position).getTxtSession1().toString());
//        viewHolderDiagram.txtSession2.setText(diagrams.get(position).getTxtSession2().toString());
//        viewHolderDiagram.txtSession3.setText(diagrams.get(position).getTxtSession3().toString());
//        viewHolderDiagram.txtSession4.setText(diagrams.get(position).getTxtSession4().toString());
//        viewHolderDiagram.txtSession5.setText(diagrams.get(position).getTxtSession5().toString());

        viewHolderDiagram.Time.setText(diagrams.get(position).getTime());
        viewHolderDiagram.Material.setText(diagrams.get(position).getMaterial());
        viewHolderDiagram.Location.setText(diagrams.get(position).getLocation());

    }

    @Override
    public int getItemCount()
    {
        return diagrams.size() ;
    }
}
