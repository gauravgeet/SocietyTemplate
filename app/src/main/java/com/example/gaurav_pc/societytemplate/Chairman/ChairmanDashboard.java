package com.example.gaurav_pc.societytemplate.Chairman;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.gaurav_pc.societytemplate.Alerts;
import com.example.gaurav_pc.societytemplate.ChairmanNotifications;
import com.example.gaurav_pc.societytemplate.Complaints;
import com.example.gaurav_pc.societytemplate.GeneralSetting;
import com.example.gaurav_pc.societytemplate.MainActivity;
import com.example.gaurav_pc.societytemplate.OpinionPolls;
import com.example.gaurav_pc.societytemplate.R;
import com.example.gaurav_pc.societytemplate.Reports;

public class ChairmanDashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairman_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.chairman_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_accounts) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_notifications) {
            Intent intent = new Intent(getApplicationContext(), ChairmanNotifications.class);
            startActivity(intent);

        } else if (id == R.id.nav_reports) {

            Intent intent = new Intent(getApplicationContext(), Reports.class);
            startActivity(intent);

        } else if (id == R.id.nav_complaints) {
            Intent intent = new Intent(getApplicationContext(), Complaints.class);
            startActivity(intent);
        } else if (id == R.id.nav_alters) {
            Intent intent = new Intent(getApplicationContext(), Alerts.class);
            startActivity(intent);

        } else if (id == R.id.nav_uploads) {

        } else if (id == R.id.nav_polls) {
            Intent intent = new Intent(getApplicationContext(), OpinionPolls.class);
            startActivity(intent);
        } else if (id == R.id.nav_scheduler) {

        } else if (id == R.id.nav_contacts) {

        }else if (id == R.id.nav_Profile) {

        }else if (id == R.id.nav_signout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
