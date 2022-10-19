package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mm = (Button) findViewById(R.id.button);
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,monday.class);
                startActivity(m);
            }
        });
        Button ww = (Button) findViewById(R.id.button1);
        ww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,wednesday.class);
                startActivity(m);
            }
        });
        Button th = (Button) findViewById(R.id.button3);
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,thursday.class);
                startActivity(m);
            }
        });
        Button fr = (Button) findViewById(R.id.button4);
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,friday.class);
                startActivity(m);
            }
        });
        Button sa = (Button) findViewById(R.id.button6);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,saturday.class);
                startActivity(m);
            }
        });
    }
    public void ab(View view){
        Intent m = new Intent(MainActivity.this,tuesday.class);
        startActivity(m);
    }
}