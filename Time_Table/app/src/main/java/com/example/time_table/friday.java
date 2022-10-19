package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class friday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);
        ArrayList<fri> mm = new ArrayList<fri>();
        mm.add(new fri("M3","F-108","11:00-12:00"));
        mm.add(new fri("Lunch","Mess","12:00-1:00"));
        mm.add(new fri(" Eco Env of Business","F-205","1:00-2:00"));
        mm.add(new fri("Intro to Dev","J-119","2:00-3:00"));
        mm.add(new fri("Math & Stat Method","F-205","3:00-4:00"));
        mm.add(new fri("POE","F-205","4:00-5:00"));
        friadapter b = new friadapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list4);
        i.setAdapter(b);
    }
}