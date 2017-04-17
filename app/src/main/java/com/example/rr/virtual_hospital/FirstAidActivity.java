package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
//First Aid Activity Done By Rafid

public class FirstAidActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        expandableListView=(ExpandableListView)findViewById(R.id.FirstAid);


    }
}
