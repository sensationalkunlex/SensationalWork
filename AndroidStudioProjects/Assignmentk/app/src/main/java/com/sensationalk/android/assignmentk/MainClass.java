package com.sensationalk.android.assignmentk;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 23/06/2016.
 */
public class MainClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainview);
        // 3rd and 5th layout
        FragmentManager fragmentManager = getFragmentManager();

    }
}
