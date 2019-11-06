package com.kcjsoft.calligraphy;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HomeAdapterRecycler extends RecyclerView.Adapter {

    ArrayList<HomeItem> homeItems;
    Context context;

    public HomeAdapterRecycler(ArrayList<HomeItem> homeItems, Context context) {
        this.homeItems = homeItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.homeitem_layout,parent,false);

        VH holder= new VH(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh=(VH)holder;
        HomeItem item = homeItems.get(position);

        Glide.with(context).load(item.iv).into(vh.iv);


    }

    @Override
    public int getItemCount() {

        return homeItems.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView iv;

        public VH(@NonNull View itemView) {
            super(itemView);

            iv=itemView.findViewById(R.id.iv);
        }
    }
}
