package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class thursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);
        ArrayList<thur> mm = new ArrayList<thur>();
        mm.add(new thur("Behavioural Eco","J-219","10:00-11:00"));
        mm.add(new thur("FOFA","F-208","11:00-12:00"));
        thuradapter b = new thuradapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list3);
        i.setAdapter(b);
    }
}