package com.example.user.electricschool;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Toast;

import com.example.user.electricschool.Adapter.adapterRecyclerEvaluate;
import com.example.user.electricschool.Model.Evaluate;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;


public class EvaluationActivity extends AppCompatActivity implements AsyncResponse
{


    private ArrayList<Evaluate> evaluates;
    private RecyclerView recyclereval;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);

        recyclereval = findViewById(R.id.recyclerEvaluation);

        //for connect my sql and shared data
        HashMap<String,String> postData=new HashMap<String,String>();
        PostResponseAsyncTask logintask = new PostResponseAsyncTask(EvaluationActivity.this,postData);
        logintask.execute("http://192.168.43.185:81/ekraa/alert.php");



         evaluates = new ArrayList<>();


        recyclereval.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclereval.setLayoutManager(layoutManager);


    }

    public void processFinish(String s)
    {
        try
        {

            XMLPARSER parser = new XMLPARSER();
            Document doc = parser.getDomElement(s);
            NodeList nl = doc.getElementsByTagName("alerts");
            int l=nl.getLength();
            for(int i=0;i<l;i++)
            {
                evaluates = new ArrayList<>();
                Element e = (Element) nl.item(i);
                String material_name = e.getElementsByTagName("material_name").item(0).getTextContent();
                String comment = e.getElementsByTagName("imagematerial").item(0).getTextContent();
                evaluates.add(new Evaluate(material_name, comment));

                adapter = new adapterRecyclerEvaluate(this , evaluates);
                recyclereval.setAdapter(adapter);

            }

        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

        }

    }

}
