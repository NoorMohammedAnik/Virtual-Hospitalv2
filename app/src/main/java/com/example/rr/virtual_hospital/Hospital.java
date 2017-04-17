package com.example.rr.virtual_hospital;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by R.R on 4/16/2017.

 //Class For Hospital Activity

 */

public class Hospital extends BaseAdapter {

    String hospitalList[];
    int pic[];
    LayoutInflater inflater;

    public Hospital(Context context, String[] hospitalList, int[]pic){
        this.hospitalList=hospitalList;
        this.pic=pic;
        inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {

        return hospitalList.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view=inflater.inflate(R.layout.list_hospital,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textViewCmc);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewCmc);
        textView.setText(hospitalList[position]);
        textView.setTextColor(Color.BLACK);
        imageView.setImageResource(pic[position]);
        return view;
    }
}
