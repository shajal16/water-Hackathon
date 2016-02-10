package info.androidhive.androidsplashscreentimer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;

public class Erotion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_erotion);
		
		
		
		WebView wv;  
        wv = (WebView) findViewById(R.id.webView4);  
        wv.loadUrl("file:///android_asset/4.html");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.erotion, menu);
		return true;
	}

}
