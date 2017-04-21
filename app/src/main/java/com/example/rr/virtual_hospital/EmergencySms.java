package com.example.rr.virtual_hospital;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONException;
import org.json.JSONObject;
//Should Be Replaced

public class EmergencySms extends AppCompatActivity {



    EditText etxtMsg,etxtNumber1,etxtNumber2,etxtNumber3,etxtName;
    TextView txtLocation;
    Button btnSend,btnSave,btnEdit;
    private RequestQueue requestQueue;

    private LocationManager locationManager;
    private LocationListener listener;

    //Declare SharedPreferences
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    public String prefName,prefNumber1,prefNumber2,prefNumber3,prefMsg;


    //Shared Preference xml file
    public static final String PREFS_SMS ="com.example.rr.virtual_hospital.emergency_sms ";


    double latitude;
    double longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_sms);


        btnSend=(Button)findViewById(R.id.btnSend);
        btnEdit=(Button)findViewById(R.id.btnEdit);
        btnSave=(Button)findViewById(R.id.btnSave);


        txtLocation =(TextView)findViewById(R.id.etxtLocation);
        etxtName=(EditText)findViewById(R.id.etxtName);
        etxtNumber1=(EditText)findViewById(R.id.etxtNumber1);
        etxtNumber2=(EditText)findViewById(R.id.etxtNumber2);
        etxtNumber3=(EditText)findViewById(R.id.etxtNumber3);
        etxtMsg=(EditText) findViewById(R.id.etxtMessage);

        etxtName.setTextColor(Color.BLUE);
        etxtNumber1.setTextColor(Color.BLUE);
        etxtNumber2.setTextColor(Color.BLUE);
        etxtNumber3.setTextColor(Color.BLUE);
        etxtMsg.setTextColor(Color.BLUE);
        txtLocation.setTextColor(Color.BLUE);


        //Creating SharedPreferences name game and mode is private
        pref=getSharedPreferences(PREFS_SMS,MODE_PRIVATE);
        editor=pref.edit();


        //set initial score
        //prefName = pref.getString("variableNameIn_xml_file","your_value");
        prefName = pref.getString("name","");
        prefNumber1=pref.getString("number1","");
        prefNumber2=pref.getString("number2","");
        prefNumber3=pref.getString("number3","");
        prefMsg=pref.getString("message","");

        etxtName.setText(prefName);
        etxtNumber1.setText(prefNumber1);
        etxtNumber2.setText(prefNumber2);
        etxtNumber3.setText(prefNumber3);
        etxtMsg.setText(prefMsg);

        txtLocation.setClickable(false);
        disableEdittexts();

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Emergency SMS");

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        requestQueue = Volley.newRequestQueue(this);

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {


                latitude=location.getLatitude();
                longitude=location.getLongitude();

                Log.d("Lat",""+latitude);
                Log.d("Lng",""+latitude);

                //   txtCoordinates.setText("Lat="+latitude+" Lng="+longitude);

                getCurrentPlace();
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(i);
                Toast.makeText(EmergencySms.this, "Please Enable Location Service!", Toast.LENGTH_SHORT).show();

            }
        };


        if (ActivityCompat.checkSelfPermission(EmergencySms.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(EmergencySms.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        locationManager.requestLocationUpdates("gps", 5000, 0, listener);



        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableEdittexts();
                Toast.makeText(EmergencySms.this, "Edit Information", Toast.LENGTH_SHORT).show();
            }
        });



        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //// TODO: 2/21/2017




                prefName = etxtName.getText().toString();
                etxtName.setText(prefName);
                editor.putString("name", prefName);
                editor.commit();


                prefNumber1 = etxtNumber1.getText().toString().trim();
                etxtNumber1.setText(prefNumber1);
                editor.putString("number1", prefNumber1);
                editor.commit();


                prefNumber2 = etxtNumber2.getText().toString().trim();
                etxtNumber2.setText(prefNumber2);
                editor.putString("number2", prefNumber2);
                editor.commit();

                prefNumber3= etxtNumber3.getText().toString().trim();
                etxtNumber3.setText(prefNumber3);
                editor.putString("number3", prefNumber3);
                editor.commit();

                prefMsg= etxtMsg.getText().toString();
                etxtMsg.setText(prefMsg);
                editor.putString("message", prefMsg);
                editor.commit();

                disableEdittexts();

                etxtName.setTextColor(Color.BLUE);
                Toast.makeText(EmergencySms.this, "Information Saved!", Toast.LENGTH_SHORT).show();
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String number1=etxtNumber1.getText().toString().trim();
                String number2=etxtNumber2.getText().toString().trim();
                String number3=etxtNumber3.getText().toString().trim();

                String numberArray[]={number1,number2,number3};

                String msg=etxtMsg.getText().toString();



                if(number1.isEmpty() ||number2.isEmpty() || number3.isEmpty() )
                {
                    Toast.makeText(EmergencySms.this, "Number Can't be Empty!", Toast.LENGTH_SHORT).show();

                }

                else if(msg.isEmpty())
                {
                    Toast.makeText(EmergencySms.this, "Message Can't be Empty!", Toast.LENGTH_SHORT).show();


                }

                else {

                    // sendSMS("5554", "Hi You got a message!");
                    sendSMS(numberArray, msg);
           /*here i can send message to emulator 5556. In Real device
            *you can change number*/

                }
            }
        });
    }


    public void getCurrentPlace()
    {

        JsonObjectRequest request=new JsonObjectRequest("https://maps.googleapis.com/maps/api/geocode/json?latlng="+latitude+","+longitude+"&key=AIzaSyC8PTgjIdYxUxZLbsqiEE1a0eBLVjuah5E", new Response.Listener<JSONObject>()
        {
            @Override
            public void onResponse(JSONObject response) {


                try {
                    String address=response.getJSONArray("results").getJSONObject(0).getString("formatted_address");

                    Log.d("place",address);
                    txtLocation.setText(address);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue.add(request);
    }




    //for disable all editTextFields
    private void disableEdittexts() {
        etxtName.setEnabled(false);
        etxtNumber1.setEnabled(false);
        etxtNumber2.setEnabled(false);
        etxtNumber3.setEnabled(false);
        etxtMsg.setEnabled(false);
        // txtLocation.setEnabled(false);
    }

    //for enables all editTextFields
    private void enableEdittexts() {
        etxtName.setEnabled(true);
        etxtNumber1.setEnabled(true);
        etxtNumber2.setEnabled(true);
        etxtNumber3.setEnabled(true);
        etxtMsg.setEnabled(true);
        //txtLocation.setEnabled(true);
    }

    //for sending sms
    private void sendSMS(String phoneNumber[], String message) {

        String location= txtLocation.getText().toString();

        SmsManager sms = SmsManager.getDefault();

        for(int i=0;i<phoneNumber.length;i++) {
            sms.sendTextMessage(phoneNumber[i], null,prefName+" "+ message + " Location: " + location, null, null);
            Toast.makeText(this, "Successfully Message Send to " + phoneNumber[i], Toast.LENGTH_SHORT).show();

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
