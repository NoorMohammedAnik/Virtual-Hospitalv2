package com.example.rr.virtual_hospital.diagonostic;

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
 * Created by R.R on 4/20/2017.
 */

public class DiagonosticAdapter extends BaseAdapter {

    String[] diaName;
    int flags[];
    LayoutInflater inflater;


    public DiagonosticAdapter(Context context, String[] diaName, int[]flags )
    {

        this.diaName=diaName;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }




    @Override
    public int getCount() {
        return diaName.length;
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
        view=inflater.inflate(R.layout.dia_list,viewGroup,false);

        TextView textView=(TextView)view.findViewById(R.id.textViewDia);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewDia);
        textView.setText(diaName[position]);
        textView.setTextColor(Color.BLUE);
        imageView.setImageResource(flags[0]);
        return view;
    }
}
