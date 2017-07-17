package com.example.lhh.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lhh.myapplication.R;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class MyFragment extends BaseFragment {
    View view;
    protected void loadData() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_activity, container, false);
        return view;
    }
    @Override
    protected View initView() {

        return view;
    }
}
