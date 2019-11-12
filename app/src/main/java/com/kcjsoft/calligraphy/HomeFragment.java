package com.kcjsoft.calligraphy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<HomeItem> items= new ArrayList<>();
    HomeAdapterRecycler adapterRecycler;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items.add(new HomeItem(R.drawable.lino1));
        items.add(new HomeItem(R.drawable.lino2));
        items.add(new HomeItem(R.drawable.lino3));
        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.lino5));
        items.add(new HomeItem(R.drawable.lino6));
        items.add(new HomeItem(R.drawable.lino7));
        items.add(new HomeItem(R.drawable.lino8));
        items.add(new HomeItem(R.drawable.lino9));
        items.add(new HomeItem(R.drawable.lino10));
        items.add(new HomeItem(R.drawable.lino11));
        items.add(new HomeItem(R.drawable.lino12));
        items.add(new HomeItem(R.drawable.lino13));
        items.add(new HomeItem(R.drawable.lino14));
        items.add(new HomeItem(R.drawable.lino15));
        items.add(new HomeItem(R.drawable.lino16));
        items.add(new HomeItem(R.drawable.lino17));








    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.home_recycler);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.setLayoutManager(layoutManager);
        adapterRecycler= new HomeAdapterRecycler(items, getActivity());
        recyclerView.setAdapter(adapterRecycler);



    }
}
