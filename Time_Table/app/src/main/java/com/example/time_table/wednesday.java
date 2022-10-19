package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class wednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        ArrayList<wed> mm = new ArrayList<wed>();
        mm.add(new wed("M3","F-108","11:00-12:00"));
        mm.add(new wed("Lunch","Mess","12:00-1:00"));
        mm.add(new wed("Eco Env of Business","F-205","1:00-2:00"));
        mm.add(new wed("Intro to Dev","J-119","2:00-3:00"));
        mm.add(new wed("Math & Stat Method","F-205","3:00-4:00"));
        mm.add(new wed("POE","F-205","4:00-5:00"));
        wedadapter b = new wedadapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list2);
        i.setAdapter(b);
    }
}