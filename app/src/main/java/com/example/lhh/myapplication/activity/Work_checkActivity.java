package com.example.lhh.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.until.custom.TimeView;

/**
 * Created by weiyufeng on 2017/7/17.
 */

public class Work_checkActivity extends AppCompatActivity {
    private TimeView timeView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_check_activity);
        timeView=(TimeView)findViewById(R.id.time_view);
        timeView.setTime(10,35,43);
        timeView.start();

    }
}
