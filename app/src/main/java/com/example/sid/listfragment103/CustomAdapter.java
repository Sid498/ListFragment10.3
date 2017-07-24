package com.example.sid.listfragment103;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SID on 7/24/2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<Data> mlist;
    Fragment_List context;
    LayoutInflater layoutInflater;

    public CustomAdapter(Fragment_List context,ArrayList mlist){
        this.context=context;
        this.mlist=mlist;
        layoutInflater = (LayoutInflater) context.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int i) {
        return mlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.row,null);

        TextView name = (TextView) view.findViewById(R.id.tvName);
        TextView info = (TextView) view.findViewById(R.id.tvInfo);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);

        name.setText(mlist.get(i).getmName());
        info.setText(mlist.get(i).getmInfo());
        imageView.setImageResource(mlist.get(i).getmId());
        return view;
    }
}
