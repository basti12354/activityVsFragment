package com.basti12354.activityvsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.basti12354.activityvsfragment.fragments.FragmentActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.decide_between_activ_and_frag);

        Button fragments = findViewById(R.id.fragmentBtn);
        fragments.setOnClickListener(this);
        Button activity = findViewById(R.id.activityBtn);
        activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fragmentBtn:
                Intent myIntent = new Intent(getApplicationContext(), FragmentActivity.class);
                startActivity(myIntent);
                break;
            case R.id.activityBtn:
                Intent myIntent2 = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(myIntent2);
                break;
        }
    }
}
