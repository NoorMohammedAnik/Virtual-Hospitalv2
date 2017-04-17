package com.example.rr.virtual_hospital;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_hospital);

 //ListView myListView = (ListView)findViewById(R.id.myListView);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Hospital List");
        String[] hospital={"Chiitagone Medical Collage","Chittagong Eye Infirmary & Training Complex","Chattagram Maa-Shishu O General Hospital","Chittagong Metropolitan Hospital Pvt. Ltd.",
                "Southern Medical College and Hospital","Epic Health Care","Ustc Medical College"
                ,"Lions General Hospital"};
     //   int[] pic={R.drawable.cmh,R.drawable.eye,R.drawable.maa,R.drawable.headerlog,R.drawable.suth,R.drawable.epic,R.drawable.ustc,R.drawable.lion};
      //  Hospital hospital1= new Hospital(getApplicationContext(),hospital,pic);
       // myListView.setAdapter(hospital1);



    }
    public boolean onOptionItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //app icon in action bar clicked;goto parent activity
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
