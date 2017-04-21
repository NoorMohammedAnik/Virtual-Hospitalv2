package com.example.rr.virtual_hospital.profile.adapters;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rr.virtual_hospital.R;
import com.example.rr.virtual_hospital.prescription.SlideshowDialogFragment;
import com.example.rr.virtual_hospital.prescription.model.Prescriptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ramim on 4/18/2017.
 */

public class PagerAdapterSmall extends PagerAdapter {
    String imgURL;
    Activity mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<Prescriptions> prescriptions;
    FragmentTransaction ft;
    private String urlDLT="";
    private RequestQueue rq;

    public PagerAdapterSmall (Activity context,ArrayList<Prescriptions> prescriptions) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.prescriptions=prescriptions;
        imgURL=mContext.getString(R.string.serverIp)+"vhosp_prescriptions/";
        urlDLT=mContext.getString(R.string.serverIp)+"prescription.php";
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

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //TODO:implement the longclick in prescriptions
                AlertDialog.Builder confirm= new AlertDialog.Builder(mContext);
                confirm.setTitle("Sure you want to delete?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                deletePrescription(dialogInterface,prescriptions.get(position).getId(),prescriptions.get(position).getUrl());
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                confirm.show();
                return true;
            }
        });

        container.addView(itemView);

        return itemView;
    }

    private void deletePrescription(final DialogInterface dialogInterface, final String id, final String url) {
        rq= Volley.newRequestQueue(mContext);
        StringRequest deleteItem=new StringRequest(Request.Method.POST, urlDLT, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(mContext, response, Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
                mContext.recreate();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(mContext, "Network Error", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<>();
                map.put("id",id);
                map.put("task","delete_prescription");
                map.put("img_name",url);
                return map;
            }
        };
        rq.add(deleteItem);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
