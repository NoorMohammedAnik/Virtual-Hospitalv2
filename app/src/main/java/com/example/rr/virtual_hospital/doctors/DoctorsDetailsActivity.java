package com.example.rr.virtual_hospital.doctors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rr.virtual_hospital.R;

public class DoctorsDetailsActivity extends AppCompatActivity {
    ImageView place_img;
    TextView place_name,place_desc,place_location,place_vistingtext,place_contactNumbertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_details);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Doctor's Details");

        place_img = (ImageView) findViewById(R.id.place_img);//image of doc
        place_name = (TextView) findViewById(R.id.doctorsname);//name
        place_desc = (TextView) findViewById(R.id.spclText);//Specialist
        place_location = (TextView) findViewById(R.id.chmbrLoct);//Chember
        place_vistingtext = (TextView) findViewById(R.id.vistingHourText);//Visting Hour
        place_contactNumbertext = (TextView) findViewById(R.id.contectNumberText);// Contact Number
        String getDocName = getIntent().getExtras().getString("docName");


        if (getDocName.equals("Prof. (Dr.) M.A. Faiz")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText(" 01812-448233");
            place_vistingtext.setText("11:00AM–2:00PM");


        }

        if (getDocName.equals("Prof. (Dr.) Faridul Islam")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText(" 5:00PM-11:00PM");


        }

        if (getDocName.equals("Prof. (Dr.) Md. Gofranul Hoque")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText(" 6:30PM-11:00PM");


        }

        if (getDocName.equals("Dr. Md. Amir Hossain")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText("8:00PM-11:00PM");


        }
        if (getDocName.equals("Dr. Anisul Awal")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText("Thursday: 9:30PM-11:30PM, Friday: 12:30PM-3:00PM");


        }
        if (getDocName.equals("Dr. Mehrunnissa Khanom")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText("9:00AM-12:30PM");

        }
        if (getDocName.equals("Prof. (Dr.) Emran Bin Yunus")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Nephrology & Medicine Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText("5:00PM-10:00PM");

        }

        if (getDocName.equals("Dr. M.A. Kashem")) {

            place_img.setImageResource(R.drawable.img_doctor);
            place_name.setText(getDocName);
            place_desc.setText("Nephrology Specialist");
            place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
            place_contactNumbertext.setText("01744589950");
            place_vistingtext.setText("7:00PM-11:00PM");
        }

            if (getDocName.equals("Dr. Md. Abdul Quader")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Gastroenterology & Cardiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950");
                place_vistingtext.setText("7:00PM-11:00PM");


            }

            if (getDocName.equals(" Prof.(Dr.) Md. Ridwanur Rahman")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Medicine & Neuro-Medicine Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950");
                place_vistingtext.setText("Visiting Hour: Thursday: 11:00PM");

            }

            if (getDocName.equals("Dr. Md. Hasanuzzaman")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Medicine & Neuro-Medicine Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950");
                place_vistingtext.setText("7:00PM-11:00PM");


            }

            if (getDocName.equals("Prof (Dr.) Mulkutur Rahman")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Medicine & Gastroenterology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950");
                place_desc.setTextColor(Color.BLUE);
                place_vistingtext.setText("1:00PM-3:00PM,7:00PM-11:00PM");


            }

            if (getDocName.equals("Prof. Brig Gen. (Dr.) SK. Md. Bahar Hussain")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Medicine & Gastroenterology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("8:15PM-11:15PM");

            }

            if (getDocName.equals("Dr. Shamim Boksha")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Medicine & Gastroenterology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("12:00PM-3:00PM");


            }

            if (getDocName.equals("Dr. Md. Iftikher Hossain Khan")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Diabetics & Hormone Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:00PM-10:00PM");

            }
            if (getDocName.equals("Dr. Jamal Ahmed")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Cardiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:30PM-11:00PM");


            }
            if (getDocName.equals("Dr. Mohammad Ibrahim Chowdhury")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Cardiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("5:00PM-10:00Pm ");


            }




            if (getDocName.equals("Dr. Khondker A K Azad")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:30PM-10:00PM");


            }
            if (getDocName.equals("Dr. Md. Sanaullah Shelly")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:30PM-10:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) S. M. Tariq")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Eye Specialist");
               place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-9:30PM");


            }

            if (getDocName.equals("Prof. (Dr.) Omar Faruque Yusuf")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Urology & Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:00PM-9:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) M. Manzurul Islam")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Orthopedic Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("1:00PM-2:30PM,7:00PM-10:00PM");


            }
            if (getDocName.equals("Dr. Md. O.F.G. Kibria")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Orthopedic Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("1:00PM-2:30PM,7:00PM-10:00PM");


            }
            if (getDocName.equals("Dr. Md. Samirul Islam")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Orthopedic Surgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText(" 7:00PM-10:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) Nil Kantha Bhatachharja")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("ENT Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950");
                place_vistingtext.setText("10:00AM-1:00PM, 6:00PM-9:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) Md Zillur Rahman")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Neurosurgery Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("Thursday: 7:00PM-1:00AM,Friday: 11:00AM-1:00PM,7:00PM-1:00AM");


            }
            if (getDocName.equals("Dr. Zeenat Meraj Chowdhury")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Dermatology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:00PM-11:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) Wazir Ahmed")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Child Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:00PM-11:00PM");

            }
            if (getDocName.equals("Dr. Ekramul Hoque")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Child Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("5:00PM-9:00PM");


            }
            if (getDocName.equals("Dr. Rasheda Samad")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Child Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("7:00PM-11:00PM, Friday: 11:00AM-2:00PM");


            }
            if (getDocName.equals("Prof. (Dr.) Shamsunnahar")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Gynae & Obs. Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("1:30PM-3:00PM");

            }
            if (getDocName.equals("Dr. Rowshan Morshed")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Gynae & Obs. Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:00PM-11:00PM");


            }
            if (getDocName.equals("Dr. Shahena Akter")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Gynae & Obs. Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("9:00PM-11:00PM");


            }
            if (getDocName.equals("Dr. Shoyela Shahnaz")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Gynae & Obs. Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText(" 8:00PM-10:00PM");


            }
            if (getDocName.equals("Dr. Shamima Anwar")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Cancer Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText(" 9:00PM-11:00PM");

            }
            if (getDocName.equals("Dr. Sajjad Mohammed Yusuff")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Cancer Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("8:00PM-11:30PM");


            }
            if (getDocName.equals("Prof. Aminuddin A Khan")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Physical Medicine Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10:00PM");


            }
            if (getDocName.equals("Dr. Shaik Ahmed")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Physical Medicine Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10:00PM");


            }
            if (getDocName.equals("Dr. Md. Qumrul Ahsan")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Radiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("9:00AM–2:30PM");


            }
            if (getDocName.equals("Dr. Anisul Moula")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Radiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10PM");


            }
            if (getDocName.equals("Dr. Rehnuma Rashid")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Radiology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10PM");


            }
            if (getDocName.equals("Dr. Syed Ahmed")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Pathology Specialist");
                place_location.setText("C.S.C.R. Probotok Moor , Chittagong.");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10PM");


            }
            if (getDocName.equals("Dr. Nasima Akter")) {

                place_img.setImageResource(R.drawable.img_doctor);
                place_name.setText(getDocName);
                place_desc.setText("Pathology Specialist");
                place_location.setText("Chittagong Medicle College");
                place_contactNumbertext.setText("01744589950,");
                place_vistingtext.setText("6:30PM-10PM");



            }
        }

        //for back button
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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
