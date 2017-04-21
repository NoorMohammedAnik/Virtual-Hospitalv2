package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rr.virtual_hospital.hospital.HospitalListActivity;
import com.example.rr.virtual_hospital.maps.MapsActivity;
import com.example.rr.virtual_hospital.profile.VbActivity;

public class MainActivity extends AppCompatActivity {
    Button bloodBank,callForHelp,firstAid,hospital,map,diago,doc,ambu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bloodBank=(Button)findViewById(R.id.vb);
        callForHelp=(Button)findViewById(R.id.Call);
        firstAid=(Button)findViewById(R.id.Aid);
        hospital=(Button)findViewById(R.id.hospital);
        diago=(Button)findViewById(R.id.diagonostic);
        map=(Button)findViewById(R.id.Map);
        doc=(Button)findViewById(R.id.Doc);
        ambu=(Button)findViewById(R.id.Amb);

        bloodBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,VbActivity.class);
                startActivity(in);
              //  Toast.makeText(MainActivity.this, "Virtual Blood Bank", Toast.LENGTH_SHORT).show();
            }
        });
        callForHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,EmergencySms.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Emergency SMS", Toast.LENGTH_SHORT).show();
            }
        });
        firstAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,FirstAiActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "First Aid", Toast.LENGTH_SHORT).show();
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,HospitalListActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Hospital List", Toast.LENGTH_SHORT).show();
            }
        });
        diago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,DiaActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Diagnostic Center", Toast.LENGTH_SHORT).show();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Find Nearest", Toast.LENGTH_SHORT).show();
            }
        });
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,DocsActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Doctors List", Toast.LENGTH_SHORT).show();
            }
        });
        ambu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,AmbulanceActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Ambulance List", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
