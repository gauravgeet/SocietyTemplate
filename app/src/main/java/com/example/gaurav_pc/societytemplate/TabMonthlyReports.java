package com.example.gaurav_pc.societytemplate;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Gaurav-pc on 3/7/2017.
 */

public class TabMonthlyReports extends Fragment {

    FloatingActionButton floatingActionButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_monthly_report, container, false);

        String[] NameArray = {"February 2017","January 2017","December 2016","November 2016","October 2016","September 2016","August 2016"};

        ListView listView3 = (ListView) rootView.findViewById(R.id.listView_monthly_reports);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,NameArray);
        listView3.setAdapter(adapter3);
        return rootView;
    }
}
