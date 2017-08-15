package com.example.lhh.myapplication.until.custom;

import android.content.Context;
import android.widget.TextView;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.InfoItemBean;

import java.util.List;

/**
 * Created by dell on 2017/7/25.
 */

public class InfoAdapter extends CommonAdapter<InfoItemBean>{
    Context mContext;
    public InfoAdapter(Context context, List<InfoItemBean> list, int layoutId) {

        super(context, layoutId, list);
        mContext=context;
    }

    @Override
    public void convert(ViewHolder viewHolder, final InfoItemBean infoitemBean) {
        ((TextView)viewHolder.getView(R.id.info_title)).setText(infoitemBean.getInfo_title());
        ((TextView)viewHolder.getView(R.id.info_msg)).setText(infoitemBean.getInfo_msg());

    }
}
