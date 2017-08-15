package com.example.lhh.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.activity.CreateActivity;
import com.example.lhh.myapplication.activity.InfoActivity;
import com.example.lhh.myapplication.bean.Contract_itembean;
import com.example.lhh.myapplication.bean.ItemBean;
import com.example.lhh.myapplication.activity.FriendActivity;
import com.example.lhh.myapplication.until.custom.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiyufeng on 2017/7/14.
 */

public class ContractFragment extends BaseFragment {
    View view;
    Contract_itembean Contract_itembean;
    protected void loadData() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contract_activity, container, false);
        ItemBean itembean;
//        ListView listView = (ListView) findViewById(R.id.list);
        ListView listView2 = (ListView) view.findViewById(R.id.list2);
        ImageView search_title = (ImageView)view. findViewById(R.id.search_title);
        ImageView add = (ImageView) view.findViewById(R.id.add);
        TextView friend = (TextView) view.findViewById(R.id.myfriend) ;
        TextView create= (TextView) view.findViewById(R.id.creategroup) ;
//        Spinner spinner_job = (Spinner) findViewById(R.id.spinner_job);
//        Spinner spinner_size = (Spinner) findViewById(R.id.spinner_size);
//        Spinner spinner_loc = (Spinner) findViewById(R.id.spinner_loc);
        List<ItemBean> list = new ArrayList<>();
        List<ItemBean> list2 = new ArrayList<>();
//        String []str01 = {"我的好友","我的群组","创建团队"};
        String []superfriend = {"老谢","老魏","国哥","老徐","煜神"};
//        int [] imgs = {R.drawable.friend,R.drawable.group,R.drawable.create} ;
        int [] head = {R.drawable.wyf,R.drawable.xft,R.drawable.zwg,R.drawable.lx,R.drawable.ys};

//        for(int i=0;i<str01.length;i++){
//            itembean = new ItemBean();
//            itembean.setFunction("  "+str01[i]);
//            itembean.setProtrait(imgs[i]);
//            list.add(itembean);
//        }
        for(int i=0;i<superfriend.length;i++){
            itembean = new ItemBean();
            itembean.setFunction("  "+superfriend[i]);
            itembean.setProtrait(head[i]);
            list2.add(itembean);
        }
        search_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent();
                intent01.setClass(getActivity(),FriendActivity.class);
                startActivity(intent01);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"添加联系人功能暂未实装",Toast.LENGTH_SHORT).show();
            }
        });

        friend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent01 = new Intent();
                intent01.setClass(getActivity(),FriendActivity.class);
                startActivity(intent01);
            }
        });
        create.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent01 = new Intent();
                intent01.setClass(getActivity(),CreateActivity.class);
                startActivity(intent01);
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent01 = new Intent();
                intent01.setClass(getActivity(),InfoActivity.class);
                startActivity(intent01);
            }
        });
//        MyAdapter adapter = new MyAdapter(this,list,R.layout.item_contact);
        MyAdapter adapter2 = new MyAdapter(mContent,list2,R.layout.item_superfreind);
//        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.job,android.R.layout.simple_spinner_item);
//        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.size,android.R.layout.simple_spinner_item);
//        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.loc,android.R.layout.simple_spinner_item);
//        listView.setAdapter(adapter);
        listView2.setAdapter(adapter2);

//        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner_job.setAdapter(adapter3);
//        spinner_job.setPrompt(getString(R.string.job_tip));
//        spinner_size.setAdapter(adapter4);
//        spinner_size.setPrompt(getString(R.string.size_tip));
//        spinner_loc.setAdapter(adapter5);
//        spinner_loc.setPrompt(getString(R.string.job_tip));


        return view;
    }

    @Override
    protected View initView() {
        return view;
    }
}
