package com.example.lhh.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.activity.Work_checkActivity;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class WorkFragment extends BaseFragment {
    View view;
Button checkbut;
    protected void loadData() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.work_activity, container, false);
checkbut=(Button)view.findViewById(R.id.checkbut);
        checkbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), Work_checkActivity.class);
                startActivity(intent);
            }
        });
    return view;
    }
    protected View initView() {
        return view;
    }
}
