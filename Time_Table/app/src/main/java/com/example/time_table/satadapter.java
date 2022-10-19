package com.example.time_table;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class satadapter extends ArrayAdapter<sat> {
    public satadapter(Activity context, ArrayList<sat> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        sat cu = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView2);
        nameTextView.setText(cu.givsub());
        TextView roomtext = (TextView) listItemView.findViewById(R.id.textView3);
        roomtext.setText(cu.givroom());
        TextView timetex = (TextView) listItemView.findViewById(R.id.textView4);
        timetex.setText(cu.givtime());
        return listItemView;
    }
}