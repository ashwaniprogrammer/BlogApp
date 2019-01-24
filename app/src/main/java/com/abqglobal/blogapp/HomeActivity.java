package com.abqglobal.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    String sname,semail,sblog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //to pass data from data class to string objects in home activity


        sname=Data.name;
        semail=Data.email;
        sblog=Data.blog;

        // Toast.makeText(this, sname+"\n"+semail+"\n"+sblog, Toast.LENGTH_SHORT).show();


        // to receive the intent from main activty

        Intent intent=getIntent();

        //to receive bundle from intent

        Bundle bundle=intent.getExtras();

        String name=bundle.getString("namekey");
        String email=bundle.getString("emailkey");
        String blog=bundle.getString("blogkey");
        Toast.makeText(this, name+"\n"+email+"\n"+blog, Toast.LENGTH_SHORT).show();

    }
}
