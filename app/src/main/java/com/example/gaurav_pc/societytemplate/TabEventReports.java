package com.example.gaurav_pc.societytemplate;


import android.content.Intent;
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

public class TabEventReports extends Fragment {

    FloatingActionButton floatingActionButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_event_report, container, false);
        String[] NameArray = {"New Year Party 2017","Ganesh Utsav 2016","Navratri Utsav 2016","Holi Celebration 2016","Ed Festival 2016"};

        ListView listView3 = (ListView) rootView.findViewById(R.id.listView_event_reports);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,NameArray);
        listView3.setAdapter(adapter3);
        return rootView;
    }
}
