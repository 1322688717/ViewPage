package com.example.viewpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //把图片资源放进一个列表里面
    public List<Integer> pics = new ArrayList<>();
    LinearLayout dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //将图片资源传入list里面
        pics.add(R.mipmap.a);
        pics.add(R.mipmap.b);
        pics.add(R.mipmap.c);
        pics.add(R.mipmap.d);
        pics.add(R.mipmap.e);
        pics.add(R.mipmap.f);
        pics.add(R.mipmap.g);
        //实例化适配器
        RecyclerView.Adapter adapter = new Adapter_a(pics,getApplicationContext());
        //给viewpage设置适配器
        ViewPager2 viewPager2 = findViewById(R.id.vp_one);
        viewPager2.setAdapter(adapter);
        //滑动监听，用于下方小球的改变
        dots = findViewById(R.id.dots);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                for(int i = 0;i < dots.getChildCount();i++){
                    dots.getChildAt(i).setBackgroundResource(R.drawable.unselected);
                }
                dots.getChildAt(position).setBackgroundResource(R.drawable.selected);
            }
        });
    }
}




















//            @NonNull
//            //创建
//            @Override
//            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                //此时用的布局是viewpage每一页中来盛放图片的布局
//                //该布局不设置任何控件，因为待会我们会直接将图片作为根布局的背景
//                View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.item,parent,false);
//                return new ViewHolder(v);
//            }
//            //绑定
//            @Override
//            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//                ViewHolder h = (ViewHolder)holder;
//                h.container.setBackgroundResource(pics.get(position));
//            }
//            //数量
//            @Override
//            public int getItemCount() {
//                return pics.size();
//            }
//        };