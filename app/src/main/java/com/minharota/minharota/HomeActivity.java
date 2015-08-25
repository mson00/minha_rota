package com.minharota.minharota;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Pereira on 20/08/2015.
 */
public class HomeActivity extends android.app.Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.home, container, false);

        return rootView;
    }
}
