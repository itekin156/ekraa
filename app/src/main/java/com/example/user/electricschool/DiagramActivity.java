package com.example.user.electricschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.user.electricschool.Adapter.adapterRecyclerDiagram;
import com.example.user.electricschool.Model.Diagram;
import com.example.user.electricschool.Model.newDiagram;

import java.util.ArrayList;

public class DiagramActivity extends AppCompatActivity {
    Animation show, hide;
    private ArrayList<newDiagram> diagrams;
    private RecyclerView recyclerediagram;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ConstraintLayout constraintLayout;
    NestedScrollView nestedScrollView;
    private Button allSchedual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagram);
        constraintLayout = findViewById(R.id.constrantLayout);
        recyclerediagram = findViewById(R.id.recyclerDiagram);
        diagrams = new ArrayList<>();
        allSchedual = findViewById(R.id.allSchedulao);
        allSchedual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllDaigramActivity.class);
                startActivity(intent);
            }
        });
// For animation style
        show = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show);
        hide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.hide);

        diagrams.add(new newDiagram("08:00", "Art", "class1"));
        diagrams.add(new newDiagram("09:45", "Art", "class1"));
        diagrams.add(new newDiagram("11:30", "Art", "class1"));
        diagrams.add(new newDiagram("01:15", "Art", "class1"));
        diagrams.add(new newDiagram("3:00", "Art", "class1"));


        nestedScrollView = findViewById(R.id.nestedscrolView);
        nestedScrollView.fullScroll(View.FOCUS_UP);
        nestedScrollView.smoothScrollTo(0, 0);
        nestedScrollView.getParent().requestChildFocus(nestedScrollView, nestedScrollView);
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                int x = nestedScrollView.getScrollX();
                int y = nestedScrollView.getScrollY();
                if (y > x) {
//                    constraintLayout.setAnimation(hide);
                    constraintLayout.setVisibility(View.INVISIBLE);
                } else {

//                    constraintLayout.setAnimation(show);
                    constraintLayout.setVisibility(View.VISIBLE);

                }

            }
        });
        recyclerediagram.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerediagram.setLayoutManager(layoutManager);
        adapter = new adapterRecyclerDiagram(this, diagrams);
        recyclerediagram.setAdapter(adapter);
    }
}
