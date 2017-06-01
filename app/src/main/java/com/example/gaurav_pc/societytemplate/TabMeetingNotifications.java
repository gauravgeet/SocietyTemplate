package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Gaurav-pc on 3/7/2017.
 */

public class TabMeetingNotifications extends Fragment {

    FloatingActionButton floatingActionBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_meeting_notifications, container, false);

        floatingActionBtn = (FloatingActionButton) rootView.findViewById(R.id.floatingbtn_meeting);
        floatingActionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getContext(), NewMeeting.class);
                startActivity(intent);
            }
        });

        String[] NameArray = {"Monthly Meeting is on Monday","Please come for meeting in community hall","Meeting On 2nd jan to discuss various issues","Our meeting has cancle","Repairing Work issues"};

        ListView listView3 = (ListView) rootView.findViewById(R.id.listView_meeting_notification);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(),R.layout.meeting_list_item,R.id.textView_listItem_expense_item,NameArray);
        listView3.setAdapter(adapter3);

        return rootView;
    }
}
