package com.sensationalk.android.myuidesign;

import android.content.Intent;
import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class SecondUI extends AppCompatActivity {
private ImageView btnUI3;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private int[] tabIcons = {
            R.drawable.arrowright,
            R.drawable.arrow,
            R.drawable.delete
    };
double tt=23.23;

    public List<Modelclass> getItems()
    {
        List<Modelclass> items=new ArrayList<>();
        items.add(new Modelclass(R.color.firstbg,"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));

        return items;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ui);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            if(i==0) {
                tabLayout.getTabAt(i).setIcon(R.drawable.tabone);
            }
            if(i==1) {
                tabLayout.getTabAt(i).setIcon(R.drawable.tabtwo);
            }
            if(i==2) {
                tabLayout.getTabAt(i).setIcon(R.drawable.tabthree);
            }
        }

btnUI3=(ImageView)findViewById(R.id.moveUI3);
        btnUI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplication(), ThirdUi.class);
                startActivity(intent);

            }
        });




    }
    private void setupViewPager(ViewPager viewPager) {
        SecondViewAdapter adapter = new SecondViewAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "ONE",  R.drawable.arrowright) ;
        adapter.addFragment(new TwoFragment(), "Two", R.drawable.arrow);

        adapter.addFragment(new OneFragment(), "Three",R.drawable.refresh);
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
       getMenuInflater().inflate(R.menu.second_menu,menu);
        return true;
    }
}
