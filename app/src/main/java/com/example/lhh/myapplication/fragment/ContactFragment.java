package com.example.lhh.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class ContactFragment extends BaseFragment {
    View view;
    protected void loadData() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return view;
    }

    @Override
    protected View initView() {
        return view;
    }
}
