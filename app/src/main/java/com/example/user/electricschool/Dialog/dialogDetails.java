package com.example.user.electricschool.Dialog;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.user.electricschool.R;
import com.example.user.electricschool.SigninActivity;


public class dialogDetails extends DialogFragment
{
    private DatePicker datePicker;
    private String date;
    private SigninActivity signinActivity;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.datebirthday , container, false);
        signinActivity = (SigninActivity) getActivity();

        datePicker = view.findViewById(R.id.dpDialogDOB);

        Button btnok = view.findViewById(R.id.btnok);
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
