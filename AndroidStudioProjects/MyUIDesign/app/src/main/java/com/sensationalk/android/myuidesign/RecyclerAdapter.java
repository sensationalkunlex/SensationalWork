package com.sensationalk.android.myuidesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 11/07/2016.
 */

public  class  RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.listHolder> implements View.OnClickListener   {

    private List<Modelclass> items;

    RecyclerAdapter(List<Modelclass> modelData) {
        if (modelData == null) {
            throw new IllegalArgumentException(
                    "modelData must not be null");
        }
        this.items = modelData;
    }

    @Override
    public listHolder onCreateViewHolder(
            ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.recyclerlayout,viewGroup, false);

        return new listHolder(itemView);
    }


    @Override
    public void onBindViewHolder(listHolder viewHolder, int position) {
        Modelclass model = items.get(position);
        viewHolder.picturer.setImageResource(model.getPictures());
        viewHolder.usernamer.setText(model.getName());
        viewHolder.amounter.setText(model.getMoney().toString());
        viewHolder.dater.setText(model.getDate());
        viewHolder.btnstatuser.setBackgroundColor(model.getBtnColor());
        viewHolder.btnstatuser.setText(model.getBtnText());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onClick(View v) {

    }

    public final class listHolder extends RecyclerView.ViewHolder {
        private ImageView picturer;
        private TextView usernamer;
        private TextView amounter;
        private TextView dater;
        private Button btnstatuser;
        public listHolder(View itemView) {
            super(itemView);
            picturer=(ImageView) itemView.findViewById(R.id.list_picture);
            usernamer=(TextView) itemView.findViewById(R.id.userName);
            amounter= (TextView)itemView.findViewById(R.id.Amount);
            dater= (TextView)itemView.findViewById(R.id.date);
            btnstatuser=(Button)itemView.findViewById(R.id.btnStatus);

        }
    }

}

