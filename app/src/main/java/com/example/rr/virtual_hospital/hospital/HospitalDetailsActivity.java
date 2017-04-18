package com.example.rr.virtual_hospital.hospital;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;

public class HospitalDetailsActivity extends AppCompatActivity {

    ImageView place_img;
    TextView place_name,place_desc,place_location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Hospital Details");

        place_img=(ImageView)findViewById(R.id.place_img);
        place_name=(TextView)findViewById(R.id.txt_place_name);
        place_desc=(TextView)findViewById(R.id.txt_place_description);
        place_location=(TextView)findViewById(R.id.txt_place_location);


        String getPlaceName=getIntent().getExtras().getString("hospitalName");

        if (getPlaceName.equals("BNSB"))
        {

            place_img.setImageResource(R.drawable.ambulance);
            place_name.setText(getPlaceName);
            place_desc.setText("Ahsan Manjil was the official residential palace and seat of the Dhaka Nawab Family." +
                    " This magnificent building is situated at Kumartoli along the banks of the Buriganga River in Dhaka," +
                    " Bangladesh. The construction of this palace was started in 1859 and was completed in 1872." +
                    " It was constructed in the Indo-Saracenic Revival architecture." +
                    " It has been designated as a national museum.");
            place_location.setText("Ahsan Manjil, Dhaka.");


        }


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
