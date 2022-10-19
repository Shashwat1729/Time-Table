package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class tuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
        ArrayList<tue> mm = new ArrayList<tue>();

        mm.add(new tue("Behavioural Eco","J-219","10:00-11:00"));
        mm.add(new tue("FOFA","F-208","11:00-12:00"));

        tueadapter b = new tueadapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list1);
        i.setAdapter(b);
    }
}