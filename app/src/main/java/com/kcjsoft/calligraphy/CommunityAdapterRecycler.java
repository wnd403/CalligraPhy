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

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommunityAdapterRecycler extends RecyclerView.Adapter {

    ArrayList<CommunityItem> communityItems;
    Context context;

    public CommunityAdapterRecycler(ArrayList<CommunityItem> communityItems, Context context) {
        this.communityItems = communityItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.communityitem_layout,parent,false);
        VH holder= new VH(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh=(VH)holder;
        CommunityItem item= communityItems.get(position);

        vh.tv_name.setText(item.name);
        vh.tv_title.setText(item.title);
        vh.tv_content.setText(item.content);
        vh.tv_hour.setText(item.hour);

        Glide.with(context).load(item.iv).into(vh.icon_circle);

    }

    @Override
    public int getItemCount() {
        return communityItems.size();
    }

    class VH extends RecyclerView.ViewHolder {

        TextView tv_title;
        TextView tv_name;
        TextView tv_content;
        TextView tv_hour;
        CircleImageView icon_circle;

        public VH(@NonNull View itemView) {
            super(itemView);

            tv_title=itemView.findViewById(R.id.com_title);
            tv_name=itemView.findViewById(R.id.com_name);
            tv_content=itemView.findViewById(R.id.com_content);
            tv_hour=itemView.findViewById(R.id.com_hour);
            icon_circle=itemView.findViewById(R.id.icon_circle);

        }
    }
}
