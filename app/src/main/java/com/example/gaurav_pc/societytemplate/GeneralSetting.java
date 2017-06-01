package com.example.gaurav_pc.societytemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class GeneralSetting extends AppCompatActivity {

    String defaultTextForSpinner = "Select Chairman..";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_setting);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_chairman);
        spinner.setPrompt(defaultTextForSpinner);
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Flat No 1001");
        categories.add("Flat No 1002");
        categories.add("Flat No 1003");
        categories.add("Flat No 1004");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        Spinner spinner_secretory = (Spinner) findViewById(R.id.spinner_Secretory);
        spinner_secretory.setPrompt("Select Secretory");
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories1 = new ArrayList<String>();
        categories1.add("Flat No 1001");
        categories1.add("Flat No 1002");
        categories1.add("Flat No 1003");
        categories1.add("Flat No 1004");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories1);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_secretory.setAdapter(dataAdapter1);

        Spinner spinner_treasurer = (Spinner) findViewById(R.id.spinner_Treasurer);
        spinner_treasurer.setPrompt("Select Treasurer");
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories2 = new ArrayList<String>();
        categories2.add("Flat No 1001");
        categories2.add("Flat No 1002");
        categories2.add("Flat No 1003");
        categories2.add("Flat No 1004");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_treasurer.setAdapter(dataAdapter2);
    }
}
