package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    RecyclerView rcvSearch;
    SearchAdapter adapter;
    ArrayList<String> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_search_fragment, container, false);

        rcvSearch = view.findViewById(R.id.rcvSearch);

        // DATA MẪU
        list = new ArrayList<>();
        list.add("iPhone 15 Pro Max");
        list.add("Samsung S24 Ultra");
        list.add("Laptop Asus ROG");
        list.add("Chuột Logitech G102");
        list.add("Tai nghe AirPods Pro 2");

        adapter = new SearchAdapter(list);
        rcvSearch.setLayoutManager(new LinearLayoutManager(getContext()));
        rcvSearch.setAdapter(adapter);

        return view;
    }
}
