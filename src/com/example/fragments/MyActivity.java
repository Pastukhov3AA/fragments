package com.example.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    FragmentManager fragmentManager;
    Fragment fragment1;
    Fragment fragment2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        fragment2 = new FragmentTest2();

        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();


        fragmentTransaction.replace(R.id.test, fragment2);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}
