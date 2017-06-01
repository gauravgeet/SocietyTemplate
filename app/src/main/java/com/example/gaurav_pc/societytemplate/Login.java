package com.example.gaurav_pc.societytemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gaurav_pc.societytemplate.Chairman.ChairmanDashboard;

public class Login extends AppCompatActivity {

    TextView textView_forget_passowrd, textView_signup;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView_forget_passowrd = (TextView) findViewById(R.id.textView_forget_password);
        textView_signup = (TextView) findViewById(R.id.textView_signup);
        textView_signup = (TextView) findViewById(R.id.textView_signup);
        loginBtn = (Button) findViewById(R.id.button_loginbtn);

        SetOnclickForgetPassword();
        setOnclickonSignup();
        onButtonClick();

    }

    private void onButtonClick() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChairmanDashboard.class);
                startActivity(intent);
            }
        });
    }

    private void setOnclickonSignup() {
        textView_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
            }
        });
    }

    private void SetOnclickForgetPassword() {
        textView_forget_passowrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResetPassword.class);
                startActivity(intent);
            }
        });
    }
}
