package com.example.rr.virtual_hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by R.R on 4/19/2017.
 */

public class Ambulance extends BaseAdapter {

    String[] ambulanceList;
    int[] flags;
    LayoutInflater inflater;


    public Ambulance(Context context, String[] ambulanceList, int[]flags )
    {

        this.ambulanceList=ambulanceList;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }

    public int getCount() {
        return ambulanceList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.ambulance,viewGroup,false);
        TextView textView=(TextView)view.findViewById(R.id.textViewAmbu);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageViewAmbu);
        textView.setText(ambulanceList[position]);
        imageView.setImageResource(flags[0]);

        return view;

    }
}
