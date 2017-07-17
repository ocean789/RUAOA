package com.example.lhh.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.Contract_itembean;
import com.example.lhh.myapplication.until.custom.ContractAdapter;

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
        ListView listView = (ListView)view.findViewById(R.id.list);
        ListView listView2 = (ListView)view.findViewById(R.id.list2);
        Button search_title = (Button)view.findViewById(R.id.search_title);
        Button add = (Button)view.findViewById(R.id.add);
        List<Contract_itembean> list = new ArrayList<>();
        List<Contract_itembean> list2 = new ArrayList<>();
        String []str01 = {"我的好友","我的群组","创建团队"};
        String []superfriend = {"老谢","老魏","国哥","老徐","煜神"};
        int [] imgs = {R.mipmap.friend,R.mipmap.group,R.mipmap.create} ;
        int [] head = {R.mipmap.wyf,R.mipmap.xft,R.mipmap.zwg,R.mipmap.lx,R.mipmap.ys};
        for(int i=0;i<str01.length;i++){
            Contract_itembean = new Contract_itembean();
            Contract_itembean.setFunction("  "+str01[i]);
            Contract_itembean.setProtrait(imgs[i]);
            list.add(Contract_itembean);
        }for(int i=0;i<superfriend.length;i++){
            Contract_itembean = new Contract_itembean();
            Contract_itembean.setFunction("  "+superfriend[i]);
            Contract_itembean.setProtrait(head[i]);
            list2.add(Contract_itembean);
        }
        search_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"搜索功能暂未实装",Toast.LENGTH_SHORT).show();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"添加联系人功能暂未实装",Toast.LENGTH_SHORT).show();
            }
        });
        ContractAdapter adapter = new ContractAdapter(getActivity(),list,R.layout.contract_item);
        ContractAdapter adapter2 = new ContractAdapter(getActivity(),list2,R.layout.contract_superfrind_item);
        listView.setAdapter(adapter);
        listView2.setAdapter(adapter2);



        return view;
    }

    @Override
    protected View initView() {
        return view;
    }
}
