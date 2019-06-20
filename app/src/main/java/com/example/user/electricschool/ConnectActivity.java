package com.example.user.electricschool;

import android.app.ProgressDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;




public class ConnectActivity extends AppCompatActivity
{


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();
    }
    @Override
    protected void onStart() {
        super.onStart();


    }
}
