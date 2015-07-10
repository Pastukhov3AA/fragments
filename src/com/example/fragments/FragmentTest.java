package com.example.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alex.p on 10.07.2015.
 */
public class FragmentTest extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saevdInstanteState){

        return inflater.inflate(R.layout.fragment_example,container,false);
    }
}
