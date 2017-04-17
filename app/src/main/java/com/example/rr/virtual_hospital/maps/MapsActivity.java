package com.example.rr.virtual_hospital.maps;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rr.virtual_hospital.R;
import com.example.rr.virtual_hospital.maps.google_maps_class.DownloadTask;
import com.example.rr.virtual_hospital.maps.google_maps_class.GooglePlacesReadTask;
import com.example.rr.virtual_hospital.maps.google_maps_class.MapStateManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements  GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,OnMapReadyCallback, View.OnClickListener {


    ImageView actionImageView;
    Button manuButton;
    TextView actionTextview;

    public String placeType;

    private static final int GPS_ERRORDIALOG_REQUEST = 9001;
    private static final float DEFAULTZOOM = 10;
    private static  double CHITTAGONG_LAT;
    private static  double CHITTAGONG_LNG;

    private int PROXIMITY_RADIUS = 6000;
    //its not your api key, its a server key for nearest place api...google place api key
    private static final String GOOGLE_API_KEY = "AIzaSyAkun-3v9OWpI2amecQp67HznXwwcbZ5m8";

    private com.google.android.gms.maps.GoogleMap mMap;

    private Marker mMarker;


    private GoogleApiClient apiClient;

    private Button nearestHospital_button;
    private Button myLocationButton;
    private Button refreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        actionImageView = (ImageView) findViewById(R.id.actionImageView);

        actionTextview = (TextView) findViewById(R.id.actionTextView);



        CHITTAGONG_LAT=22.3475f;
        CHITTAGONG_LNG=91.8123f;

        if (servicesOK()) {
            setContentView(R.layout.activity_maps);


            nearestHospital_button = (Button) findViewById(R.id.nearestHospital_Button);
            myLocationButton = (Button) findViewById(R.id.myLocation_Button);
            refreshButton = (Button) findViewById(R.id.refreshButton);
            manuButton = (Button) findViewById(R.id.menu_Button);

            nearestHospital_button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (isConnectionAvailable()) {


                        /// Alert dialog for select place types

                        final String placeTypesList[] = {"Hospital","Doctor","Pharmacy"};
                        AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                        builder.setTitle("Set Place Type");
                        builder.setIcon(R.drawable.ic_nearest_place);

                        builder.setCancelable(false);
                        builder.setItems(placeTypesList, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int position) {
                                switch (position) {












                                    case 0:

                                        placeType = "hospital";
                                        getPlace(placeType);
                                        break;

                                    case 1:

                                        placeType = "doctor";
                                        getPlace(placeType);
                                        break;


                                    case 2:

                                        placeType = "pharmacy";
                                        getPlace(placeType);
                                        break;

                                    default:
                                        break;
                                }
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int possition) {
                                dialog.dismiss();
                            }
                        });
                        AlertDialog mapTypeDialog = builder.create();
                        mapTypeDialog.show();

                        //  **********Alert dialog end************//

                    }
                }
            });


            myLocationButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    if (ActivityCompat.checkSelfPermission(MapsActivity.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapsActivity.this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    Location currentLocation = LocationServices.FusedLocationApi
                            .getLastLocation(apiClient);
                    if (currentLocation == null) {
                        Toast.makeText(getApplicationContext(),
                                "Please enable your GPS !",
                                Toast.LENGTH_LONG).show();




                    } else {
                        gotoLocation(currentLocation.getLatitude(),
                                currentLocation.getLongitude(), 16);

                        setMarkers("I Am Here", "",
                                currentLocation.getLatitude(),
                                currentLocation.getLongitude(),
                                R.drawable.my_location_marker);
                    }

                }
            });



            refreshButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mMap.clear();
                }
            });



            manuButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    //Alert dialogue for select map types

                    final String mapTypes[] = { "None", "Normal", "Satellite",
                            "Terrain", "Hybrid"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                    builder.setTitle("Set Map Type");
                    builder.setCancelable(false);
                    builder.setIcon(R.drawable.ic_map);
                    builder.setItems(mapTypes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int position) {
                            switch (position) {
                                case 0:
                                    mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
                                    break;

                                case 1:
                                    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                                    break;

                                case 2:
                                    mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                                    break;

                                case 3:
                                    mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                                    break;

                                case 4:
                                    mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                                    break;

                                default:
                                    break;
                            }
                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int possition) {
                            dialog.dismiss();
                        }
                    });
                    AlertDialog mapTypeDialog = builder.create();
                    mapTypeDialog.show();

                }
            });



            if (initMap()) {
                gotoLocation(CHITTAGONG_LAT, CHITTAGONG_LNG, DEFAULTZOOM);
                apiClient = new GoogleApiClient.Builder(this)
                        .addApi(LocationServices.API)
                        .addConnectionCallbacks(this)
                        .addOnConnectionFailedListener(this).build();
                apiClient.connect();
            } else {
                Toast.makeText(this, "Map not available!", Toast.LENGTH_SHORT)
                        .show();
            }
        } else {
            Toast.makeText(this, "Google Play Services is not available",
                    Toast.LENGTH_LONG).show();
            finish();
        }


    }



    public void getPlace(String placeType)

    {


        Location currentLocation = null;

        if (ActivityCompat.checkSelfPermission(MapsActivity.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapsActivity.this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        currentLocation = LocationServices.FusedLocationApi
                .getLastLocation(apiClient);
        if (currentLocation == null) {
            Toast.makeText(getApplicationContext(),
                    "Nearest location isn't available,Please Check your Internet or GPS Setting",
                    Toast.LENGTH_SHORT).show();
        } else {


            Toast.makeText(getApplicationContext(),
                    "Nearest location is Loading, Please 'Zoom Out or In' On this map", Toast
                            .LENGTH_SHORT).show();
            StringBuilder googlePlacesUrl = new StringBuilder(
                    "https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
            googlePlacesUrl.append("location="
                    + currentLocation.getLatitude() + ","
                    + currentLocation.getLongitude());
            googlePlacesUrl.append("&radius=" + PROXIMITY_RADIUS);
            googlePlacesUrl.append("&types=" + placeType);  //your place type here
            googlePlacesUrl.append("&sensor=true");
            googlePlacesUrl.append("&key=" + GOOGLE_API_KEY);

            GooglePlacesReadTask googlePlacesReadTask = new GooglePlacesReadTask();
            Object[] toPass = new Object[3];
            toPass[0] = mMap;
            toPass[1] = googlePlacesUrl.toString();
            toPass[2] = new LatLng(currentLocation.getLatitude(),
                    currentLocation.getLongitude());
            googlePlacesReadTask.execute(toPass);


        }


    }


    private boolean initMap() {
        if (mMap == null) {
            SupportMapFragment mapFrag = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);


            mMap = mapFrag.getMap();




            if (mMap != null) {

                mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

                    @Override
                    public void onInfoWindowClick(Marker marker) {

                    }
                });

                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {
                        if (mMarker != null) {
                            String str_origin = "origin="
                                    + mMarker.getPosition().latitude + ","
                                    + mMarker.getPosition().longitude;
                            // Destination of route
                            String str_dest = "destination="
                                    + marker.getPosition().latitude + ","
                                    + marker.getPosition().longitude;
                            // Sensor enabled
                            String sensor = "sensor=false";
                            // Building the parameters to the web service
                            String parameters = str_origin + "&" + str_dest
                                    + "&" + sensor;
                            // Output format
                            String output = "json";
                            // Building the url to the web service
                            String url = "https://maps.googleapis.com/maps/api/directions/"
                                    + output + "?" + parameters;
                            DownloadTask downloadTask = new DownloadTask();
                            // Start downloading json data from Google
                            // Directions
                            // API
                            Object[] toPass = new Object[2];
                            toPass[0] = mMap;
                            toPass[1] = url;
                            downloadTask.execute(toPass);
                        }

                        return false;
                    }
                });
            }
        }
        return (mMap != null);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean servicesOK() {
        int isAvailable = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(this);

        if (isAvailable == ConnectionResult.SUCCESS) {
            return true;
        } else if (GooglePlayServicesUtil.isUserRecoverableError(isAvailable)) {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(isAvailable,
                    this, GPS_ERRORDIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, "Can't connect to Google Play services",
                    Toast.LENGTH_SHORT).show();
        }
        return false;
    }



    private void gotoLocation(double lat, double lng, float zoom) {

        Log.i("GEO","Call geo");
        LatLng ll = new LatLng(lat, lng);
        // mMap.addMarker(new MarkerOptions().position(ll).title(getName));
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
        mMap.animateCamera(update);
    }


    private void setMarkers(String locality, String countryName, double lat,
                            double lng, int markerIconRes) {

        if (mMarker != null) {
            mMarker.remove();
        }
        MarkerOptions options = new MarkerOptions().title(locality)
                .position(new LatLng(lat, lng))
                .icon(BitmapDescriptorFactory.fromResource(markerIconRes));

        if (markerIconRes == 0) {
            options.icon(BitmapDescriptorFactory.defaultMarker());
        }

        if (countryName.length() > 0) {
            options.snippet(countryName);
        }

        mMarker = mMap.addMarker(options);
    }



    @Override
    protected void onResume() {
        super.onResume();
        // datasource.open();
        MapStateManager mgr = new MapStateManager(this);
        CameraPosition position = mgr.getSavedCameraPosition();
        if (position != null) {
            CameraUpdate update = CameraUpdateFactory
                    .newCameraPosition(position);
            mMap.moveCamera(update);
            mMap.setMapType(mgr.getSavedMapType());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // datasource.close();
    }

    @Override
    protected void onStop() {
        super.onStop();
        MapStateManager mgr = new MapStateManager(this);
        mgr.saveMapState(mMap);
    }




    @Override
    public void onClick(View v) {

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    public boolean isConnectionAvailable()
    {
        //instantiate an object
        ConnectivityManager cm=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        //get all networks information
        NetworkInfo networkInfo[]=cm.getAllNetworkInfo();

        int i;

        //checking internet connectivity
        for(i=0;i<networkInfo.length;++i){
            if(networkInfo[i].getState()==NetworkInfo.State.CONNECTED){
                //Toast.makeText(getApplicationContext(),"Internet Connected",Toast.LENGTH_LONG).show();
                return  true;

            }
        }

        if(i==networkInfo.length){
            Toast.makeText(getApplicationContext(),"Please Enable Internet Connection.",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);

            return false;
        }

        return false;
    }



    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Chittagong and move the camera
        LatLng sydney = new LatLng(37.09, 95.71);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Chittagong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }

}
