package com.basti12354.activityvsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends SuperclassActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setText("2");

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
