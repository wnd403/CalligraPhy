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

public class OnedayFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<OnedayItem> items= new ArrayList<>();
    OnedayAdapterRecycler adapterRecycler;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_oneday, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino1));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino2));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino3));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino4));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino5));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino6));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino7));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino8));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino9));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino10));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino11));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino12));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino13));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino14));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino15));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino16));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino17));
        items.add(new OnedayItem("안녕하세요","김철중","호로롤로로","2019-11-11 15:55",R.drawable.lino18));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.one_recycler);
        adapterRecycler= new OnedayAdapterRecycler(items,getActivity());
        recyclerView.setAdapter(adapterRecycler);

    }
}
