package com.example.rr.virtual_hospital.firstaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rr.virtual_hospital.R;

public class FirstAiActivity extends AppCompatActivity {

    ListView listView;

    String[] groupName= {"AAA (Abdominal Aortic Aneurysm)","Adenomyosis (Uterine Fibroids)","Adult Acne (Rosacea)","Adult-Onset Asthma","Back Pain (Low Back Pain)","Bad Breath","Bath Salts Abuse and Addiction","Behcet's Syndrome","Black Eye","Branchial Cyst","Breast Lumps In Women","Calcium, Elevated (Hypercalcemia)","Cellulite","Child Drowning (Drowning)","Chronic Cough","Conjunctivitis (Pink Eye)","Deafness","Dehydration","Dengue Fever","Diarrhea","Diarrhea, Travelers (Traveler's Diarrhea)","Difficulty in Swallowing (Achalasia)","Dislocated Shoulder","Dizziness (Dizzy)","Dry Mouth","Ear Infection","Elbow Pain","Electrical Burns (Burns)","Fatigue","Fecal Incontinence","Fibrillation (Atrial Fibrillation)","Optic Neuritis","Scars","Urticaria (Hives)"};
    int[] pic={R.drawable.firstaidfast};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ai);
        listView=(ListView)findViewById(R.id.listFirst);
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("First Aid List");
        FirstAidAdapter firstAidAdapter =new FirstAidAdapter(getApplicationContext(),groupName,pic);
        listView.setAdapter(firstAidAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(FirstAiActivity.this, FirstAidDetailsActivity.class);
                intent.putExtra("docName",groupName[position]);
                Toast.makeText(getApplicationContext(), "" + groupName[position], Toast.LENGTH_SHORT).show();
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
