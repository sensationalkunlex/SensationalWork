package com.sensationalk.android.assignmentk;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class FirstLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      ;
        setContentView(R.layout.activity_first_layout);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
}
