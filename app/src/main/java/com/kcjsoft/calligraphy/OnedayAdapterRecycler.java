package com.kcjsoft.calligraphy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class OnedayAdapterRecycler extends RecyclerView.Adapter {

    ArrayList<OnedayItem> onedayItems;
    Context context;

    public OnedayAdapterRecycler(ArrayList<OnedayItem> onedayItems, Context context) {
        this.onedayItems = onedayItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.onedayitem_layout,parent,false);

        VH holder= new VH(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh=(VH)holder;
        OnedayItem item=onedayItems.get(position);
        vh.tv_title.setText(item.title);
        vh.tv_name.setText(item.name);
        vh.tv_address.setText(item.address);
        vh.tv_hour.setText(item.hour);

        Glide.with(context).load(item.iv).into(vh.iv);

    }

    @Override
    public int getItemCount() {
        return onedayItems.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tv_title;
        TextView tv_name;
        TextView tv_address;
        TextView tv_hour;

        ImageView iv;

        public VH(@NonNull View itemView) {
            super(itemView);

            tv_title=itemView.findViewById(R.id.oneday_title);
            tv_name=itemView.findViewById(R.id.oneday_name);
            tv_address=itemView.findViewById(R.id.oneday_address);
            tv_hour=itemView.findViewById(R.id.oneday_hour);

            iv=itemView.findViewById(R.id.oneday_iv);
        }
    }
}
