package com.example.viewpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_a extends RecyclerView.Adapter {
    private List<Integer> pics;
    private Context context;

    public Adapter_a(List<Integer> pics, Context context) {
        this.pics = pics;
        this.context = context;
    }

    @NonNull
    //创建
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //此时用的布局是viewpage每一页中来盛放图片的布局
        //该布局不设置任何控件，因为待会我们会直接将图片作为根布局的背景
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }
    //绑定
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder h = (ViewHolder)holder;
        h.container.setBackgroundResource(pics.get(position));
    }
    //数量
    @Override
    public int getItemCount() {
        return pics.size();
    }
}
