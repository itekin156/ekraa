package com.example.user.electricschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.electricschool.Adapter.adapterRecyclerDiagram;
import com.example.user.electricschool.Adapter.adapterRecyclerEvaluate;
import com.example.user.electricschool.Model.Diagram;
import com.example.user.electricschool.Model.Evaluate;

import java.util.ArrayList;

public class DiagramActivity extends AppCompatActivity
{

    private ArrayList<Diagram> diagrams;
    private RecyclerView recyclerediagram;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagram);

        recyclerediagram = findViewById(R.id.recyclerDiagram);
        diagrams = new ArrayList<>();


        diagrams.add(new Diagram("Sunday:","Art ", "Arabic ","Seince ", "Music ", "Arabic "));
        diagrams.add(new Diagram("Monday:","Art ", "Arabic ","Seince ", "Music ", "Arabic "));
        diagrams.add(new Diagram("tusday:","Art ", "Arabic ","Seince ", "Music ", "Arabic "));
        diagrams.add(new Diagram("wedday:","Art ", "Arabic ","Seince ", "Music ", "Arabic "));
        diagrams.add(new Diagram("thusday:","Art ", "Arabic ","Seince ", "Music ", "Arabic "));


        recyclerediagram.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerediagram.setLayoutManager(layoutManager);
        adapter = new adapterRecyclerDiagram(this , diagrams);
        recyclerediagram.setAdapter(adapter);
    }
}
