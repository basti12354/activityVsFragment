package com.basti12354.activityvsfragment.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.basti12354.activityvsfragment.R;

public class FirstFrag extends FragmentSuperclass {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        setText("1");

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, new SecondFrag());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }


}
