package com.example.lhh.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.NoticeItemBean;
import com.example.lhh.myapplication.until.custom.NoticeAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class NoticeFragment extends BaseFragment {

    View view;

    private ListView listView;
    private List<NoticeItemBean> items =new ArrayList<>();
    private LayoutInflater mLayoutInflater;
    NoticeItemBean noticeItemBean;
    private int[] imgs= {R.mipmap.baseball,R.mipmap.basketball,R.mipmap.soccer,R.mipmap.volleyball};
    private int[] heads={R.mipmap.headone,R.mipmap.headtwo,R.mipmap.headthree,R.mipmap.headfour};



    protected void loadData() {


        for(int i=0;i<imgs.length;i++){
            noticeItemBean =new NoticeItemBean();
            noticeItemBean.setName("老哥"+i);
            noticeItemBean.setDate("2017-"+i);
            noticeItemBean.setContent("噜噜噜噜"+i);
            noticeItemBean.setImg(imgs[i]);
            noticeItemBean.setHead(heads[i]);
            items.add(noticeItemBean);
        }

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.notice_activity, container, false);

        listView= (ListView) view.findViewById(R.id.list);
        final NoticeAdapter noticeAdapter =new NoticeAdapter(mContent,items,R.layout.notice_item);
        listView.setAdapter(noticeAdapter);
        Button button = (Button) view.findViewById(R.id.plus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContent,"hello",Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }

    @Override
    protected View initView() {
        return view;
    }
}
