package com.example.october.testproj_slider_fragment_listview.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.october.testproj_slider_fragment_listview.CustomUsersAdapter;
import com.example.october.testproj_slider_fragment_listview.R;
import com.example.october.testproj_slider_fragment_listview.Valute;

import java.util.ArrayList;

/**
 * Created by October on 29.01.2017.
 */
public class Fragment2 extends Fragment{
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        populateUsersList(view);
        return  view;
    }

    private void populateUsersList(View view) {
        // Construct the data source
        ArrayList<Valute> arrayOfValutes = Valute.getValutes();
        // Create the adapter to convert the array to views
        CustomUsersAdapter adapter = new CustomUsersAdapter(view.getContext(), arrayOfValutes);
        // Attach the adapter to a ListView
        ListView listView = (ListView) view.findViewById(R.id.lvItems);
        listView.setAdapter(adapter);
    }


}
