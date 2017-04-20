package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
//Done By Rafid

public class DiaActivity extends AppCompatActivity {
    ListView listView;
    String[] diaList={"APEX DIAGNOSTIC SERVICES (PVT.) LTD.",
            "BANGLADESH DIAGNOSTIC ","BIOPATH LABORATORY","BASIC LAB","BIOCHEMISTRY LAB","CARE INVESTIGATION ","CENTRAL LAB ","CHATTAGRAM METROPOLITAN HOSPITAL (PVT) LTD.","CHECK UP MEDICAL SERVICES LTD. ",
            "CHEVRON CLINICAL LABORATORY (PVT.) LTD.","CHITTAGONG BELLEVUE LTD.","CHITTAGONG DOCTORS LAB (PVT.) LTD. ","CHITTAGONG LAB LTD. ","CHITTAGONG POLY CLINIC (PVT) LTD","CITY HEALTH CLINIC ","CRESCENT DIAGNOSIS ","C.T. IMAGING & DIAGNOSTIC CENTRE LTD. ","CHITTAGONG METROPOLITAN HASPATAL DIAGNOSTIC LABORATORY","DIASONIC DIAGNOSTIC CENTRE ","DIVINE DIAGNOSTIC LTD. ","DR. MAHFUZUR RAHMAN'S LAB ","DR. MUSH DENTAL CLINIC ","EAGLES EYE DIAGNOSTIC ","EVERGREEN CLINIC (PVT) LTD. ","HEALTH HOME PVT. LTD.","HEALTH SENSE DIAGNOSTIC CENTRE","KIDNEY DIAGNOSTIC COMPLEX ","LAB EXPERTS (PVT) LTD.","LANCET ","LIFE CARE CENTRE ","MAGNUM DIAGNOSTIC COMPLEX ","MAHANAGAR CLINIC (PVT) LTD.",
            "MEDI AID COMPLEX (PVT) LTD.","MEDICAL CENTRE (PVT) CLINIC ","MEDICAL POINT","METRO DIAGNOSTI CENTER LIMITED"};

    int[] pic={R.drawable.diagnosticforlist};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);
        //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Diagnostic List");
        listView=(ListView)findViewById(R.id.listViewDia);


        Diago diago= new Diago(getApplicationContext(),diaList,pic);
        listView.setAdapter(diago);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(DiaActivity.this, DiaDetailsActivity.class);
                intent.putExtra("docName", diaList[position]);
                Toast.makeText(getApplicationContext(),"" + diaList[position], Toast.LENGTH_SHORT).show();
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
