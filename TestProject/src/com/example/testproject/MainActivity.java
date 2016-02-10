package com.example.testproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.testproject.R;

public class MainActivity extends Activity {
  static final LatLng Loc1 = new LatLng(22.78638, 89.34);
  static final LatLng Loc2 = new LatLng(22.23411, 89.30546);
  static final LatLng Loc3 = new LatLng(22.53411, 89.30546);
  static final LatLng Loc4 = new LatLng(22.33411, 89.30546);
  static final LatLng Loc6 = new LatLng(22.42411, 89.30546);
  static final LatLng Loc5 = new LatLng(22.29311, 89.30546);
  static final LatLng Loc7 = new LatLng(22.73411, 89.30546);
  static final LatLng Loc8 = new LatLng(22.63411, 89.30546);
  static final LatLng Loc9 = new LatLng(22.13411, 89.30546);
  static final LatLng Loc10 = new LatLng(22.53411, 89.30546);
  
  
  private GoogleMap map;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
        .getMap();
    map.setMyLocationEnabled(true);
    Marker loc1 = map.addMarker(new MarkerOptions().position(Loc1)
        .title("A1"));
    Marker loc2 = map.addMarker(new MarkerOptions().position(Loc2)
            .title("A2"));
    Marker loc3 = map.addMarker(new MarkerOptions().position(Loc3)
            .title("A3"));
    Marker loc4 = map.addMarker(new MarkerOptions().position(Loc4)
            .title("A4"));
    Marker loc5 = map.addMarker(new MarkerOptions().position(Loc5)
            .title("A5"));
    Marker loc6 = map.addMarker(new MarkerOptions().position(Loc6)
            .title("A6"));
    Marker loc7 = map.addMarker(new MarkerOptions().position(Loc7)
            .title("A7"));
    Marker loc8 = map.addMarker(new MarkerOptions().position(Loc8)
            .title("A8"));
    Marker loc9 = map.addMarker(new MarkerOptions().position(Loc9)
            .title("A9"));
    Marker loc10 = map.addMarker(new MarkerOptions()
        .position(Loc10)
        .title("A10")
        .snippet("May be Barisal")
        .icon(BitmapDescriptorFactory
            .fromResource(R.drawable.ic_launcher)));

    // Move the camera instantly to hamburg with a zoom of 15.
   
    
    map.moveCamera(CameraUpdateFactory.newLatLngZoom(Loc5, 60));
    

    // Zoom in, animating the camera.
    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

} 
