package com.example.rr.virtual_hospital.doctors;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;

/**
 * Created by R.R on 4/19/2017.
 */

public class CustomDoctorsAdapter extends BaseAdapter {

    String[] docName;
    int flags[];
    LayoutInflater inflater;


    public CustomDoctorsAdapter(Context context, String[] docName, int[]flags )
    {

        this.docName=docName;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return docName.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        view=inflater.inflate(R.layout.list_item_doc,parent,false);

        TextView textView=(TextView)view.findViewById(R.id.name);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewdoc);
        textView.setText(docName[position]);
        textView.setTextColor(Color.BLUE);
        imageView.setImageResource(flags[0]);
        return view;
}
}
