package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FirstAiActivity extends AppCompatActivity {

    ListView listView;

    String[] groupName= {"AAA (Abdominal Aortic Aneurysm)","Adenomyosis (Uterine Fibroids)","Adult Acne (Rosacea)","Adult-Onset Asthma","Back Pain (Low Back Pain)","Bad Breath","Bath Salts Abuse and Addiction","Behcet's Syndrome","Black Eye","Blood, CO2 (Electrolytes)","Branchial Cyst","Breast Lumps In Women","Calcium, Elevated (Hypercalcemia)","CBC (Complete Blood Count)","Cellulite","Child Drowning (Drowning)","Chronic Cough","Conjunctivitis (Pink Eye)","Dandruff (Seborrhea)","Deafness","Dehydration","Dengue Fever","Diarrhea","Diarrhea, Travelers (Traveler's Diarrhea)","Difficulty in Swallowing (Achalasia)","Dislocated Shoulder","Dizziness (Dizzy)","Dry Mouth","Dry Skin","Ear Infection","Earthquakes (First Aid)","Elbow Pain","Electrical Burns (Burns)","Fatigue","Fecal Incontinence","Fibrillation (Atrial Fibrillation)","Gall Bladder Pain (Gallbladder Pain (Gall Bladder Pain))","Gas (Intestinal Gas (Belching, Bloating, Flatulence))","Gastritis","Glaucoma","Gum Problems","Hay Fever","Heart Attack Symptoms and Early Warning Signs","Hepatitis (Viral Hepatitis)","Influenza","Itch","Joint Tap (Joint Aspiration)","Kid's Cough (Children's Cough Causes and Treatments)","Knee Bursitis","Lack of Energy (Fatigue)","Melasma","Mold Exposure","eck Pain","Noonan Syndrome","Optic Neuritis","Pain Management","Scars","Urticaria (Hives)"};
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
        FirstAid firstAid=new FirstAid(getApplicationContext(),groupName,pic);
        listView.setAdapter(firstAid);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(FirstAiActivity.this, FirstAiDetActivity.class);
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
