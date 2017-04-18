package com.example.rr.virtual_hospital.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;


public class CustomListAdapter extends BaseAdapter {

    String hospitalList[];
    int flags[];
    LayoutInflater inflater;


    public CustomListAdapter(Context context, String[] hospitalList, int[]flags )
    {

        this.hospitalList=hospitalList;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }





    @Override
    public int getCount() {
        return hospitalList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {



        view=inflater.inflate(R.layout.list_item,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.itemName);
        ImageView imageView=(ImageView)view.findViewById(R.id.list_icon);
        textView.setText(hospitalList[position]);
        imageView.setImageResource(flags[0]);
        
        return view;

    }
}
