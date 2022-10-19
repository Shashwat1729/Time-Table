package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        ArrayList<mon> mm = new ArrayList<mon>();
        mon ab = new mon("M-3(Tut)","J-120","8:00-9:00");
        mm.add(ab);
        mm.add(new mon("M3","F-108","11:00-12:00"));
        mm.add(new mon("Lunch","Mess","12:00-1:00"));
        mm.add(new mon(" Eco Env of Business","F-205","1:00-2:00"));
        mm.add(new mon("Intro to Dev","J-119","2:00-3:00"));
        mm.add(new mon("Math & Stat Method","F-205","3:00-4:00"));
        mm.add(new mon("POE","F-205","4:00-5:00"));
        monadapter b = new monadapter(this,mm);
        ListView i = (ListView) findViewById(R.id.list);
        i.setAdapter(b);
    }
}