package com.example.rr.virtual_hospital.profile;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.rr.virtual_hospital.MainActivity;
import com.example.rr.virtual_hospital.R;
import com.example.rr.virtual_hospital.prescription.UploadPrescription;
import com.example.rr.virtual_hospital.prescription.model.Prescriptions;
import com.example.rr.virtual_hospital.profile.adapters.PagerAdapterSmall;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import customfonts.customfonts.MyTextView;

public class Profile extends AppCompatActivity implements View.OnClickListener {
    private static final String endpoint = "http://api.androidhive.info/json/glide.json";
    private String profileDataURL = "";
    private String prescriptionTasksURL= "";
    private ViewPager viewPagerSmall;
    PagerAdapterSmall PAS;
    private MyTextView mobile,name,division,bloodgroup;
    private LinearLayout llname, llcell, lldivision, llblood;
    private ProgressDialog loading;
    private SharedPreferences sp;
    private RequestQueue rq;
    private Button btnUploadActivity,btnDirectory,btnLogout;
    //temps
    private ArrayList<Prescriptions> prescs;
    private Map<String, String> updateData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Profile");

        viewPagerSmall=(ViewPager) findViewById(R.id.small_swipe_presc);
        profileDataURL=getString(R.string.serverIp)+"profile.php";
        name = (MyTextView) findViewById(R.id.txt_profile_name);
        bloodgroup = (MyTextView) findViewById(R.id.txt_profile_blood);
        division = (MyTextView) findViewById(R.id.txt_profile_division);
        mobile = (MyTextView) findViewById(R.id.txt_profile_mobile);
        btnUploadActivity= (Button) findViewById(R.id.btn_upload_prescs);
        btnDirectory=(Button) findViewById(R.id.btn_visit_blood_bank);
        btnLogout=(Button) findViewById(R.id.btn_logout);

        prescriptionTasksURL=getString(R.string.serverIp)+"prescription.php";
        updateData=new HashMap<>();
        sp=getSharedPreferences("vHospUserData",MODE_PRIVATE);
        loading = new ProgressDialog(this);
        loading.setTitle("Loading...");
        loading.setMessage("Loading profile information");
        View view= findViewById(R.id.profile_layout_content);
       final Snackbar sn= Snackbar.make(view,"Slide the pictures above to See Your Uploaded Prescriptions",Snackbar.LENGTH_INDEFINITE);

