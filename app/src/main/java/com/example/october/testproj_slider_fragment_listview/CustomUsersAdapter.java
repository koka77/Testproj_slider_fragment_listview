package com.example.october.testproj_slider_fragment_listview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.october.testproj_slider_fragment_listview.fragments.Fragment2;

import java.util.ArrayList;

public class CustomUsersAdapter extends ArrayAdapter<Valute> {
    public CustomUsersAdapter(Context context, ArrayList<Valute> users) {
        super(context, 0, users);
    }



    @Override
     public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Valute valute = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);// parent or null
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_val1);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tv_val2);
        // Populate the data into the template view using the data object
        tvName.setText(valute.name);
        tvHome.setText(valute.value);
        // Return the completed view to render on screen
        return convertView;
    }
}
