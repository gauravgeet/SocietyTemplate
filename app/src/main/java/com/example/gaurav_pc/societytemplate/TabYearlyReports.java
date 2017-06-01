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

public class TabYearlyReports extends Fragment {

    FloatingActionButton floatingActionButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_yearly_report, container, false);

        String[] NameArray = {"Year 2017","Year 2016","Year 2015","Year 2014","Year 2013"};

        ListView listView3 = (ListView) rootView.findViewById(R.id.listView_yearly_reports);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,NameArray);
        listView3.setAdapter(adapter3);
        return rootView;
    }
}
