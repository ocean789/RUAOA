package com.example.lhh.myapplication.until.custom;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.Contract_itembean;

import java.util.List;

/**
 * Created by lvzho on 2015/4/28 0028.
 */
public class ContractAdapter extends CommonAdapter<Contract_itembean> {

    Context mContext;
    public ContractAdapter(Context context, List<Contract_itembean> list, int layoutId) {

        super(context, layoutId, list);
        mContext=context;
    }




    public void convert(ViewHolder viewHolder, final Contract_itembean itemBean) {
        ((ImageView) viewHolder.getView(R.id.portrait)).setImageResource(itemBean.getProtrait());
        ((TextView)viewHolder.getView(R.id.function)).setText(itemBean.getFunction());
        ((TextView)viewHolder.getView(R.id.function)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"联系人详细信息功能暂未实装",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
