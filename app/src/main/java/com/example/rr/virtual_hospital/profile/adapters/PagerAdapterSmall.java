package com.example.rr.virtual_hospital.profile.adapters;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rr.virtual_hospital.R;
import com.example.rr.virtual_hospital.prescription.SlideshowDialogFragment;
import com.example.rr.virtual_hospital.prescription.model.Prescriptions;

import java.util.ArrayList;

/**
 * Created by Ramim on 4/18/2017.
 */

public class PagerAdapterSmall extends PagerAdapter {
    String imgURL;
    Activity mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<Prescriptions> prescriptions;
    FragmentTransaction ft;

    public PagerAdapterSmall (Activity context,ArrayList<Prescriptions> prescriptions) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.prescriptions=prescriptions;
        imgURL=mContext.getString(R.string.serverIp)+"vhosp_prescriptions/";

    }

    @Override
    public int getCount() {
        return prescriptions.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.small_pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        //use Glide to load image intoview
        //imageView.setImageResource(imgURL[position]);
        Glide.with(mContext).load(imgURL+prescriptions.get(position).getUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle=new Bundle();
                bundle.putStringArray("images", new String[]{prescriptions.get(position).getUrl()});
                bundle.putInt("position",position);
                ft=mContext.getFragmentManager().beginTransaction();
                SlideshowDialogFragment sdf= SlideshowDialogFragment.newInstance();
                sdf.setArguments(bundle);
                sdf.show(ft,"show");

            }
        });

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
