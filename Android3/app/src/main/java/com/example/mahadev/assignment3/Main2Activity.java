package com.example.mahadev.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=(TextView)findViewById(R.id.textView);

        Bundle b =getIntent().getExtras();
        String user,pass;
        user=pass="";
        if(b==null)
        {
            finish();
        }

        user=b.getString ("username");
        pass=b.getString("password");
        if(user.equals("ADMIN")&& pass.equals("@password"))

            t.setText("Welcome "+user+"\n\n You logged in successfully");
        else
            t.setText("Wrong username or Password");
       // E4.setText(s2);
    }
}
