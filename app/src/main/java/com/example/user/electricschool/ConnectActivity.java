package com.example.user.electricschool;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.user.electricschool.RetofitParty.ApiClient;
import com.example.user.electricschool.RetofitParty.interfaces.StudentApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConnectActivity extends AppCompatActivity
{
    private StudentApiInterface apiInterface;


    private RecyclerView recyclerView;

    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        apiInterface = ApiClient.getApiClient().create(StudentApiInterface.class);

    }
}
