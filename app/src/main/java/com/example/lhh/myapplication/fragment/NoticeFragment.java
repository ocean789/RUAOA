package com.example.lhh.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.lhh.myapplication.R;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class NoticeFragment extends BaseFragment {

    View view;
    Button button;
    protected void loadData() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.laoxu, container, false);
        button=(Button)view.findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContent,"laoxua", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    protected View initView() {
        return view;
    }
}
