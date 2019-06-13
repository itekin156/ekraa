package com.example.user.electricschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.electricschool.R;
import com.example.user.electricschool.SigninActivity;
import com.example.user.electricschool.StartActivity;

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

