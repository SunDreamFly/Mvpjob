package com.example.mvpjob.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvpjob.R;
import com.example.mvpjob.bean.HomeBean;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {
    private ArrayList<HomeBean.NewsDTO> list;
    private Context context;

    public HomeAdapter(ArrayList<HomeBean.NewsDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false);
        return new HomeHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        Glide.with(context).load(list.get(position).getImageUrl()).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HomeHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
             iv = itemView.findViewById(R.id.iv_home);
        }
    }

}
