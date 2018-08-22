package com.m.freiendslocator;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.geo.GeoCategory;

public class MainActivity extends AppCompatActivity {
    Button btnFriends,btnManish,btnSachin,btnKunj,btnManoj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //creating category in backendless
        Backendless.Geo.addCategory("Friends", new AsyncCallback<GeoCategory>() {
            @Override
            public void handleResponse(GeoCategory response) {

            }

            @Override
            public void handleFault(BackendlessFault fault) {
                Toast.makeText(MainActivity.this, "fault is="+fault.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
//        startActivity(new Intent(this,MapsActivity.class));
//        finish();

        btnFriends=findViewById(R.id.btnFriends);
        btnManish=findViewById(R.id.btnManish);
        btnSachin=findViewById(R.id.btnSachin);
        btnKunj=findViewById(R.id.btnKunj);
        btnManoj=findViewById(R.id.btnManoj);



        btnFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                .permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                                .permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},0);
                }
                else
                {
                  Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                  intent.putExtra("type","Friends");
                  startActivity(intent);
                }

            }
        });

        btnManish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                        .permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                                .permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},0);
                }
                else
                {
                    Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                    intent.putExtra("type","manish");
                    startActivity(intent);
                }

            }
        });

        btnSachin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                        .permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                                .permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},0);
                }
                else
                {
                    Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                    intent.putExtra("type","sachin");
                    startActivity(intent);
                }

            }
        });

        btnKunj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                        .permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                                .permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},0);
                }
                else
                {
                    Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                    intent.putExtra("type","kunj");
                    startActivity(intent);
                }

            }
        });

        btnManoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                        .permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest
                                .permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},0);
                }
                else
                {
                    Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                    intent.putExtra("type","manoj");
                    startActivity(intent);
                }

            }
        });

//      Person person =new Person();
//      person.setName("Manish");
//      person.setSurname("Mishra");
//
//        Backendless.Data.of(Person.class).save(person, new AsyncCallback<Person>() {
//            @Override
//            public void handleResponse(Person response) {
//
//            }
//
//            @Override
//            public void handleFault(BackendlessFault fault) {
//
//            }
//        });

    }
}
