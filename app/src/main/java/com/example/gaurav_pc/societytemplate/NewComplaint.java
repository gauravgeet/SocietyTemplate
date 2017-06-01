package com.example.gaurav_pc.societytemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NewComplaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_complaint);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_complaints);
        spinner.setPrompt("Complaint About");
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Flat No 1001");
        categories.add("Flat No 1002");
        categories.add("Flat No 1003");
        categories.add("Flat No 1004");
        categories.add("Flat No 1005");
        categories.add("Flat No 1006");
        categories.add("Flat No 1007");
        categories.add("Flat No 1008");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }
}
