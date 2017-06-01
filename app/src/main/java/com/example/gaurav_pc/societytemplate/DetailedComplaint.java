package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailedComplaint extends AppCompatActivity {

    Button btnTakeAction, btnReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_complaint);

        btnTakeAction = (Button) findViewById(R.id.button_take_action);
        btnReply = (Button) findViewById(R.id.button_reply);
        OnClickBtnTakeAction();
        OnClickBtnReply();
    }

    private void OnClickBtnReply() {
        btnTakeAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewComplaint.class);
                startActivity(intent);
            }
        });
    }

    private void OnClickBtnTakeAction() {
        btnReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ComplaintReplyActivity.class);
                startActivity(intent);
            }
        });
    }
}
