package com.example.kpweav13.day2activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Bundle b = getIntent().getExtras();
        if(b!=null){
            double pi = b.getDouble("PI");
            Toast.makeText(Main2ActivityB.this, Double.toString(pi), Toast.LENGTH_LONG).show();
        }
    }
}
