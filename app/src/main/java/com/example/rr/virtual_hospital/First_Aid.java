package com.example.rr.virtual_hospital;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

/**
 * Created by R.R on 4/16/2017.
 */
//Class for Making First Aid Activity
public class First_Aid extends BaseExpandableListAdapter {


    String groupName[]= {"AAA (Abdominal Aortic Aneurysm)","Abdominal Aortic Aneurysm","Adenomyosis (Uterine Fibroids)","Adult Acne (Rosacea)","Adult-Onset Asthma","Back Pain (Low Back Pain)","Bad Breath","Bath Salts Abuse and Addiction","Behcet's Syndrome","Black Eye","Blood, CO2 (Electrolytes)","Branchial Cyst","Breast Lumps In Women","Calcium, Elevated (Hypercalcemia)","CBC (Complete Blood Count)","Cellulite","Child Drowning (Drowning)","Chronic Cough","Conjunctivitis (Pink Eye)","Dandruff (Seborrhea)","Deafness","","","","","","","","","","","",""};

    String[][]childernName={{"1.Chittagong College  ","2.Govt. Mohsin College  ","3.Govt. City College  ","4.Govt Women College  ","5.BAWA College "},{"1.CCPC ","2.BAF Shahin College","3. Meron Sun College "}};


    Context context;
























    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
