package info.androidhive.androidsplashscreentimer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
       // Button k= (Button) findViewById(R.id.button1);
      
        Button b=(Button) findViewById(R.id.button2);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bx=new Intent(MainActivity.this,Third.class);
				startActivity(bx);
				//finish();
				
			}
		});
        Button p=(Button) findViewById(R.id.button4);
        p.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sendSMSMessage();
				
				
			}
		});
        Button c=(Button) findViewById(R.id.button1);
        Button x=(Button) findViewById(R.id.button3);
        x.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent n=new Intent(MainActivity.this,Weather.class);
			startActivity(n);
				
			}
		});
        c.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent v=new Intent(MainActivity.this,Map.class);
				startActivity(v);
			}
		});
    }
    protected void sendSMSMessage() {
        Log.i("Send SMS", "");

        String phoneNo = "01681565583";
        String message = "Game on";

        try {
           SmsManager smsManager = SmsManager.getDefault();
           smsManager.sendTextMessage(phoneNo, null, message, null, null);
           Toast.makeText(getApplicationContext(), "SMS sent.",
           Toast.LENGTH_LONG).show();
        } catch (Exception e) {
           Toast.makeText(getApplicationContext(),
           "SMS faild, please try again.",
           Toast.LENGTH_LONG).show();
           e.printStackTrace();
        }
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
