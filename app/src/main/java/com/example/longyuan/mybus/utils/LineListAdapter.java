package com.example.longyuan.mybus.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.longyuan.mybus.R;
import com.example.longyuan.mybus.pojo.line.LinesItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LONGYUAN on 2018/3/31.
 */

public class LineListAdapter extends RecyclerView.Adapter<LineListAdapter.LineListViewHolder>  {


    private List<LinesItem> mLinesItems;

    private Context mContext;

    public LineListAdapter(List<LinesItem> linesItems, Context context) {
        mLinesItems = linesItems;
        mContext = context;
    }

    @Override
    public LineListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_line,parent,false);

        return new LineListViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(LineListViewHolder holder, int position) {

        final LinesItem linesItem = mLinesItems.get(position);

        holder.Bind(linesItem);

    }

    @Override
    public int getItemCount() {
        return mLinesItems.size();
    }

    public void updateData(List<LinesItem> linesItems){

        mLinesItems = linesItems;

        notifyDataSetChanged();
    }

    public static class LineListViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.textview_line_item)
        TextView mTextView;

        public LineListViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }

        public void Bind(LinesItem linesItem){

            mTextView.setText(linesItem.getName());
        }
    }



}

