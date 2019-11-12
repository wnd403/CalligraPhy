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

public class BusinessFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<BusinessItem> items= new ArrayList<>();
    BusinessAdapterRecycler adapterRecycler;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_business,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items.add(new BusinessItem("황비홍","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino1));
        items.add(new BusinessItem("성룡","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino2));
        items.add(new BusinessItem("엽문","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino3));
        items.add(new BusinessItem("견자단","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino4));
        items.add(new BusinessItem("김철중","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino5));
        items.add(new BusinessItem("김현중","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino6));
        items.add(new BusinessItem("박민국","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino7));
        items.add(new BusinessItem("아뵤","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino8));
        items.add(new BusinessItem("이소룡","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino9));
        items.add(new BusinessItem("데헷","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino10));
        items.add(new BusinessItem("허허","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino11));
        items.add(new BusinessItem("황비홍","010-2646-4003","bundo1111@naver.com","www.youtube.com","고수입니다",R.drawable.lino12));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.bus_recycler);
        adapterRecycler= new BusinessAdapterRecycler(items,getActivity());
        recyclerView.setAdapter(adapterRecycler);

    }
}
