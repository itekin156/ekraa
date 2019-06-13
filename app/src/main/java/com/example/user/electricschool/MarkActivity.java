package com.example.user.electricschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.user.electricschool.Adapter.adapterRecyclerMark;
import com.example.user.electricschool.Model.Mark;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class MarkActivity extends AppCompatActivity implements AsyncResponse
{

    private int imag_material;
    private ArrayList<Mark> marks;
    private RecyclerView recyclermark;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mark);



        HashMap<String,String> postData=new HashMap<String,String>();
        postData.put("id",StartActivity.id_don);
        PostResponseAsyncTask marktask = new PostResponseAsyncTask(MarkActivity.this,postData);
        marktask.execute("http://192.168.43.185:81/ekraa/Mark.php");


         marks = new ArrayList<>();
//
//            marks.add(new Mark(R.drawable.arabic,"arabic", 6, 8 ,20 ));
//            marks.add(new Mark(R.drawable.art,"art", 10, 7 ,18 ));
//            marks.add(new Mark(R.drawable.franch,"franch", 9, 10 ,19 ));
//            marks.add(new Mark(R.drawable.sport,"sport", 9, 8 ,20 ));
//            marks.add(new Mark(R.drawable.sience,"sience", 9, 9 ,17 ));
//            marks.add(new Mark(R.drawable.english,"english", 0, 0 ,0 ));
//            marks.add(new Mark(R.drawable.math,"math", 0, 0 ,0 ));
//            marks.add(new Mark(R.drawable.music,"music", 0, 0 ,0 ));
//            marks.add(new Mark(R.drawable.history,"history", 0, 0 ,0 ));
//            marks.add(new Mark(R.drawable.chimstry,"sience", 0, 0 ,0 ));

            recyclermark = (RecyclerView) findViewById(R.id.recyclerviewmark);
            recyclermark.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(this);
            recyclermark.setLayoutManager(layoutManager);


        }


    public void processFinish(String s)
    {
        try
        {

            XMLPARSER parser = new XMLPARSER();
            Document doc = parser.getDomElement(s);
            NodeList nl = doc.getElementsByTagName("user");
            int l=nl.getLength();
            for(int i=0;i<l;i++)
            {


                Element e = (Element) nl.item(i);
               // String image_material = e.getElementsByTagName("image_material").item(0).getTextContent();
                String material_name = e.getElementsByTagName("material_name").item(0).getTextContent();
                String first_quiz_mark = e.getElementsByTagName("first_quiz_mark").item(0).getTextContent();
                String second_quiz_mark = e.getElementsByTagName("second_quiz_mark").item(0).getTextContent();
                String assignment_mark = e.getElementsByTagName("assignment_mark").item(0).getTextContent();

                if(material_name=="arabic")
                imag_material =R.drawable.arabic;


               marks.add(new Mark(imag_material,material_name,Integer.parseInt(first_quiz_mark),Integer.parseInt(second_quiz_mark),Integer.parseInt(assignment_mark)));

                adapter = new adapterRecyclerMark(this, marks);
                recyclermark.setAdapter(adapter);

            }


        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

        }

    }



    }

