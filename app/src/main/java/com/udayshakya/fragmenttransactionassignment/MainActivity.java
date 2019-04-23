package com.udayshakya.fragmenttransactionassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add to Firstfragment o layout activity_main.xml
        getSupportFragmentManager().beginTransaction().add(R.id.main_page,new FirstFragment()).commit();
    }
}
