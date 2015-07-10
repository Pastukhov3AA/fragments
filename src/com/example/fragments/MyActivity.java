package com.example.fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    FragmentManager fragmentManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fragmentManager = getFragmentManager();
    }
}
