package com.roadrunner.mobileapp;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	/** Create when Activity is first called **/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
    
}
