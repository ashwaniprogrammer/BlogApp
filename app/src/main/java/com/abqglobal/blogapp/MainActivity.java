package com.abqglobal.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button share;
    EditText name,email,blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share=findViewById(R.id.btn1);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        blog=findViewById(R.id.blog);


        // share data using java object

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to jump to home activity

                // Intent class and object and allocate memory using new and give source and destination

                Intent share=new Intent(MainActivity.this, HomeActivity.class);

                // here intent is not related to transferring data from one page to another

                //to share the data

                // to pass data into Data class Objects

                // first data comes from XML file to main class object then to data class

                Data.name=name.getText().toString().trim();
                Data.email=email.getText().toString().trim();
                Data.blog=blog.getText().toString().trim();

                startActivity(share);

            }
        });

        // long click on share button

        share.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view)
            {
                // using bundle as bundle can send any kind of data and intent can't

                // to call the bundle class

                Bundle bundle=new Bundle();
                bundle.putString("namekey",name.getText().toString());
                bundle.putString("emailkey",email.getText().toString());
                bundle.putString("blogkey",blog.getText().toString());
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);

                // attach bundle data to intent object

                intent.putExtras(bundle);

                // here intent play roles in transferring data from one activity to another activity

                startActivity(intent);
                return true;
            }
        });

    }
}
