package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_search_fragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recyclerGrid);
        rv.setLayoutManager(new GridLayoutManager(getContext(), 2));

        ArrayList<Product> items = loadProducts();

        rv.setAdapter(new ProductAdapter(items));

        return view;
    }

    private ArrayList<Product> loadProducts() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Cà phê sữa", "25.000đ", R.drawable.coffee));
        list.add(new Product("Trà đào", "30.000đ", R.drawable.tea));
        list.add(new Product("Sinh tố bơ", "40.000đ", R.drawable.sinh_to));
        list.add(new Product("Nước cam", "35.000đ", R.drawable.orange));
        list.add(new Product("Cacao nóng", "28.000đ", R.drawable.coffee));
        list.add(new Product("Trà sữa", "32.000đ", R.drawable.milk));
        return list;
    }
}
