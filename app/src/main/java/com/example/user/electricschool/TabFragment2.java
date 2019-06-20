package com.example.user.electricschool;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.electricschool.Adapter.adapterRecyclerDetail;
import com.example.user.electricschool.Model.detail;

import java.util.ArrayList;

public class TabFragment2 extends Fragment
{


    private static final String secondPage ="SecondPage";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

            View view = inflater.inflate(R.layout.tab2_fragment, container , false);
        RecyclerView recyclerViewDetail = view.findViewById(R.id.recyclerViewDetail);

        ArrayList<detail> details = new ArrayList<>();
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
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerViewDetail.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new adapterRecyclerDetail(getContext(), details);
            recyclerViewDetail.setAdapter(adapter);

            return view;
    }
}
