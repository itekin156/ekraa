package com.example.user.electricschool;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;


public class HomeActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView txtHomeUserName = findViewById(R.id.txtHomeUserName);
        TextView txtHomeEvaluate = findViewById(R.id.txtHomeEvaluate);
        TextView txtHomeMark = findViewById(R.id.txtHomeMark);
        TextView txtHomeDiag = findViewById(R.id.txtHomeDiag);
        TextView txtHomeconectus = findViewById(R.id.txtHomeconectus);


        Intent in = getIntent();
        Bundle bundle = in.getExtras();
        String name = Objects.requireNonNull(bundle).getString("username");
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