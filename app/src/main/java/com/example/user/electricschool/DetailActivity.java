package com.example.user.electricschool;

import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.util.Log;

import com.example.user.electricschool.Adapter.adapterSectionFragment;

public class DetailActivity extends AppCompatActivity
{
    private static final String tag = "DetailActivity";
    private adapterSectionFragment adapterSectionFragment;
    private  ViewPager viewPager;
    private  TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(tag, "onCreate : Starting");

         adapterSectionFragment = new adapterSectionFragment(getSupportFragmentManager());
         viewPager = (ViewPager) findViewById(R.id.container);
         SetupViewPager(viewPager);
         tabLayout = (TabLayout) findViewById(R.id.tabs);
         tabLayout.setupWithViewPager(viewPager);
    }

    private  void SetupViewPager( ViewPager viewPager)
    {
        adapterSectionFragment adapter = new adapterSectionFragment(getSupportFragmentManager());
        adapter.addFragment( new TabFragment1() , " Main ");
        adapter.addFragment( new TabFragment2() , " Detail ");
        adapter.addFragment( new TabFragment3() , " Puying ");
        viewPager.setAdapter(adapter);

    }







}
