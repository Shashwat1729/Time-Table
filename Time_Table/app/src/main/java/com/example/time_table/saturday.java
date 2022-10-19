package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class saturday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);
        ArrayList<sat> mm = new ArrayList<sat>();
        mm.add(new sat("Behavioural Eco","J-219","10:00-11:00"));
        mm.add(new sat("FOFA","F-208","11:00-12:00"));
        satadapter b = new satadapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list5);
        i.setAdapter(b);
    }
}