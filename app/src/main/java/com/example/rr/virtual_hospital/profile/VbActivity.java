package com.example.rr.virtual_hospital.profile;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.rr.virtual_hospital.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


//HAve To Done By Ramim Vai

public class VbActivity extends AppCompatActivity {

    private EditText userMobile,passWord;
    private Button submit,signUp;
    private ProgressDialog loading;
    private RequestQueue logReq;
    private String URL="";
    private SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vb);

        URL=getString(R.string.serverIp)+"login.php";
        userMobile =(EditText)findViewById(R.id.Usermobile);
        passWord=(EditText)findViewById(R.id.Pass);
        submit=(Button)findViewById(R.id.Submit);
        signUp=(Button)findViewById(R.id.Sign);

        sp=getSharedPreferences("vHospUserData",MODE_PRIVATE);


        checkLogged();

        loading=new ProgressDialog(this);
        loading.setTitle("Loging in....");
        loading.setButton(DialogInterface.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        logReq= Volley.newRequestQueue(this);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(VbActivity.this,SignUp.class);
                startActivity(in);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strUsername,strPassword;
                strUsername= userMobile.getText().toString().trim();
                strPassword= passWord.getText().toString().trim();

                if(TextUtils.isEmpty(strUsername)&&TextUtils.isEmpty(strPassword)){
                    Toast.makeText(VbActivity.this, "Fill all the details", Toast.LENGTH_SHORT).show();
                }else{
                    sendDataToServer(strUsername,strPassword);

                }
            }
        });

    }

    private void checkLogged() {
        if(sp.getString("user_id",null)!=null){
            VbActivity.this.finish();
            startActivity(new Intent(VbActivity.this,Profile.class));
        }
    }

    private void sendDataToServer(final String strUsername, final String strPassword) {
        loading.show();
        StringRequest loginReq=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
               // Toast.makeText(VbActivity.this, response, Toast.LENGTH_SHORT).show();
                Log.d("serverResponse",response);
                try {
                    JSONObject userData=new JSONObject(response);
                    SharedPreferences.Editor editor=sp.edit();

                    editor.putString("user_id",userData.getString("id"));
                    editor.putString("user_mobile",userData.getString("mobile"));
                    editor.apply();
                    VbActivity.this.finish();
                    startActivity(new Intent(VbActivity.this,Profile.class));
                    loading.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(VbActivity.this, response, Toast.LENGTH_SHORT).show();
                    loading.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(VbActivity.this, "Network Error", Toast.LENGTH_SHORT).show();
                loading.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> userData=new HashMap<>();
                userData.put("mobile",strUsername);
                userData.put("password",strPassword);
                return userData;
            }
        };

        logReq.add(loginReq);
    }
}
