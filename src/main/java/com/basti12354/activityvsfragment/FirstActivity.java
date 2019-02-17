package com.basti12354.activityvsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity  extends SuperclassActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setText("1");
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Click", "Click");
                Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
