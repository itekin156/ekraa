package com.example.user.electricschool;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Objects;

public class StartActivity extends AppCompatActivity implements AsyncResponse
{
    private TextInputEditText edtUserName;
    private TextInputEditText edtPassword;
    private Button btnStart;
    private TextView btnSignin;


    private HomeActivity homeActivity;
     String username;

   public static String id_don;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignin  = findViewById(R.id.btnStart);
        btnStart = findViewById(R.id.btnSignin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                  username = Objects.requireNonNull(edtUserName.getText()).toString();
                final String password = Objects.requireNonNull(edtPassword.getText()).toString();

                if (username.equals("") || password.equals(""))
                {
                    Snackbar.make(findViewById(R.id.activity_login_start), "Please enter username and password", Snackbar.LENGTH_LONG).show();
                    return;
                }
                Intent intent = new Intent( StartActivity.this, HomeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString( "username", username);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();

                //for connect my sql and shared data
//                HashMap<String,String> postData=new HashMap<String,String>();
//                postData.put("username",username);
//                postData.put("password",password);
//
//                PostResponseAsyncTask siginintask = new PostResponseAsyncTask(StartActivity.this,postData);
//                siginintask.execute("http://192.168.43.185:81/ekraa/login.php");

            }
        });


    }

    @Override
    public void processFinish(String s) {
        try
        {

            XMLPARSER parser = new XMLPARSER();
            Document doc = parser.getDomElement(s);

            NodeList nl = doc.getElementsByTagName("user");

            int l=nl.getLength();


            for(int i=0;i<l;i++)
            {

                Element e = (Element) nl.item(i);
                 id_don = e.getElementsByTagName("user_id").item(0).getTextContent();

            }
            if (l==0)
            {
                Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show();
            }
            else
            {
                Intent intent = new Intent( StartActivity.this, HomeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString( "username", username);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
               // Intent intent=new Intent(this,HomeActivity.class);
             //   startActivity(intent);
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

        }

    }
}