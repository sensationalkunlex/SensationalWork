package com.sensationalk.android.myuidesign;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class TwoFragment extends Fragment {



    TextView idd;
    Button mButton;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private int Page;
    private String title;


    public static TwoFragment newInstance(int page, String title) {
        TwoFragment fragment = new TwoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, page);
        args.putString(ARG_PARAM2, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            title = getArguments().getString(ARG_PARAM2);
        }
    }
    double tt=23.23;

    public List<Modelclass> getItems()
    {
        List<Modelclass> items=new ArrayList<>();
        items.add(new Modelclass(Color.rgb(153,205,255),"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(253,178,102),"Request","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(153,205,255),"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(253,178,102),"Request","Feb, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(153,205,255),"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(253,178,102),"Request","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(153,205,255),"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(253,178,102),"Request","Feb, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(153,205,255),"pending","Jan, 2016",(float)tt,"Oyewusi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(0,153,153),"Received","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));

        items.add(new Modelclass(Color.rgb(253,178,102),"Request","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(0,153,153),"Received","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));
        items.add(new Modelclass(Color.rgb(0,153,153),"Received","Jan, 2016",(float)tt,"Adewumi Oyekunle",R.drawable.profile));





        return items;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_two, container, false);
        RecyclerView recyclerView=(RecyclerView) v.findViewById(R.id.recycler_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter( getItems()));
        return v;

    }

}