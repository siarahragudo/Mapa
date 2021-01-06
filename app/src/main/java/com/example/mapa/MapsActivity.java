package com.example.mapa;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sanblas and move the camera
        LatLng sanblas = new LatLng(15.907, 120.598);
        mMap.addMarker(new MarkerOptions().position(sanblas).title("Marker in Sanblas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sanblas));

        mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(15.907, 120.598),
                        new LatLng(15.902672,120.593238),
                        new LatLng(15.901194, 120.589390),
                        new LatLng(15.900146, 120.589321),
                        new LatLng(15.900063, 120.588419),
                        new LatLng(15.915422, 120.583367),
                        new LatLng(15.953958, 120.576398),
                        new LatLng(15.971063, 120.571598),
                        new LatLng(15.975683, 120.570746),
                        new LatLng(15.975683, 120.566086),
                        new LatLng(15.978854, 120.566000),
                        new LatLng(15.980419, 120.562500),
                        new LatLng(15.981733, 120.560222),
                        new LatLng(15.980692, 120.560597))
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap = googleMap;

        //add a marker in Carusucan and move the camera
        LatLng Carusucan = new LatLng(15.975963, 120.447898);
        mMap.addMarker(new MarkerOptions().position(Carusucan).title("Marker in Karla's House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Carusucan));


        mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(15.975963, 120.447898),
                        new LatLng(15.986880, 120.447557),
                        new LatLng(15.983095, 120.461223),
                        new LatLng(15.979197, 120.472225),
                        new LatLng(15.978131, 120.476619),
                        new LatLng(15.976874, 120.484389),
                        new LatLng(15.980041, 120.513714),
                        new LatLng(15.979986, 120.563443),
                        new LatLng(15.981587, 120.560360),
                        new LatLng(15.980692, 120.560597))
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap = googleMap;

        //add a marker in Carusucan and move the camera
        LatLng LaUnion = new LatLng(16.232, 120.488);
        mMap.addMarker(new MarkerOptions().position(LaUnion).title("Marker in Pauline's House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LaUnion));

        mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(16.232, 120.488),
                        new LatLng(16.169402, 120.539423),
                        new LatLng(16.1084, 120.5432),
                        new LatLng(16.048889, 120.595278),
                        new LatLng(15.975803, 120.570693),
                        new LatLng(15.980692, 120.560597))
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.050618, 120.493362 ))
                .radius(20000)
                .strokeWidth(5)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(128, 200, 0, 0)));





    }
}