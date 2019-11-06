package com.kcjsoft.calligraphy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));
        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));
        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));
        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));

        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));

        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));
        items.add(new HomeItem(R.drawable.lino4));
        items.add(new HomeItem(R.drawable.calligraphy1));






    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.home_recycler);
        adapterRecycler= new HomeAdapterRecycler(items, getActivity());
        recyclerView.setAdapter(adapterRecycler);



    }
}
