package com.example.lhh.myapplication.until.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by weiyufeng on 2017/7/17.
 */


public abstract class CommonAdapter<T> extends BaseAdapter {
    private LayoutInflater inflater;
    private int layoutId;
    private List<T> list;

    public CommonAdapter(Context context, int layoutId, List<T> list) {
        this.inflater = LayoutInflater.from(context);
        this.layoutId = layoutId;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = ViewHolder.getViewHolder(parent,convertView,inflater,layoutId);
        convert(viewHolder,list.get(position));
        return viewHolder.getConvertView();
    }
    public abstract void convert(ViewHolder viewHolder, T t);
}

