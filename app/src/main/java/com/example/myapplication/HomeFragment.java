package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView rcvProducts;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        rcvProducts = view.findViewById(R.id.rcvProducts);
        rcvProducts.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new Product("iPhone 15 Pro Max", "32.990.000đ", android.R.drawable.ic_menu_camera));
        list.add(new Product("Samsung S24 Ultra", "28.990.000đ", android.R.drawable.ic_menu_gallery));
        list.add(new Product("Macbook Air M3", "29.990.000đ", android.R.drawable.ic_menu_manage));

        ProductAdapter adapter = new ProductAdapter(getContext(), list);
        rcvProducts.setAdapter(adapter);

        return view;
    }
}
