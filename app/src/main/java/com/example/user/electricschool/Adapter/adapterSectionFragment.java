package com.example.user.electricschool.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class adapterSectionFragment extends FragmentPagerAdapter
{
    private List<Fragment> mfragmentList = new ArrayList<>();
    private List<String> mfragmentTitleList = new ArrayList<>();

    public void addFragment (Fragment fragment, String title )
    {
        mfragmentList.add(fragment);
        mfragmentTitleList.add(title);
    }
    public  adapterSectionFragment(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position)
    {
        return mfragmentList.get(position);
    }

    public  CharSequence getPageTitle(int position)
    {
        return mfragmentTitleList.get(position);
    }
    @Override
    public int getCount()
    {
        return mfragmentList.size();
    }
}
