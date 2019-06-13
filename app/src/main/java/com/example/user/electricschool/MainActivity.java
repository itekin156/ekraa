package com.example.user.electricschool;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity
{
    private int TIME = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(MainActivity.this , StartActivity.class );
                startActivity(intent);
                finish();
            }
        }, TIME );

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        apiInterface = ApiClient.getApiClient().create(StudentApiInterface.class);
//        Call<Student> call = apiInterface.getMe();
//        call.enqueue(new Callback<Student>() {
//            @Override
//            public void onResponse(Call<Student> call, Response<Student> response) {
//                Student me = response.body();
//             //   textView.setText(me.getFirstName());
//                Toast.makeText(MainActivity.this, me.getFirstName(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<Student> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Check your internet connection   ", Toast.LENGTH_SHORT).show();
//            }
//        });
//        Call<List<Student>> call1 = apiInterface.getStudents();
//        call1.enqueue(new Callback<List<Student>>() {
//            @Override
//            public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Student>> call, Throwable t) {
//
//            }
//        });
//    }
}
