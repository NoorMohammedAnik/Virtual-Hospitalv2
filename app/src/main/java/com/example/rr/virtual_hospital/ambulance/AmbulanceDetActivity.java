package com.example.rr.virtual_hospital.ambulance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;

public class AmbulanceDetActivity extends AppCompatActivity {
    ImageView place_img;
    TextView ambulance_name,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance_det);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Ambulance Details");


        place_img = (ImageView) findViewById(R.id.place_img);
        ambulance_name = (TextView) findViewById(R.id.ambulnName);
        contact = (TextView) findViewById(R.id.ambulanceContact);

        String getAmbuName = getIntent().getExtras().getString("docName");


        if (getAmbuName.equals("Alfa (Pvt) Ambulance Service")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("01819327070, 01819383636");


        }
        if (getAmbuName.equals("Alif Ambulance Service")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("031-657574, 01819-325060, ");


        }

        if (getAmbuName.equals("Centre Point Hospital Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("639025-7");


        }

        if (getAmbuName.equals("Chittagong Medical College")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("880 31-619400");


        }

        if (getAmbuName.equals("Chittagong Health Care Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("652728, 653965");


        }

        if (getAmbuName.equals("Chittagong Metropolitan Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("654732, 655791, 651242");


        }

        if (getAmbuName.equals("Chittagong Poly Clinic Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("650911, 656041");


        }

        if (getAmbuName.equals("Dolphin Ambulance")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("01819-396161");


        }

        if (getAmbuName.equals("Holy Crescent Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("616001-4");


        }

        if (getAmbuName.equals("Media Medical Service")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("031-656666, 01711-720000");


        }

        if (getAmbuName.equals("Medical Centre")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("651054, 651944");


        }

        if (getAmbuName.equals("Modern Ambulance Service")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("031-639730, 0154633214, 01716074497");


        }

        if (getAmbuName.equals("Niramoy Clinic Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("653036, 653041, 653824");


        }
        if (getAmbuName.equals("Panaroma Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText(" 619921, 613874, 630549");


        }

        if (getAmbuName.equals("Provhati Ambulance Service")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("01815-648334, 01977850000");


        }

        if (getAmbuName.equals("Railway Hospital")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("031-502220");


        }

        if (getAmbuName.equals("Surgiscope Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("652038, 653882, 652721");


        }

        if (getAmbuName.equals("Upasham Hospital Ltd")) {

            place_img.setImageResource(R.drawable.amb);
            ambulance_name.setText(getAmbuName);
            contact.setText("654051, 654230");


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
