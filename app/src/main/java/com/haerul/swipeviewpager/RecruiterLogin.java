package com.haerul.swipeviewpager;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecruiterLogin extends AppCompatActivity {

    TextView Signup;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruiter_login);

        Signup= (TextView) findViewById(R.id.Signup);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),StudentRegister.class);
                startActivity(i);
            }
        });

//        btnLogin = (Button)findViewById(R.id.btnLogin);
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent in=new Intent(getApplicationContext(),StudentNavigation.class);
//                startActivity(in);
//
//            }
//        });



    }
}