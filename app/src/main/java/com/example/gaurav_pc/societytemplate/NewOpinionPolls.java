package com.example.gaurav_pc.societytemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class NewOpinionPolls extends AppCompatActivity {

    EditText no_of_options, last_date;
    Button create_poll;
    Integer NoOfOptions;
    String tempData;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_opinion_polls);

        no_of_options = (EditText) findViewById(R.id.editText_no_of_options);
        last_date = (EditText) findViewById(R.id.editText_till_date);
        create_poll  = (Button) findViewById(R.id.button_new_poll);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout_new_poll);

        tempData =no_of_options.getText().toString();
        NoOfOptions = Integer.parseInt(tempData);
        OnFocusChangeFromNoOfOptions();
        OnNewPollButtonClick();
    }

    private void OnFocusChangeFromNoOfOptions() {

        no_of_options.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                for (int i= 0; i<NoOfOptions; i++) {
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                            android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
                        EditText editText = new EditText(getApplicationContext());
                    editText.setHint("Option "+(i+1));
                    editText.setLayoutParams(params);
                    linearLayout.addView(editText);

                }
            }
        });
    }

    private void OnNewPollButtonClick() {

        create_poll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
