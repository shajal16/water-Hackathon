package info.androidhive.androidsplashscreentimer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import info.androidhive.androidsplashscreentimer.R;

@SuppressLint("NewApi")
public class Map extends Activity {
  static final LatLng Loc1 = new LatLng(22.194518, 92.218545);
  static final LatLng Loc2 = new LatLng(22.311332, 89.69634602);
  static final LatLng Loc3 = new LatLng(22.3819841, 89.942639);
  static final LatLng Loc4 = new LatLng(22.665660, 91.343330);
  static final LatLng Loc5 = new LatLng(21.808984, 91.85506);
  static final LatLng Loc6 = new LatLng(22.572646, 91.461598);
  static final LatLng Loc7 = new LatLng(22.518741, 91.434396);
  static final LatLng Loc8 = new LatLng(22.477063, 91.437814);
  static final LatLng Loc9 = new LatLng(22.438294, 91.463118);
  static final LatLng Loc10 = new LatLng(22.421259, 91.476389);
  
  

  
  
  private GoogleMap map;

  @SuppressLint("NewApi")
@Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_map);
    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
        .getMap();
    map.setMyLocationEnabled(true);
    Marker loc1 = map.addMarker(new MarkerOptions().position(Loc1)
        .title("Mitialal High School Shelter").snippet("Supply Levels: Normal | Needs: Drinkable Water"));
    Marker loc2 = map.addMarker(new MarkerOptions().position(Loc2)
            .title("Dokkhinapara High School Center").snippet("Supply Levels: Normal | Needs: Dry Foods"));
    Marker loc4 = map.addMarker(new MarkerOptions().position(Loc4)
            .title("Maghana School Cyclone Shelter").snippet("Supply Levels: Below Average | Needs: Medicines & Water purifier"));
    Marker loc5 = map.addMarker(new MarkerOptions().position(Loc5)
            .title("Kajihelaluddin RPS Cyclone Center").snippet("Supply Levels: Average | Needs: Dry Foods"));
    Marker loc6 = map.addMarker(new MarkerOptions().position(Loc6)
            .title("Uttarchar GPS Cyclone Center").snippet("Supply Levels: Normal | Needs: Drinkable Water"));
    Marker loc7 = map.addMarker(new MarkerOptions().position(Loc7)
            .title("Dublapur GPS Cyclone Center").snippet("Supply Levels: Normal | Needs: Medicines"));
    Marker loc8 = map.addMarker(new MarkerOptions().position(Loc8)
            .title("Maddha Rahmatpur GPS cyclone shelter").snippet("Supply Levels: Low | Needs: Dry Foods"));
    Marker loc9 = map.addMarker(new MarkerOptions().position(Loc9)
            .title("Nurhaat Govt. Primary School Cyclone Center").snippet("Supply Levels: Medium | Needs: Selines"));
    Marker loc10 = map.addMarker(new MarkerOptions().position(Loc10)
            .title("West Sharikait GPS Cyclone Center").snippet("Supply Levels: Normal | Needs: Drinkable Water & Dry foods"));
  

          
    Marker loc3 = map.addMarker(new MarkerOptions()
        .position(Loc3)
        .title("Snehangal School & College")
        .snippet("Supply Levels: LOW")
        );

    // Move the camera instantly to hamburg with a zoom of 15.
   
     
    map.moveCamera(CameraUpdateFactory.newLatLngZoom(Loc3, 60));
    

    // Zoom in, animating the camera.
    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

} 
