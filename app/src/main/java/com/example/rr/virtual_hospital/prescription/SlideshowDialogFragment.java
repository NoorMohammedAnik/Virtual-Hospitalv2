package com.example.rr.virtual_hospital.prescription;

import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rr.virtual_hospital.R;


import java.util.ArrayList;

/**
 * Created by Ramim on 10/31/2016.
 */

public class SlideshowDialogFragment extends android.app.DialogFragment {
    String TAG= SlideshowDialogFragment.class.getSimpleName();
    String[] images;
    ViewPager viewPager;
    MyViewPagerAdapter myViewPagerAdapter;
    TextView lblCount,lblTitle,lblDate;
    int selectedPosition=0;
    String imgURL="";
    public static SlideshowDialogFragment newInstance(){
        SlideshowDialogFragment f=new SlideshowDialogFragment();
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.large_image_slider,container,false);
        viewPager=(ViewPager)v.findViewById(R.id.viewpager);
        lblCount=(TextView)v.findViewById(R.id.lbl_count);
        lblTitle=(TextView)v.findViewById(R.id.title);
        lblDate=(TextView)v.findViewById(R.id.date);

        images=getArguments().getStringArray("images");
        selectedPosition=getArguments().getInt("position");
        Log.e(TAG, "position: " + selectedPosition);


        myViewPagerAdapter=new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewpagerPageChangeListener);
        setCurrentItem(selectedPosition);

        return v;
    }

    private void setCurrentItem(int selectedPosition) {
        viewPager.setCurrentItem(selectedPosition,false);
  //      displayMetaInfo(selectedPosition);
    }
/*
    private void displayMetaInfo(int selectedPosition) {
        lblCount.setText((selectedPosition + 1) + "of" + images.size());
        Image img= images.get(selectedPosition);
        lblTitle.setText(img.getName());
        lblDate.setText(img.getTimestamp());
    }
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL,android.R.style.Theme_Black_NoTitleBar_Fullscreen);
    }

    ViewPager.OnPageChangeListener viewpagerPageChangeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            //displayMetaInfo(position);
            setCurrentItem(position);
        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };




    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
           imgURL =getActivity().getString(R.string.serverIp)+"vhosp_prescriptions/";
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater=(LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view= layoutInflater.inflate(R.layout.fullscreen_preview,container,false);
            ImageView imageView=(ImageView)view.findViewById(R.id.full_image);
            String image=imgURL+images[position];
            Glide.with(getActivity()).load(image)
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imageView);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==((View) object);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
