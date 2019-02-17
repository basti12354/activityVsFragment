package com.basti12354.activityvsfragment.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.basti12354.activityvsfragment.R;

public class FragmentSuperclass extends Fragment {

    TextView textView;
    Button previousBtn, nextBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_main, container, false);

        textView = rootview.findViewById(R.id.tvNumber);
        previousBtn = rootview.findViewById(R.id.previousBtn);
        nextBtn = rootview.findViewById(R.id.nextBtn);

        return rootview;
    }

    public void setText(String text){
        textView.setText(text);
    }
}
