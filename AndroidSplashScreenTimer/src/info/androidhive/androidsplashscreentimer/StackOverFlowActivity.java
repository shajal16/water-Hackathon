package info.androidhive.androidsplashscreentimer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;

public class StackOverFlowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_stack_over_flow);
		WebView wv;  
        wv = (WebView) findViewById(R.id.webView1);  
        wv.loadUrl("file:///android_asset/1.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stack_over_flow, menu);
		return true;
	}

}
