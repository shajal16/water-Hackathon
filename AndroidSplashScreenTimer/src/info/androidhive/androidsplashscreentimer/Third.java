package info.androidhive.androidsplashscreentimer;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Third extends Activity {
	
	private Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_third);
		
		ImageView ak=(ImageView) findViewById(R.id.imageButton1);
		
		ak.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent t = new Intent(Third.this,StackOverFlowActivity.class);
				startActivity(t);
				//finish();
			}
		});
		ImageView jh=(ImageView) findViewById(R.id.imageButton2);
		jh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent f=new Intent(Third.this,Cyclone.class);
				startActivity(f);
				
			}
		});
		ImageView cd = (ImageView) findViewById(R.id.imageButton3);
		cd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent k= new Intent(Third.this,Erotion.class);
				startActivity(k);
				
			}
		});
		ImageView b = (ImageView) findViewById(R.id.imageButton4);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent b= new Intent(Third.this,Drought.class);
			startActivity(b);
			}
		});
		//ak.getBackground().setColorFilter(new LightingColorFilter(0x11111111, 0x11111111));
		//ak.setBackgroundColor(Color.BLUE);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}
