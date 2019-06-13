package com.example.user.electricschool.Dialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.user.electricschool.MainActivity;
import com.example.user.electricschool.R;
import com.example.user.electricschool.SigninActivity;

import java.util.Locale;


public class dialogDetails extends DialogFragment
{
    private Button btnok;
    private DatePicker datePicker;
    private String date;
    private SigninActivity signinActivity;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.datebirthday , container, false);
        signinActivity = (SigninActivity) getActivity();

        datePicker = (DatePicker)view.findViewById(R.id.dpDialogDOB);

        btnok= (Button)view.findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                date = datePicker.getYear()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getDayOfMonth();
                signinActivity.addDate(date);
                dismiss();
            }
        });

        return view;

    }



}
