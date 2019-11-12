package com.kcjsoft.calligraphy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CommunityFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<CommunityItem> items= new ArrayList<>();
    CommunityAdapterRecycler adapterRecycler;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_community,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino1));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino2));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino3));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino4));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino5));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino6));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino7));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino8));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino9));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino10));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino11));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino12));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino13));
        items.add(new CommunityItem("오늘의 주제는","민국","아아아아아~","2019-11-11 15:40",R.drawable.lino14));



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.com_recycler);
        adapterRecycler= new CommunityAdapterRecycler(items, getActivity());
        recyclerView.setAdapter(adapterRecycler);

    }
}
