package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rr.virtual_hospital.hospital.HospitalDetailsActivity;
import com.example.rr.virtual_hospital.hospital.HospitalListActivity;

public class DocsActivity extends AppCompatActivity {
    ListView listView;
    String[] docs_Name={"Prof. (Dr.) M.A. Faiz","Prof. (Dr.) Faridul Islam","Prof. (Dr.) Md. Gofranul Hoque","Dr. Md. Amir Hossain",
            "Dr. Anisul Awal","Dr. Mehrunnissa Khanom","Prof. (Dr.) Emran Bin Yunus","Dr. M.A. Kashem","Dr. Md. Abdul Quader","Prof. (Dr.) Md. Ridwanur Rahman","Dr. Md. Hasanuzzaman","Prof (Dr.) Mulkutur Rahman","Prof. Brig Gen. (Dr.) SK. Md. Bahar Hussain","Dr. Shamim Boksha",
            "Dr. Md. Iftikher Hossain Khan","Dr. Jamal Ahmed","Dr. Mohammad Ibrahim Chowdhury","Dr. Mohammad Ibrahim Chowdhury","Dr. Khondker A K Azad",
            "Dr. Md. Sanaullah Shelly","Prof. (Dr.) S. M. Tariq","Prof. (Dr.) Omar Faruque Yusuf","Prof. (Dr.) M. Manzurul Islam","Dr. Md. O.F.G. Kibria",
            "Dr. Md. Samirul Islam",
            "Prof. (Dr.) Nil Kantha Bhatachharja","Prof. (Dr.) Md Zillur Rahman","Dr. Zeenat Meraj Chowdhury",
            "Prof. (Dr.) Wazir Ahmed","Dr. Ekramul Hoque","Dr. Rasheda Samad",
            "Prof. (Dr.) Shamsunnahar","Dr. Rowshan Morshed","Dr. Shahena Akter","Dr. Shoyela Shahnaz","Dr. Shamima Anwar","Dr. Sajjad Mohammed Yusuff","Prof. Aminuddin A Khan","Dr. Shaik Ahmed","Dr. Md. Qumrul Ahsan","Dr. Anisul Moula","Dr. Rehnuma Rashid","Dr. Syed Ahmed","Dr. Nasima Akter"};
    int[] pic={R.drawable.fordocstethoscope};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docs);
        listView=(ListView)findViewById(R.id.listDoc);
        CustomForDoc customForDoc= new CustomForDoc(getApplicationContext(),docs_Name,pic);
        listView.setAdapter(customForDoc);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(DocsActivity.this, DocDetailsActivity.class);
                intent.putExtra("docName", docs_Name[position]);
                Toast.makeText(getApplicationContext(), "" + docs_Name[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });

    }
}
