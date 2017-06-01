package com.example.gaurav_pc.societytemplate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaurav-pc on 3/2/2017.
 */

public class TabMaintenanceAlert extends Fragment {

    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_maintenance_alerts, container, false);

        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_maintenanceAlert);
        spinner.setPrompt("Select Month...");


        return rootView;
    }
}
