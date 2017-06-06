package com.example.rr.virtual_hospital.ambulance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rr.virtual_hospital.R;

public class AmbulanceActivity extends AppCompatActivity {
    ListView listView;
    String[] ambulanceList={"Alfa (Pvt) Ambulance Service","Alif Ambulance Service","Centre Point Hospital Ltd.","Chittagong Medical College","Chittagong Health Care Hospital Pvt. Ltd.","Chittagong Metropolitan Hospital Pvt. Ltd.","Chittagong Poly Clinic Pvt. Ltd.",
            "Dolphin Ambulance","Holy Crescent Hospital Pvt. Ltd.","Media Medical Service",
            "Medical Centre",
            "Modern Ambulance Service","Niramoy Clinic Pvt. Ltd.","Panaroma Hospital Pvt. Ltd.","Provhati Ambulance Service",
            "Railway Hospital","Surgiscope Pvt. Ltd.","Upasham Hospital Ltd"};
    int[] pic={R.drawable.ambulanceforlist};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Ambulance List");
        listView=(ListView)findViewById(R.id.listViewAmbu);
        Ambulance ambulance= new Ambulance(getApplicationContext(),ambulanceList,pic);
        listView.setAdapter(ambulance);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(AmbulanceActivity.this,AmbulanceDetActivity.class);
                intent.putExtra("docName",ambulanceList[position]);
                Toast.makeText(getApplicationContext(), "" + ambulanceList[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });




    }
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
