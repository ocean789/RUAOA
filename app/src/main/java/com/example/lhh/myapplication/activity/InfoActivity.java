package com.example.lhh.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.InfoItemBean;
import com.example.lhh.myapplication.until.custom.InfoAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/7/26.
 */

public class InfoActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_contact);
        InfoItemBean infoitembean;
        ListView listView3 = (ListView) findViewById(R.id.list_info);
        TextView info_name = (TextView)findViewById(R.id.name_info);
        ImageView portrait_info = (ImageView)findViewById(R.id.portrait_info);
        List<InfoItemBean> list3 = new ArrayList<>();
        String[] str02 = {"姓名", "电话", "邮箱"};
        String[] info = {"谢非同", "+86-13163415815", "1070539262@qq.com","老魏", "+86-18845070712", "646177114@qq.com",
                "国哥", "+86-15846339389", "204172782@qq.com","老徐", "+86-18845638315", "2842071028@qq.com",
                "煜神", "+86-13019712202", "840335765@qq.com"};
        int [] head = {R.drawable.wyf,R.drawable.xft,R.drawable.zwg,R.drawable.lx,R.drawable.ys};
        Intent intent01 = getIntent();
        Bundle bundle = intent01.getExtras();
        int i = bundle.getInt("i");
        info_name.setText(info[3*i]);
        portrait_info.setImageResource(head[i]);
        Log.i(",,,,,,,,,,,,,","sdsad"+i);
        for (int j = 0; j< str02.length; j++) {
            infoitembean = new InfoItemBean();
            infoitembean.setInfo_title(str02[j]);
            infoitembean.setInfo_msg(info[(3*i+j)]);
            list3.add(infoitembean);
            InfoAdapter adapter6 = new InfoAdapter(this, list3, R.layout.info_item);
            listView3.setAdapter(adapter6);
        }
    }
}
