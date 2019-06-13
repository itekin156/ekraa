package com.example.user.electricschool;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.user.electricschool.Adapter.adapterRecyclerDetail;
import com.example.user.electricschool.Model.detail;

import java.util.ArrayList;

public class TabFragment2 extends Fragment
{



    private ArrayList<detail> details;
    private RecyclerView recyclerViewDetail;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static final String secondPage ="SecondPage";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

            View view = inflater.inflate(R.layout.tab2_fragment, container , false);
            recyclerViewDetail = view.findViewById(R.id.recyclerViewDetail);

            details = new ArrayList<>();
            details.add(new detail(R.drawable.history,"history", "Rami Hassan" ));
            details.add(new detail(R.drawable.chimstry,"chemistry", "Rami Hassan"));
            details.add(new detail(R.drawable.art, "Art", "Rami Hassan"));
            details.add(new detail(R.drawable.sport, "sport", "Rami Hassan"));
            details.add(new detail(R.drawable.sience, "science", "Rami Hassan"));
            details.add(new detail(R.drawable.english, "Englesh", "Rami Hassan"));
            details.add(new detail(R.drawable.music, "Music", "Rami Hassan"));
            details.add(new detail(R.drawable.arabic, "arabic", "Rami Hassan"));
            details.add(new detail(R.drawable.math, "Math", "Rami Hassan"));


            recyclerViewDetail.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(getContext());
            recyclerViewDetail.setLayoutManager(layoutManager);
            adapter = new adapterRecyclerDetail(getContext(), details);
            recyclerViewDetail.setAdapter(adapter);

            return view;
    }
}
