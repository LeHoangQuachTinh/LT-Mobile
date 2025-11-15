package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_profile_fragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recyclerStagger);

        rv.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        ArrayList<Product> items = loadProducts();

        rv.setAdapter(new ProductAdapter(items));

        return view;
    }

    private ArrayList<Product> loadProducts() {
        ArrayList<Product> list = new ArrayList<>();

        // Cố tình thêm các item lặp lại để tạo hiệu ứng "cao thấp khác nhau"
        list.add(new Product("Cà phê sữa", "25.000đ", R.drawable.coffee));
        list.add(new Product("Trà đào", "30.000đ", R.drawable.tea));
        list.add(new Product("Sinh tố bơ", "40.000đ", R.drawable.sinh_to));
        list.add(new Product("Nước cam", "35.000đ", R.drawable.orange));
        list.add(new Product("Cacao", "28.000đ", R.drawable.coffee));
        list.add(new Product("Trà sữa", "32.000đ", R.drawable.milk));
        list.add(new Product("Matcha", "33.000đ", R.drawable.tea));
        list.add(new Product("Hồng trà", "27.000đ", R.drawable.orange));

        return list;
    }
}
