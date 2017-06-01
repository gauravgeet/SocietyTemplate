package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class OpinionPolls extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion_polls);

         barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> barEntries  = new ArrayList<>();
        barEntries.add(new BarEntry(1f, 1));
        barEntries.add(new BarEntry(2f, 2));
        barEntries.add(new BarEntry(3f, 2));
        barEntries.add(new BarEntry(4f, 1));
        barEntries.add(new BarEntry(1f, 3));
        barEntries.add(new BarEntry(2f, 1));
        barEntries.add(new BarEntry(3f, 4));
        barEntries.add(new BarEntry(4f, 2));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Options");

        ArrayList<String> labels = new ArrayList<>();
        labels.add("Option A");
        labels.add("Option B");
        labels.add("Option C");
        labels.add("Option D");

        BarData barData = new BarData(barDataSet);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.setData(barData);
        barChart.animateY(5000);

        String[] NameArray = {"Complaint about parking"," New Water supply Connection","Is there any need of new Lift?"};

        ListView listView3 = (ListView) findViewById(R.id.listView_polls);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.alerts_list_item,R.id.textView_listItem_name,NameArray);
        listView3.setAdapter(adapter3);

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_poll);

        OnFloatingButtonClick();
    }

    private void OnFloatingButtonClick() {

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewOpinionPolls.class);
                startActivity(intent);
            }
        });
    }
}
