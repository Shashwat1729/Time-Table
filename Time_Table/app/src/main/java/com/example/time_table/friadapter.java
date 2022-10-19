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

public class friadapter extends ArrayAdapter<fri> {
    public friadapter(Activity context, ArrayList<fri> androidFlavors) {
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
        fri cu = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView2);
        nameTextView.setText(cu.givsub());
        TextView roomtext = (TextView) listItemView.findViewById(R.id.textView3);
        roomtext.setText(cu.givroom());
        TextView timetex = (TextView) listItemView.findViewById(R.id.textView4);
        timetex.setText(cu.givtime());
        return listItemView;
    }
}