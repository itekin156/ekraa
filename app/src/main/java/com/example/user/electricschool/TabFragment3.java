package com.example.user.electricschool;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TabFragment3 extends Fragment
{
    private Button btntabeSingnin;
    private Button btnTabCancel;
    private TextView txttabfragmentprice;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {


        View view = inflater.inflate(R.layout.tab3_fragment, container , false);


        btntabeSingnin = view.findViewById(R.id.btntabeSingnin);
        btntabeSingnin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext() , SigninActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}

