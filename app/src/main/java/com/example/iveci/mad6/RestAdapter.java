package com.example.iveci.mad6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by iveci on 2017-04-13.
 */

public class RestAdapter extends BaseAdapter {
    ArrayList<Rest> data = new ArrayList<>();
    Context context;

    public RestAdapter(Context context, ArrayList<Rest> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        if (convertView == null){
            convertView = inflater.inflate(R.layout.rinfo,null);
        }
        TextView t1 = (TextView) convertView.findViewById(R.id.tname);
        TextView t2 = (TextView) convertView.findViewById(R.id.ttel);
        Rest one = data.get(position);
        t1.setText(one.getName().toString());
        t2.setText(one.getTel().toString());
        return convertView;
    }
    Comparator<Rest> nameAsc = new Comparator<Rest>() {
        @Override
        public int compare(Rest o1, Rest o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    public void setNameAscSort(){
        Collections.sort(data,nameAsc);
        this.notifyDataSetChanged();
    }
}
