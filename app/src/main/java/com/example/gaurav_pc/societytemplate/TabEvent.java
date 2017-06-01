package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Gaurav-pc on 3/2/2017.
 */

public class TabEvent extends Fragment {
    ImageView imageViewAddExpense;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_event, container, false);
        imageViewAddExpense = (ImageView)rootView.findViewById(R.id.imageView_add_expense_event);
        String[] NameArray = {"Gaurav Geet","Anil Kale","Amol Karikar","Sachin Tendulkar",
                "Virat Kohli","Ajinkya Rahane","MS Dhoni","Mrunmayee Karikar"};

        ListView listView1 = (ListView) rootView.findViewById(R.id.listView);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(),R.layout.list_item,R.id.textView_listItem_name,NameArray);
        listView1.setAdapter(adapter1);

        String[] ExpenseArray = {"Decoration Material","Ganpati Idol","Dinner","Garden Maintenance"};

        ListView listView2 = (ListView) rootView.findViewById(R.id.listView1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(),R.layout.expense_list_item,R.id.textView_listItem_expense_item,ExpenseArray);
        listView2.setAdapter(adapter2);

        setOnExpenseClick();
        return rootView;
    }
    private void setOnExpenseClick() {
        imageViewAddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AddEventExpenses.class);
                startActivity(intent);
            }
        });
    }}
