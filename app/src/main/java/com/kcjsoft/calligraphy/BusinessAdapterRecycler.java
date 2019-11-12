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

public class BusinessAdapterRecycler extends RecyclerView.Adapter {

    ArrayList<BusinessItem> businessItems;
    Context context;

    public BusinessAdapterRecycler(ArrayList<BusinessItem> businessItems, Context context) {
        this.businessItems = businessItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.businessitem_layout,parent,false);

        VH holder= new VH(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh=(VH)holder;
        BusinessItem item= businessItems.get(position);

        vh.tv_name.setText(item.name);
        vh.tv_phone.setText(item.phone);
        vh.tv_email.setText(item.email);
        vh.tv_youtube.setText(item.youtube);
        vh.tv_career.setText(item.career);

        Glide.with(context).load(item.iv).into(vh.iv);




    }

    @Override
    public int getItemCount() {
        return businessItems.size();
    }

    class VH extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_phone;
        TextView tv_email;
        TextView tv_youtube;
        TextView tv_career;

        ImageView iv;


        public VH(@NonNull View itemView) {
            super(itemView);

            tv_name=itemView.findViewById(R.id.bus_name);
            tv_phone=itemView.findViewById(R.id.bus_phone);
            tv_email=itemView.findViewById(R.id.bus_email);
            tv_youtube=itemView.findViewById(R.id.bus_youtube);
            tv_career=itemView.findViewById(R.id.bus_career);

            iv=itemView.findViewById(R.id.bus_iv);


        }
    }

}
