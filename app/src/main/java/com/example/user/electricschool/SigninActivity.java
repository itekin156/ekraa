package com.example.user.electricschool;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.electricschool.Dialog.dialogDetails;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

public class SigninActivity extends AppCompatActivity  implements AsyncResponse
{

    private TextInputEditText edtCompletename;
    private TextInputEditText editText_user_name;
    private TextInputEditText editText_pass_word;
    private TextInputEditText editText_convirm_name_user_name;
    private Spinner spinnerSigninclass;
    private TextView txtprice;
    private Button btnDOB;
    private Button btnDetails;
    private FloatingActionButton flatDone;
    private dialogDetails dialogdetails ;



    private String name;
    private String Completenamestr;
    private String password;
    private String confirmpassword;
    private String price;
    private String birthday;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        viewModelStudent = ViewModelProviders.of(SigninActivity.this).get(ViewModelStudent.class);

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);

        edtCompletename = findViewById(R.id.edtCompletename);
        editText_user_name = findViewById(R.id.editText_user_name);
        editText_pass_word = findViewById(R.id.editText_pass_word);
        editText_convirm_name_user_name = findViewById(R.id.editText_convirm_name_user_name);
        txtprice = findViewById(R.id.txtprice);
        btnDOB = findViewById(R.id.btnDOB);
        btnDetails = findViewById(R.id.btnDetails);
        flatDone = findViewById(R.id.flatDone);
        spinnerSigninclass = findViewById(R.id.spinnerSigninclass);


        btnDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                dialogdetails = new dialogDetails();
                dialogdetails.show(getSupportFragmentManager(), null);
            }
        });



        btnDetails.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SigninActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        spinnerSigninclass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                String string = String.valueOf(spinnerSigninclass.getSelectedItem());
                if (string.equals("First clase"))
                {
                    txtprice.setText("100$");
                }
                if (string.equals("Second clase"))
                {
                    txtprice.setText("150$");
                }
                if (string.equals("Third clase"))
                {
                    txtprice.setText("200$");
                }
                if (string.equals("Fourth clase"))
                {
                    txtprice.setText("250$");
                }
                if (string.equals("Fifth clase"))
                {
                    txtprice.setText("300$");
                }
                if (string.equals("Sixth clase"))
                {
                    txtprice.setText("400$");
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
        flatDone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                name = editText_user_name.getText().toString();
                if(name.equals("") || password.equals("") || price.equals("") || confirmpassword.equals("") || Completenamestr.equals("") || birthday.equals("")  )
                {
                    Toast.makeText(SigninActivity.this, "plz enter All The Details", Toast.LENGTH_SHORT).show();
                }
                else if( !password.equals(confirmpassword))
                {
                    Toast.makeText(SigninActivity.this, "the password not MATCH...pleaz try again", Toast.LENGTH_SHORT).show();
                    edtCompletename.setText("");
                    editText_pass_word.setText("");
                    editText_convirm_name_user_name.setText("");
                    editText_user_name.setText("");
                    txtprice.setText("");
                    btnDOB.setText("");

                }
                else
                {

                    //for connect my sql and shared data
                    HashMap<String,String> postData=new HashMap<String,String>();
                    postData.put("username",name);
                    postData.put("birthday",btnDOB.getText().toString());
                    postData.put("password",password);
                    PostResponseAsyncTask logintask = new PostResponseAsyncTask(SigninActivity.this,postData);
                    logintask.execute("http://192.168.43.46/ekraa/student.php");
                    Intent intent = new Intent( SigninActivity.this, HomeActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString( "username", name);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    finish();


//                    student.setBirthday(birthday);
//                    student.setPassword(password);
//                    student.setUserName(name);
//                    viewModelStudent.insert(student);
//                    Intent intent = new Intent(SigninActivity.this, HomeActivity.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putString( "username", name);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                    finish();
                }
            }
        });

    }

    public void addDate(String Date)

    {
        btnDOB.setText(Date);
    }

    @Override
    public void processFinish(String s)
    {
        try
        {

            XMLPARSER parser = new XMLPARSER();
            Document doc = parser.getDomElement(s);
            NodeList nl = doc.getElementsByTagName("student");
            int l=nl.getLength();
            for(int i=0;i<l;i++)
            {
                Element e = (Element) nl.item(i);
                String id_don = e.getElementsByTagName("id").item(0).getTextContent();
            }
            if (l==0)
            {
                Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show();
            }
            else
            {

                Intent intent=new Intent(SigninActivity.this,HomeActivity.class);
                startActivity(intent);
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

        }

    }
}
