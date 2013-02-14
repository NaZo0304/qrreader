package com.example.com.childhood.rssreader;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

public class RSSActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rss, menu);
		return true;
	}

}
