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
 * Created by R.R on 4/20/2017.
 */

public class FirstAid extends BaseAdapter {

    String[] firstName;
    int flags[];
    LayoutInflater inflater;


    public FirstAid(Context context, String[] firstName, int[]flags )
    {

        this.firstName=firstName;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    } @Override
    public int getCount() {
        return firstName.length;
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
        view=inflater.inflate(R.layout.first,viewGroup,false);

        TextView textView=(TextView)view.findViewById(R.id.textViewFirstaid);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewFirstAid);
        textView.setText(firstName[position]);
        textView.setTextColor(Color.BLUE);
        imageView.setImageResource(flags[0]);
        return view;
    }
}
