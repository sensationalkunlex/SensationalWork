package com.sensationalk.android.myuidesign;

import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11/07/2016.
 */

public class SecondViewAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private final List<Integer> mListIcon=new  ArrayList<>();

public SecondViewAdapter(FragmentManager manager) {
        super(manager);
        }

@Override
public Fragment getItem(int position) {
        return mFragmentList.get(position);
        }

@Override
public int getCount() {
        return mFragmentList.size();
        }

public void addFragment(Fragment fragment, String title,Integer i) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
        mListIcon.add(i);
        }

@Override
public CharSequence getPageTitle(int position) {

        return null;

        }

        }
