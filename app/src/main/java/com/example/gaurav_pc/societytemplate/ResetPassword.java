package com.example.gaurav_pc.societytemplate;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Gaurav-pc on 3/1/2017.
 */

public class ResetPassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
