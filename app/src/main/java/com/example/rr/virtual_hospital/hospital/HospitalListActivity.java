package com.example.rr.virtual_hospital.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rr.virtual_hospital.R;

public class HospitalListActivity extends AppCompatActivity {


    ListView CustomList;

    int flags[]={R.drawable.hospital_list};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);


        //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Hospital List");

        CustomList=(ListView)findViewById(R.id.listView);



        final String hospitalList[]={"BNSB","C.S.C.R","Centre Point Hospital (Pvt)Ltd.","Chattagram Maa-Shishu General Hospital","CHEVRON","Chittagong Health Care Hospital Pvt. Ltd.","Chittagong Metropolitan Hospital Pvt. Ltd.","Chittagong Poly Clinic Pvt. Ltd."," Ekhushe Hospital","General Hospital","Holy Crescent Hospital (Pvt.) Ltd","Holy Health Complex Ltd."," Ibrahim Iqbal Memorial Hospital Limited","Mount Hospital","Memon City Corporation","Medical Centre (Pvt) Clinic","Maa-O-Mony Hospital","Mahanagar Clinic","Labaid Specialized Hospital - Chittagong",". National Hospital","Niramoy Clinic Pvt. Ltd."," Pachlaish Maa-O-Shishu Hospital","Panorama Hospital (Pvt) Ltd","Royal Hospital"," Sheba Hospital"," Surgiscope Pvt. Ltd.","Treatment Hospital","USTC Hospital"};
        CustomListAdapter customAdapter=new CustomListAdapter(getApplicationContext(),hospitalList,flags);
        CustomList.setAdapter(customAdapter);

        //list items click listener
        CustomList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(HospitalListActivity.this, HospitalDetailsActivity.class);
                intent.putExtra("hospitalName", hospitalList[position]);
                Toast.makeText(getApplicationContext(), "" + hospitalList[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });
    }

    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
