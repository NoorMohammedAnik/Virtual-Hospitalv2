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
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Hospital Details");

        place_img = (ImageView) findViewById(R.id.place_img);
        place_name = (TextView) findViewById(R.id.txt_place_name);
        place_desc = (TextView) findViewById(R.id.txt_place_description);
        place_location = (TextView) findViewById(R.id.txt_place_location);


        String getPlaceName = getIntent().getExtras().getString("hospitalName");


        if (getPlaceName.equals("C.S.C.R")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("Center for Specialized Care & Research (CSCR), better known as CSCR, CSCR Chittagong, and Chittagong CSCR, is a leading clinical lab service centre in Chittagong consists of a full-featured hospital, diagnostic laboratory, and specialist doctors. It was established in 1999. Since then, CSCR has been providing high quality diagnostic laboratory services, renowned physicians and surgeons’ consultation services to the patients and a hospital with all modern facilities under one roof, first in its kind. CSCR Chittagong is always open (24/7) for the general public. ");
            place_location.setText("Probotok Moor , Chittagong.");


        }


        if (getPlaceName.equals("Chattagram Maa-Shishu General Hospital")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("Chattagram Maa-O-Shishu Hospital Medical College (CMOSHMC) is a private medical college along with hospital in Bangladesh, established in 2005. It is located in Agrabad, Chittagong. It is affiliated with University of Chittagong.\n" +

                    "It offers a five-year course of study leading to a Bachelor of Medicine, Bachelor of Surgery (MBBS) degree. A one-year internship after graduation is compulsory for all graduates. The degree is recognised by the Bangladesh Medical and Dental Council.");
            place_location.setText(" Agrabad, Chittagong");


        }
        if (getPlaceName.equals("CHEVRON")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("Chevron Clinical Laboratory (Pte.) Ltd. was incorporated on 22nd February, 1984, and started operation on 16th May, 1984, in Chittagong as an integrated investigative laboratory. It was a pioneering venture in the filed of automated diagnostics in Bangladesh. Beginning with an initial investment of Tk.7.5 million, the Company has grown over the year to a concern worth Tk.250 million in the year 2006.\n" +
                    "There is routine update of the technology in order to remain at per with international standard. Reputed Pathologists, Haematologist, Microbiologists, Histopathlogist, Bio-chemists, Sonologists, Radiologists, Gastroenterologists and Cardiologists supervice trained Paramedics and other personnel in ensuring the highest possible quality of services. For maintenance of the sophisticated equipments, a sound group of Electrical and Electronics Engineers are also at work.");
            place_location.setText("12/12 O.R. Nizam Rd, Chittagong 4203, Bangladesh");


        }
        if (getPlaceName.equals("Chittagong Health Care Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("Specialized Hospital with ICU, CCU, NICU, KDU and General with VIP cabin for all Patients care according to need with all diagnostic supports.");
            place_location.setText("Mirzapul Rd, Chittagong, Bangladesh");


        }
        if (getPlaceName.equals("Chittagong Metropolitan Hospital Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("This is one of private hospital in chittagong city. Chittagong metropolitan hospital given best service with their patient. Here all of modern treatment equipment have but their treatment cost is little bit high.");
            place_location.setText("\n" +
                    "948 OR. Nizam Road\n" +
                    "Chittagong\n");


        }
        if (getPlaceName.equals("Chittagong Poly Clinic Pvt. Ltd.")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("Specialized Hospital with ICU, CCU, NICU, KDU and General with VIP cabin for all Patients care.");
            place_location.setText("\n" +
                    "33 Chittagong,Pachlaish\n" +
                    "Chittagong\n");


        }
        if (getPlaceName.equals("Ekhushe Hospital")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("All kinds of health care services (including medical and surgical) are available here under direct supervision of consultants on different disciplines..");
            place_location.setText("Mirjarpool, Muradpur, Chittagong. (Sugandha Rd 2)\n" +
                    "Chittagong");


        }
        if (getPlaceName.equals("General Hospital")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("General Hospital, Chittagong was originally established as a dispensary in 1840. The clinic was developed into a General Hospital on the Rangmahal Hill in Andarkilla, Chittagong. This hill is historically important as the site of the Arakani Fort, which was burnt and ravaged by the action of the Mughal Navy in their endeavour to conquer Chittagong in AD 1666.\n" +
                    "\n" +
                    "A Dhyani Buddha (Buddha at meditation) Sculpture was found on the Rangmahal Hill under a Shimul tree on 20 July 1904. This sculpture is now preserved in the Chittagong Buddha Vihara. The vestiges of a 2.24m wide ruined wall are currently traceable underneath an extension of the hospital building to the north. The two-storeyed hospital building, with a trigonal engaged tower containing spiral stairs in the centre of the north fa'ade, had an accommodation for 52 indoor patients, 40 males and 12 females. This colonial building is now being conserved and remains a landmark of the city.");
            place_location.setText("Anderkillah, Chittagong");


        }
        if (getPlaceName.equals("Holy Crescent Hospital (Pvt.) Ltd")) {

            place_img.setImageResource(R.drawable.hospitalforlist);
            place_name.setText(getPlaceName);
            place_desc.setText("All kinds of health care services (including medical and surgical) are available here under direct supervision of consultants on different disciplines..");
            place_location.setText("\n" +
                    "500/A, Zakir Hossain Road Chittagong,Khulshi\n" +
                    "Chittagong\n.");
        }

//        if (getPlaceName.equals("Ibrahim Iqbal Memorial Hospital Limited"))
//        {
//
//            place_img.setImageResource(R.drawable.hospitalforlist);
//            place_name.setText(getPlaceName);
//            place_desc.setText("Ibrahim Iqbal Memorial Hospital Ltd. founded by the BGC Trust is planned to function as teaching based Hospital of BGC Trust Medical College with the objective of teaching, training and research facilities for the students, internee doctors. BGC Trust Medical College and Ibrahim Iqbal Memorial Hospital Ltd. providing specialized medical care to the people of Bangladesh. The construction of hospital bed 500 (Phase-1) is already completed. The Hospital construction for 1000-bed (Phase-11) is projected to be completed within next 2-3 years. The hospital is equipped with modern machineries and facilities. All sorts of investigation facilities are available here. Experienced and renowned Professors and Consultants from Bangladesh and India providing quality services in this hospital.");
//            place_location.setText(" Chandanaish Upazila, Bangladesh.");
//
//
//        }
            if (getPlaceName.equals("Memon City Corporation")) {

                place_img.setImageResource(R.drawable.hospitalforlist);
                place_name.setText(getPlaceName);
                place_desc.setText("    To provide good health care services with operation facilities to the pregnant women with minimum cost.\n" +
                        "    Air conditioned general bed and cabin facilities.\n" +
                        "    Antenatal and post natal checkup\n" +
                        "    EPI and other vaccination Facilities.\n" +
                        "    Pediatrics outdoor.\n" +
                        "    Fulltime ambulance service.\n" +
                        "    Family planning facilities.\n" +
                        "    Adolescent health care & advice on reproductive health.\n" +
                        "    Neonatal health care service.\n" +
                        "    HIV / AIDS and other STI’s services.\n" +
                        "    Services for Mother and Child nutrition.\n" +
                        "    Evening shift outdoor treatment for working women.\n" +
                        "    Pathology X-ray, Ultra-sonography, ecg, Blood Bank, Dead Body washer, Etc\n");
                place_location.setText("55- Sadarghat Road. Chittagong-4000.");


            }
            if (getPlaceName.equals("Medical Centre (Pvt) Clinic")) {

                place_img.setImageResource(R.drawable.hospitalforlist);
                place_name.setText(getPlaceName);
                place_desc.setText("- Medicine Specialist\n" +
                        "- Nephrology & Medicine Specialist\n" +
                        "- Gastroenterology & Cardiology Specialist\n" +
                        "- Medicine & Neuro-Medicine Specialist\n" +
                        "- Medicine & Gastroenterology Specialist\n" +
                        "- Diabetics & Hormone Specialist\n" +
                        "- Cardiology Specialist\n" +
                        "- Cardiology & Medicine Specialist\n" +
                        "- Surgery Specialist\n" +
                        "- Eye Specialist\n" +
                        "- Urology & Surgery Specialist\n" +
                        "- Orthopedic Surgery Specialist\n" +
                        "- ENT Specialist\n" +
                        "- Neurosurgery Specialist\n" +
                        "- Dermatology Specialist\n" +
                        "- Child Specialist\n" +
                        "- Gynae & Obs. Specialist\n" +
                        "- Cancer Specialist\n" +
                        "- Physical Medicine Specialist\n" +
                        "- Radiologist Specialist\n" +
                        "- Pathologist Specialist ");
                place_location.setText("GEC Circle Chittagong.");


            }
            if (getPlaceName.equals("Mahanagar Clinic")) {

                place_img.setImageResource(R.drawable.hospitalforlist);
                place_name.setText(getPlaceName);
                place_desc.setText("Anesthesia, E. C. G.,News paper & TV in waiting room,Operation theatre,Own diagnostic Lab,Oxygen supply,Pharmacy,Post operative bed,Ultra sonogram,Waiting room,X-Ray");
                place_location.setText("20, O R Nizam Road, Panchlaish Chittagong");


            }
            if (getPlaceName.equals("Labaid Specialized Hospital - Chittagong")) {

                place_img.setImageResource(R.drawable.hospitalforlist);
                place_name.setText(getPlaceName);
                place_desc.setText("Anesthesia, E. C. G.,News paper & TV in waiting room,Operation theatre,Own diagnostic Lab,Oxygen supply,Pharmacy,Post operative bed,Ultra sonogram,Waiting room,X-Ray");
                place_location.setText("Forum Central (2nd floor), 787/863 M M Ali Road, Gol Pahar Mor, Mehedi Bag, Chittagong");


            }


            if (getPlaceName.equals("Royal Hospital")) {

                place_img.setImageResource(R.drawable.hospitalforlist);
                place_name.setText(getPlaceName);
                place_desc.setText("Anesthesia, E. C. G.,News paper & TV in waiting room,Operation theatre,Own diagnostic Lab,Oxygen supply,Pharmacy,Post operative bed,Ultra sonogram,Waiting room,X-Ray");
                place_location.setText(" O.R. Nizam Rd, Chittagong, Bangladesh");


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
