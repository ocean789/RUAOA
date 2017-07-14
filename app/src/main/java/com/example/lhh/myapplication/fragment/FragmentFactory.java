package com.example.lhh.myapplication.fragment;

import java.util.HashMap;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class FragmentFactory {
    private static HashMap<Integer, BaseFragment> mBaseFragments = new HashMap<Integer, BaseFragment>();

    public static BaseFragment createFragment(int pos) {
        BaseFragment baseFragment = mBaseFragments.get(pos);

        if (baseFragment == null) {
            switch (pos) {
                case 0:
                    baseFragment = new NoticeFragment();//公告
                    break;
                case 1:
                    baseFragment = new WorkFragment();//工作
                    break;
                case 2:
                    baseFragment = new ContactFragment();//联系人
                    break;
                case 3:
                    baseFragment = new MyFragment();//我的
                    break;


            }
            mBaseFragments.put(pos, baseFragment);
        }
        return baseFragment;
    }
}
