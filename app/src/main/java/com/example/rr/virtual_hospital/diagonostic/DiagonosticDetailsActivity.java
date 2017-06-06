package com.example.rr.virtual_hospital.diagonostic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;

public class DiagonosticDetailsActivity extends AppCompatActivity {
    ImageView place_img;
    TextView place_name,place_desc,place_location,place_contactNumbertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_details);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Diagnostics Details List");


        place_img = (ImageView) findViewById(R.id.place_img);
        place_name = (TextView) findViewById(R.id.dianame);
        place_desc = (TextView) findViewById(R.id.diaDescrptn);
        place_location = (TextView) findViewById(R.id.LoctText);
        place_contactNumbertext = (TextView) findViewById(R.id.diaNumber);
        String getDocName = getIntent().getExtras().getString("docName");

        if (getDocName.equals("APEX DIAGNOSTIC SERVICES (PVT.) LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("368/ B-1, GULBAG AGRABAD EXCESS ROAD,\n" +
                    "CHITTAGONG,  BANGLADESH.");
            place_contactNumbertext.setText("031-2516664");


        }
        if (getDocName.equals("BANGLADESH DIAGNOSTIC ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("106/A, K.B. Fazlul Quader Road, Chittagong ");
            place_contactNumbertext.setText("031-653010.");


        }


        if (getDocName.equals("BIOPATH LABORATORY")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("84, Jamal Khan Road, Chittagong");
            place_contactNumbertext.setText("031-618533");


        }

        if (getDocName.equals("BASIC LAB")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("20, K.B. Fazlul Kader Road, Chittagong ");
            place_contactNumbertext.setText("031-652652");


        }

        if (getDocName.equals("BIOCHEMISTRY LAB")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("106/A, K.B. Fazlul Quader Road, Chittagong ");
            place_contactNumbertext.setText("0607 4304303 ");


        }

        if (getDocName.equals("CARE INVESTIGATION ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("106/A, K.B. Fazlul Quader Road, Chittagong");
            place_contactNumbertext.setText("031-651522,031-2550253");


        }
        if (getDocName.equals("CENTRAL LAB ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("417, M. M. Ali Road, Dampara Police Line,\n" +
                    "Chittagong ");
            place_contactNumbertext.setText("0191883053 ");


        }
        if (getDocName.equals("CHATTAGRAM METROPOLITAN HOSPITAL (PVT) LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("487/B, O.R. Nizam Road, Chittagong ");
            place_contactNumbertext.setText("031 620634.Pabx 031 654732, 031 655791, 031 651242, Ext 104/114/115.\n" +
                    "07. ");


        }

        if (getDocName.equals("CHECK UP MEDICAL SERVICES LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("132, Panchlaish R/A, Chittagong");
            place_contactNumbertext.setText("031 655219, 031 657919, 031 657920");


        }

        if (getDocName.equals("CHEVRON CLINICAL LABORATORY (PVT.) LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("12/12, O. R. Nizam Road. Panchlaish,\n" +
                    "Chittagong ");
            place_contactNumbertext.setText("031 652963, 031 652860, 031 652533. ");


        }
        if (getDocName.equals("CHITTAGONG BELLEVUE LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("1530/A, O.R. Nizam Road. & 79/A, Jamal Khan Road, Chittagong ");
            place_contactNumbertext.setText("031-651590,031-652378,031-635018, 031-623310.");


        }
        if (getDocName.equals("CHITTAGONG DOCTORS LAB (PVT.) LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("131, K.B. Fazlul Quader Road, Chittagong ");
            place_contactNumbertext.setText(" 031-650868, 031-650869. ");


        }
        if (getDocName.equals("CHITTAGONG LAB LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("20. K.B. Fazlul Kader Road. Panchlaish. Chittagong ");
            place_contactNumbertext.setText("031-653135, 031-650702");


        }
        if (getDocName.equals("CHITTAGONG POLY CLINIC (PVT) LTD")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("33, Panchlaish R/A, Chittagong ");
            place_contactNumbertext.setText("031-656041,031-657345, 031-650911");


        }
        if (getDocName.equals("CITY HEALTH CLINIC ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("Chattashari Road, Chittagong ");
            place_contactNumbertext.setText("031 619773, 031 619820");


        }
        if (getDocName.equals("CRESCENT DIAGNOSIS ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("57, K.B. Fazlul Quader Road, Chittagong ");
            place_contactNumbertext.setText("031 654185, 031 656562");


        }
        if (getDocName.equals("C.T. IMAGING & DIAGNOSTIC CENTRE LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("50, K.B. Fazlul Quader Road, Chittagong");
            place_contactNumbertext.setText(" 031 652342. ");


        }
        if (getDocName.equals("CHITTAGONG METROPOLITAN HASPATAL DIAGNOSTIC LABORATORY")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("487/B, O.R. Nizam Road, Chittagong ");
            place_contactNumbertext.setText(" 031-620634, 031-652750, 031-654732, 031-651242");


        }
        if (getDocName.equals("DIASONIC DIAGNOSTIC CENTRE")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("Minhaz Complex. 12, Jamal Khan Road,\n" +
                    "Chittagong ");
            place_contactNumbertext.setText("031-632980,031-620323 ");


        }
        if (getDocName.equals("DIVINE DIAGNOSTIC LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("65, Jamal Khan Road, Chittagong ");
            place_contactNumbertext.setText("031 639757 ");


        }
        if (getDocName.equals("DR. MAHFUZUR RAHMAN'S LAB ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("58, Chatteswari Road. Chawkbazar. Chittagong ");
            place_contactNumbertext.setText("031-619057, 01819339286");


        }
        if (getDocName.equals("DR. MUSH DENTAL CLINIC ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("40, Momin Road, Kadammobarak");
            place_contactNumbertext.setText("031-634335");


        }
        if (getDocName.equals("EAGLES EYE DIAGNOSTIC ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("94, K. B. Fazlul Kader Road. Chawk Bazar, Chittagong");
            place_contactNumbertext.setText("031 658911, 031 657655");


        }
        if (getDocName.equals("EVERGREEN CLINIC (PVT) LTD. ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("23/A. M.M. Ali Road.Mahdibag,Chittagong");
            place_contactNumbertext.setText("031 620217. 031 623687");


        }
        if (getDocName.equals("HEALTH HOME PVT. LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("53, Panchlaish RIA, Chittagong ");
            place_contactNumbertext.setText("031-651568,031-651571");


        }
        if (getDocName.equals("HEALTH SENSE DIAGNOSTIC CENTRE")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("14, Panchlaish RlA. Chittagong ");
            place_contactNumbertext.setText("031-656592, 031-653913");


        }
        if (getDocName.equals("KIDNEY DIAGNOSTIC COMPLEX ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("100/101, Jame Maszid Market, Anderkilla, Chittagong");
            place_contactNumbertext.setText(" 01819 801753");


        }
        if (getDocName.equals("LAB EXPERTS (PVT) LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("83, Jamal Khan Road, Chittagong ");
            place_contactNumbertext.setText("031-616899 ");


        }
        if (getDocName.equals("LANCET ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("106/B, K. B. Fazlul Kader Road, Panchlaish,\n" +
                    "Chittagong ");
            place_contactNumbertext.setText("031-657319, 0189395116 ");


        }
        if (getDocName.equals("LIFE CARE CENTRE ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("129, Panchlaish R/A, Chittagong");
            place_contactNumbertext.setText("031 654588, 031 654468");


        }
        if (getDocName.equals("MAGNUM DIAGNOSTIC COMPLEX ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("39, Momin Road, Chittagong ");
            place_contactNumbertext.setText("031 617060, 031 613117");


        }
        if (getDocName.equals("MAHANAGAR CLINIC (PVT) LTD.")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("20, O.R. Nizam Road. Panchlaish R/A, Chittagong");
            place_contactNumbertext.setText("031 650928, 031 650457");


        }
        if (getDocName.equals("MEDI AID COMPLEX (PVT) LTD")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("20, K.B. Fazlul Kader Road Chittagong ");
            place_contactNumbertext.setText("031 654046, 031 654068.");


        }
        if (getDocName.equals("MEDICAL CENTRE (PVT) CLINIC ")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("953, O.R. Nizam Road\n" +
                    "Chittagong ");
            place_contactNumbertext.setText("031-651054,651944, 658501-04");


        }
        if (getDocName.equals("MEDICAL POINT")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("19, K.B. Fazlul Kader Road, Chittagong ");
            place_contactNumbertext.setText("031 650906, 031 652769, ");


        }
        if (getDocName.equals("METRO DIAGNOSTI CENTER LIMITED")) {

            place_img.setImageResource(R.drawable.firstaiddet);
            place_name.setText(getDocName);
            place_desc.setText("Diagnostic Services; \n" +
                    "Clinic; \n" +
                    "Cardiac Imaging Services; \n" +
                    "Gastroenterology Service; \n" +
                    "Laboratory Services; \n" +
                    "Pulmonology Service; \n" +
                    "Radiology and Imaging; ");
            place_location.setText("\n" +
                    "Gol Pahar Moor Chittagong,mehdibagh\n" +
                    "Chittagong\n");
            place_contactNumbertext.setText("031-2850630\n" +
                    "031-2850631\n" +
                    "031-2851677");


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
