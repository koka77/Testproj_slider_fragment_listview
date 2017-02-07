package com.example.october.testproj_slider_fragment_listview.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.october.testproj_slider_fragment_listview.R;


/**
 * Created by October on 29.01.2017.
 */

public class Fragment1 extends Fragment implements View.OnClickListener{

    Button bt1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        bt1 = (Button)view.findViewById(R.id.button1);
        bt1.setOnClickListener(this);

        return  view;
    }


    @Override
    public void onClick(View v) {
        bt1.setText("sdfsd");
    }
}
