package com.cgtest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;


//import com.google.android.gms.maps.GoogleMap;





public class MainActivity extends FragmentActivity {


	//GoogleMap map;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("Activity", "Loaded");
		Log.i("Activity", "Loaded");
		Log.i("Activity", "Loaded Branch 2");
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
