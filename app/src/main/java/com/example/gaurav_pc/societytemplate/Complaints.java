package com.example.gaurav_pc.societytemplate;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Complaints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);


        FloatingActionButton floatingActionButton = (FloatingActionButton)findViewById(R.id.fab_complaints);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewComplaint.class);
                startActivity(intent);
            }
        });

        String[] NameArray = {"Complaint about parking","Water supply is off","Lift is not working","Swimming tanks water is not clean","Security issues in wing B"};

        ListView listView3 = (ListView) findViewById(R.id.listView_complaints);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.complaints_list_item,R.id.title,NameArray);
        listView3.setAdapter(adapter3);

    }
}
