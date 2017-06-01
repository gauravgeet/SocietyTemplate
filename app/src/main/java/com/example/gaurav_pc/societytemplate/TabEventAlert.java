package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Gaurav-pc on 3/2/2017.
 */

public class TabEventAlert extends Fragment {
    ImageView imageViewAddExpense;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_event_alerts, container, false);
        imageViewAddExpense = (ImageView) rootView.findViewById(R.id.imageView_add_expense_yearly);


        return rootView;
    }

}
