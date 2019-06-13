package com.example.user.electricschool.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.electricschool.Model.Diagram;
import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderDiagram;

import java.util.ArrayList;

public class adapterRecyclerDiagram  extends RecyclerView.Adapter<viewHolderDiagram>
{

    private Context context;
    private ArrayList<Diagram> diagrams;

    public adapterRecyclerDiagram(Context context, ArrayList<Diagram> diagrams)
    {
        this.context = context;
        this.diagrams = diagrams;
    }

    @NonNull
    @Override
    public viewHolderDiagram onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_diagram, viewGroup,false);
        viewHolderDiagram viewHolderDiagram = new viewHolderDiagram(view);
        return viewHolderDiagram ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDiagram viewHolderDiagram, int position)
    {
        viewHolderDiagram.txtday.setText(diagrams.get(position).getTxtday().toString());
        viewHolderDiagram.txtSession1.setText(diagrams.get(position).getTxtSession1().toString());
        viewHolderDiagram.txtSession2.setText(diagrams.get(position).getTxtSession2().toString());
        viewHolderDiagram.txtSession3.setText(diagrams.get(position).getTxtSession3().toString());
        viewHolderDiagram.txtSession4.setText(diagrams.get(position).getTxtSession4().toString());
        viewHolderDiagram.txtSession5.setText(diagrams.get(position).getTxtSession5().toString());

    }

    @Override
    public int getItemCount()
    {
        return diagrams.size() ;
    }
}
