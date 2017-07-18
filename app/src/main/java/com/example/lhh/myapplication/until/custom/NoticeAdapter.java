package com.example.lhh.myapplication.until.custom;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lhh.myapplication.R;
import com.example.lhh.myapplication.bean.NoticeItemBean;

import java.util.List;

/**
 * Created by lvzho on 2015/4/28 0028.
 */
public class NoticeAdapter extends CommonAdapter<NoticeItemBean> {

    private Context mcContext;
    public NoticeAdapter(Context context, List<NoticeItemBean> list, int layoutId) {

        super(context, layoutId, list);
        this.mcContext=context;
    }

    @Override
    public void convert(ViewHolder viewHolder, final NoticeItemBean noticeItemBean) {
        ((TextView)viewHolder.getView(R.id.name)).setText(noticeItemBean.getName());
        ((TextView)viewHolder.getView(R.id.date)).setText(noticeItemBean.getDate());
        ((TextView)viewHolder.getView(R.id.title)).setText(noticeItemBean.getContent());
        ((ImageView)viewHolder.getView(R.id.head)).setImageResource(noticeItemBean.getHead());
        ((ImageView)viewHolder.getView(R.id.img_content)).setImageResource(noticeItemBean.getImg());
    }
}
