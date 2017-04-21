package com.example.rr.virtual_hospital.profile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.rr.virtual_hospital.R;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {

    private ProgressDialog loading;
    private EditText edtName,edtPassword,edtMobile;

    private RequestQueue signQueue;
    private Spinner spnBloodGroup,spnDivisions;
    private Button register;
    private String BloodGroups[]= {"A+","A-","B+","B-","O+","O-","AB+","AB-"},
            Divisions[]= {"Barishal","Chittagong","Dhaka","Khulna","Mymensingh","Rajshahi","Rangpur","Sylhet"};

    private String userRegURL="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Register");

        signQueue= Volley.newRequestQueue(this);
        userRegURL=getString(R.string.serverIp)+"registration.php";

        edtName=(EditText) findViewById(R.id.txt_name);
        edtPassword=(EditText) findViewById(R.id.txt_password);
        edtMobile=(EditText) findViewById(R.id.txt_cell);


        spnBloodGroup= (Spinner) findViewById(R.id.spn_reg_blood_group);

        spnDivisions= (Spinner) findViewById(R.id.spn_reg_division);
       register=(Button)findViewById(R.id.btnSignup);

        ArrayAdapter<String> bloodGroupAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,BloodGroups);
        bloodGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> divisionsAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Divisions);
        divisionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnDivisions.setAdapter(divisionsAdapter);
        spnBloodGroup.setAdapter(bloodGroupAdapter);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobile,password,name,blood_group, division;
                mobile=edtMobile.getText().toString();
                password=edtPassword.getText().toString();
                name=edtName.getText().toString();

                blood_group=spnBloodGroup.getSelectedItem().toString();
                division=spnDivisions.getSelectedItem().toString();

                if(mobile.isEmpty()){
                    edtMobile.setError("Please enter your Mobile number");
                    requestFocus(edtMobile);
                }
                else if(password.isEmpty() || password.length()<4){
                    edtPassword.setError("Please enter a password of 4 or more characters");
                    requestFocus(edtPassword);
                }
                else if(name.isEmpty()){
                    edtName.setError("Please Your Name");
                    requestFocus(edtName);
                }
                else{
                    loading = ProgressDialog.show(SignUp.this, "Sign up...", "Please Wait...", false, false);

                    loading.show();
                    dataToserver(mobile,password,name,blood_group,division);
                }
            }
        });
    }

    private void dataToserver(final String mobile, final String password, final String name, final String blood_group, final String division) {
        StringRequest registerUser= new StringRequest(Request.Method.POST, userRegURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(SignUp.this, response, Toast.LENGTH_SHORT).show();
                loading.dismiss();
                startActivity(new Intent(SignUp.this,VbActivity.class));
                SignUp.this.finish();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SignUp.this, error.toString(), Toast.LENGTH_SHORT).show();
                loading.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> data=new HashMap<>();
                data.put("mobile",mobile);
                data.put("password",password);
                data.put("name",name);
                data.put("district",division);
                data.put("blood_group",blood_group);

                return data;
            }
        };

        signQueue.add(registerUser);
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
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
