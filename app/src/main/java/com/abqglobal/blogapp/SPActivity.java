package com.abqglobal.blogapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SPActivity extends AppCompatActivity {


    EditText name1,email1,blog1;
    Button btn2,btn3;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        name1=findViewById(R.id.name1);
        email1=findViewById(R.id.email1);
        blog1=findViewById(R.id.blog1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String name=name1.getText().toString();
              String email=email1.getText().toString();
              String blog=blog1.getText().toString();

              sharedPreferences=getSharedPreferences("spfile",0);

              editor=sharedPreferences.edit();
              editor.putString("name",name1.getText().toString());
              editor.putString("email",email1.getText().toString());
              editor.putString("blog",blog1.getText().toString());
              editor.commit();

            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=name1.getText().toString();
                String email=email1.getText().toString();
                String blog=blog1.getText().toString();

                sharedPreferences=getSharedPreferences("spfile",0);

                editor=sharedPreferences.edit();

                String name2=sharedPreferences.getString("name",null);
                String email2=sharedPreferences.getString("email",null);
                String blog2=sharedPreferences.getString("blog",null);

                Toast.makeText(SPActivity.this, name2+"\n"+email2+"\n"+blog2, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
