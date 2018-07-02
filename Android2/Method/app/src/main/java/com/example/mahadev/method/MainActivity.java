package com.example.mahadev.method;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Access", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onDestroy()

    {
        super.onDestroy();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Denied", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onPause()

    {
        super.onPause();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onRestart()

    {
        super.onRestart();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Restarted", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onStop()

    {
        super.onStop();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onResume()

    {
        super.onResume();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Resumed", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onStart()

    {
        super.onStart();
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(getApplicationContext(), "Started", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
}






