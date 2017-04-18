package com.example.rr.virtual_hospital.prescription;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GlideBitmapDrawable;
import com.example.rr.virtual_hospital.R;
import com.example.rr.virtual_hospital.profile.Profile;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class UploadPrescription extends AppCompatActivity {

    private String prescriptionTasksURL;

    private static final int GALLERY_INTENT_REQUEST_CODE=5;
    private static final int CAMERA_INTENT_REQUEST_CODE=7;
    private ProgressDialog pd;
    private SharedPreferences sp;

    private Intent cameraIntent,galleryIntent;

    private EditText prescName;
    private ImageView prescImage;
    private Button presSelectButton,presUploadButton;
    private RequestQueue prescReq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_prescription);
        prescriptionTasksURL=getString(R.string.serverIp)+"prescription.php";
        prescReq= Volley.newRequestQueue(this);

        prescName= (EditText) findViewById(R.id.input_prescription_name);
        prescImage= (ImageView) findViewById(R.id.prescription_selected_image_placeholder);
        presSelectButton = (Button)findViewById(R.id.button_prescription_select);
        presUploadButton = (Button)findViewById(R.id.button_prescription_upload);
        sp= getSharedPreferences("vHospUserData",MODE_PRIVATE);
        pd= new ProgressDialog(this);

        presUploadButton.setEnabled(false);

        presSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder uploadOptions= new AlertDialog.Builder(v.getContext())
                        .setTitle("Select Upload Method")
                        .setPositiveButton("Upload Using Camera", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                cameraIntent=new Intent("android.media.action.IMAGE_CAPTURE");
                               /* File photo = new File(Environment.getExternalStorageDirectory(),  "Pic.jpg");
                                imageUri = Uri.fromFile(photo);
                                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photo));
                                */
                                startActivityForResult(cameraIntent, CAMERA_INTENT_REQUEST_CODE);
                            }
                        })
                        .setNegativeButton("Upload from Gallery", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                galleryIntent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                                startActivityForResult(galleryIntent,GALLERY_INTENT_REQUEST_CODE);
                            }
                        });

                uploadOptions.show();
                presUploadButton.setEnabled(true);
            }
        });

        presUploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.setTitle("Uploading");
                pd.setCancelable(true);

                Bitmap img=((GlideBitmapDrawable)prescImage.getDrawable().getCurrent()).getBitmap();

                String imageName,encodedImage;
                imageName=prescName.getText().toString();

                if (prescName.getText().toString().isEmpty()){
                    Toast.makeText(UploadPrescription.this,"Enter a name for the prescription" , Toast.LENGTH_SHORT).show();
                }

                if(imageName!=null && !imageName.isEmpty()){

                    encodedImage=getEncodedString(img);
                    imageToServer(imageName,encodedImage);
                }

            }
        });

    }

    private void imageToServer(final String imageName,final String encodedImage) {
        pd.show();
        StringRequest img2server= new StringRequest(Request.Method.POST, prescriptionTasksURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("done")){
                    Toast.makeText(UploadPrescription.this, response, Toast.LENGTH_SHORT).show();
                    Log.d("serverResp",response);
                    UploadPrescription.this.finish();
                    startActivity(new Intent(UploadPrescription.this, Profile.class));
                    pd.dismiss();
                }else{
                    Toast.makeText(UploadPrescription.this, response, Toast.LENGTH_SHORT).show();
                    pd.dismiss();
                    Log.d("serverResp",response);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pd.dismiss();
                Toast.makeText(getApplicationContext(), "Network Error", Toast.LENGTH_SHORT).show();
                Log.d("serverErr",error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> image=new HashMap<>();
                image.put("prescription_name",imageName);
                image.put("encoded_string",encodedImage);
                image.put("user_id",sp.getString("user_id"," "));
                image.put("task","upload_prescription");
                return image;
            }
        };
        //add to request queue
        prescReq.add(img2server);
    }


    private String getEncodedString(Bitmap image) {
        String encodedImage;
        ByteArrayOutputStream os= new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG,100,os);
        byte[] imagebyte=os.toByteArray();
        encodedImage= Base64.encodeToString(imagebyte, Base64.DEFAULT);
        return encodedImage;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode== Activity.RESULT_OK && data!= null){
            if(requestCode==GALLERY_INTENT_REQUEST_CODE){
                Uri selectedImage=data.getData();
                Glide.with(UploadPrescription.this)
                        .load(selectedImage)
                        .into(prescImage);
//                prescImage.setImageURI(selectedImage);
            }else if(requestCode==CAMERA_INTENT_REQUEST_CODE){
                Bitmap picture= (Bitmap) data.getExtras().get("data");
                prescImage.setImageBitmap(picture);
            }

        }
    }



}