        sn.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sn.dismiss();
            }
        }).show();

        llname = (LinearLayout) findViewById(R.id.profile_llname);
        llcell = (LinearLayout) findViewById(R.id.profile_llcell);
        lldivision = (LinearLayout) findViewById(R.id.profile_lldivision);
        llblood = (LinearLayout) findViewById(R.id.profile_llblood);

        llname.setOnClickListener(this);
        llcell.setOnClickListener(this);
        lldivision.setOnClickListener(this);
        llblood.setOnClickListener(this);

        prescs=new ArrayList<>();

        //temps
        rq= Volley.newRequestQueue(this);
        fetchUserProfileFromServer();
        fetchPrescriptionImagesFromServer();
       // fetchFromServer();
        btnUploadActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Profile.this, UploadPrescription.class));
            }
        });
        btnDirectory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Profile.this,BloodBank.class));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=sp.edit();
                editor.clear().apply();
                Profile.this.finish();
                startActivity(new Intent(Profile.this, MainActivity.class));
            }
        });

    }


    private void fetchUserProfileFromServer() {
        loading.show();
        StringRequest profileDataStr = new StringRequest(Request.Method.POST, profileDataURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("profile_rsp", response);
                try {
                    JSONObject userData = new JSONObject(response);
                    name.setText(userData.getString("user_name"));
                    mobile.setText(userData.getString("user_mobile"));
                    division.setText(userData.getString("division"));
                    bloodgroup.setText(userData.getString("blood_group"));
                    //load image using Glide
                    loading.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(Profile.this, "Server Error", Toast.LENGTH_SHORT).show();
                    loading.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Profile.this, "Connection Error", Toast.LENGTH_SHORT).show();
                Log.d("profile_err",error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("task", "getData");
                params.put("user_mobile", sp.getString("user_mobile", "none"));
                return params;
            }
        };
        rq.add(profileDataStr);
    }

    //this should be used only for testing
    private void fetchFromServer() {
        JsonArrayRequest jreq=new JsonArrayRequest(endpoint, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d("ProfileResponse", response.toString());

           //     imgURL=new String[response.length()];
             //   PAS=new PagerAdapterSmall(Profile.this,imgURL);
                for(int i=0;i<response.length();i++){
                    try {
                        JSONObject object= response.getJSONObject(i);

                        JSONObject url= object.getJSONObject("url");
                   //     imgURL[i]=url.getString("medium");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                viewPagerSmall.setAdapter(PAS);
                PAS.notifyDataSetChanged();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ProfileResponse", "Error: " + error.getMessage());
            }
        });

        rq.add(jreq);
    }

    //to fetch all the prescriptions from this user
    private void fetchPrescriptionImagesFromServer() {
        StringRequest streq=new StringRequest(Request.Method.POST, prescriptionTasksURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("prescResp",response);
                JSONArray allData= null;
                try {
                    allData = new JSONArray(response);

                    for (int i = 0; i < allData.length(); i++) {
                        JSONObject singleData = allData.getJSONObject(i);
                        Prescriptions prsc=new Prescriptions();
                        prsc.setId(singleData.getString("id"));
                        prsc.setUserid(singleData.getString("user_id"));
                        prsc.setName(singleData.getString("prescription_name"));
                        prsc.setUrl(singleData.getString("prescription_image"));
                        prescs.add(prsc);
                    }

                    PAS=new PagerAdapterSmall(Profile.this,prescs);
                    viewPagerSmall.setAdapter(PAS);
                    PAS.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Profile.this, "Error Loading Prescriptions", Toast.LENGTH_SHORT).show();
                Log.d("prescsErr",error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>();
                params.put("task","download_prescription");
                params.put("user_id",sp.getString("user_id",""));

                return params;
            }
        };

        rq.add(streq);
    }


    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        final EditText input = new EditText(Profile.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        // updateData.clear();
        builder.setTitle("Edit Data");
        //set message inside case:
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String data = input.getText().toString();
                updateData.put("value", data);
                sendDataToServer(dialogInterface, updateData);
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })
                .setView(input);

        switch (view.getId()) {
            case R.id.profile_llcell:
                builder.setMessage("Update your phone number:");
                updateData.put("updateVar", "mobile");
                builder.show();
                break;
            case R.id.profile_llname:
                builder.setMessage("Update your name");
                updateData.put("updateVar", "name");
                builder.show();
                break;
            case R.id.profile_llblood:
                builder.setMessage("Update your blood Group");
                updateData.put("updateVar", "blood_group");
                builder.show();
                break;
            case R.id.profile_lldivision:
                builder.setMessage("Update your Division");
                updateData.put("updateVar", "division");
                builder.show();
                break;
        }
    }

    private void sendDataToServer(final DialogInterface dialogInterface, final Map<String, String> updateData) {
        StringRequest profileRequest = new StringRequest(Request.Method.POST, profileDataURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Profile.this, response, Toast.LENGTH_SHORT).show();
                if(updateData.get("updateVar").equals("mobile")){
                    SharedPreferences.Editor editor=sp.edit();
                    editor.putString("user_mobile",updateData.get("value"));
                    editor.apply();
                }
                fetchUserProfileFromServer();
                dialogInterface.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Profile.this, "Network error", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                updateData.put("task", "editData");
                updateData.put("user_id", sp.getString("user_id", "none"));
                return updateData;
            }
        };

        rq.add(profileRequest);
    }

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
