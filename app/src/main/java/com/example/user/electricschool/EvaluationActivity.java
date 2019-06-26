package com.example.user.electricschool;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.user.electricschool.Adapter.adapterRecyclerDiagram;
import com.example.user.electricschool.Adapter.adapterRecyclerEvaluate;
import com.example.user.electricschool.Model.Evaluate;
import com.ramotion.foldingcell.FoldingCell;

import java.io.IOException;
import java.util.ArrayList;


public class EvaluationActivity extends AppCompatActivity { //  implements AsyncResponse
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        recyclerView = findViewById(R.id.recyclerEvaluation);
        ArrayList<Evaluate> list = new ArrayList<>();
        list.add(new Evaluate("Mohmmad ", "" +
                "كثير الحركة مشاغب نرجو من الاهل التعاون معناكثير الحركة مشاغب نرجو من الاهل التعاون معنا كثير الحركة مشاغب نرجو من الاهل التعاون معنا "));
        list.add(new Evaluate("Hassan ", "كثير الحركة مشاغب نرجو من الاهل التعاون معنا "));
        list.add(new Evaluate("Bakri ", "كثير الحركة مشاغب نرجو من الاهل التعاون معنا "));
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterRecyclerEvaluate adapter = new adapterRecyclerEvaluate(this, list);
        recyclerView.setAdapter(adapter);
    }

}