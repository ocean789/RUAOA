package com.example.lhh.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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
        List<InfoItemBean> list3 = new ArrayList<>();
        String[] str02 = {"姓名", "电话", "邮箱"};
        String[] info = {"谢非同", "+86-13163415815", "1070539262@qq.com"};
        for (int i = 0; i < str02.length; i++) {
            infoitembean = new InfoItemBean();
            infoitembean.setInfo_title(str02[i]);
            infoitembean.setInfo_msg(info[i]);
            list3.add(infoitembean);
            InfoAdapter adapter6 = new InfoAdapter(this, list3, R.layout.info_item);
            listView3.setAdapter(adapter6);
        }
    }
}
