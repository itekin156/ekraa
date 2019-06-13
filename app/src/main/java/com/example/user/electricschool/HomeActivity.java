package com.example.user.electricschool;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity
{
    private TextView txtHomeUserName;
    private TextView txtHomeEvaluate;
    private TextView txtHomeMark;
    private TextView txtHomeDiag;
    private TextView txtHomeconectus;

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtHomeUserName = findViewById(R.id.txtHomeUserName);
        txtHomeEvaluate = findViewById(R.id.txtHomeEvaluate);
        txtHomeMark = findViewById(R.id.txtHomeMark);
        txtHomeDiag = findViewById(R.id.txtHomeDiag);
        txtHomeconectus = findViewById(R.id.txtHomeconectus);


        Intent in = getIntent();
        Bundle bundle = in.getExtras();
        name = bundle.getString("username");
        txtHomeUserName.setText(name);


        txtHomeMark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( HomeActivity.this , MarkActivity.class);
                startActivity(intent);
            }
        });

        txtHomeEvaluate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( HomeActivity.this , EvaluationActivity.class);
                startActivity(intent);
            }
        });
        txtHomeDiag.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( HomeActivity.this , DiagramActivity.class);
                startActivity(intent);
            }
        });

        txtHomeconectus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( HomeActivity.this , ConnectActivity.class);
                startActivity(intent);
            }
        });


    }

}