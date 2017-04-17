package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bloodBank,callForHelp,firstAid,hospital,map,diago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bloodBank=(Button)findViewById(R.id.VB);
        callForHelp=(Button)findViewById(R.id.Call);
        firstAid=(Button)findViewById(R.id.Aid);
        hospital=(Button)findViewById(R.id.Hopitallist);
        diago=(Button)findViewById(R.id.Diagnistics);
        map=(Button)findViewById(R.id.Map);

        bloodBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,VbActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Virtual Blood Bank", Toast.LENGTH_SHORT).show();
            }
        });
        callForHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,CallActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Call For Help", Toast.LENGTH_SHORT).show();
            }
        });
        firstAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,FirstAidActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "First Aid", Toast.LENGTH_SHORT).show();
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,HospitalActivity.class);
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
                Intent in = new Intent(MainActivity.this,NearestActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Nearest Hospital", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
