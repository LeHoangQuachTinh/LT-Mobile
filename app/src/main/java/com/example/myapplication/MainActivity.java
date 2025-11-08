package com.example.myapplication;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener{
    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;
    SearchView searchView;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linear_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        linearLayout = findViewById(R.id.linear_layout);
        searchView = findViewById(R.id.search_view);
        displayItems();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText){
                filter(newText);
                return true;
            }
        });


    }
    private void filter(String newText){
        List<MyModel> filteredList = new ArrayList<>();
        for (MyModel item : myModelList){
            if (item.getName().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(item);
            }
        }
        customAdapter.filterList(filteredList);
    }

    private void displayItems(){
        recyclerView = findViewById(R.id.recycle_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myModelList = new ArrayList<>();
        myModelList.add(new MyModel("Lê Hoàng Quách Tỉnh", 20));
        myModelList.add(new MyModel("Trần Thị Mai", 21));
        myModelList.add(new MyModel("Lê Hoàng Minh", 24));
        myModelList.add(new MyModel("Phạm Ngọc Hân", 20));
        myModelList.add(new MyModel("Võ Đức Tài", 23));
        myModelList.add(new MyModel("Đặng Thị Hương", 19));
        myModelList.add(new MyModel("Bùi Quang Huy", 25));
        myModelList.add(new MyModel("Đỗ Thị Kim Chi", 22));
        myModelList.add(new MyModel("Ngô Thanh Tùng", 26));
        myModelList.add(new MyModel("Phan Thị Lan", 20));
        myModelList.add(new MyModel("Huỳnh Ngọc Trâm", 19));
        myModelList.add(new MyModel("Trương Văn Nam", 23));
        myModelList.add(new MyModel("Lý Thị Nhung", 21));
        myModelList.add(new MyModel("Đoàn Quốc Bảo", 24));
        myModelList.add(new MyModel("Tạ Thị Hồng", 22));
        myModelList.add(new MyModel("Nguyễn Thị Thuỳ Dung", 20));
        myModelList.add(new MyModel("Phùng Gia Long", 27));
        myModelList.add(new MyModel("Trịnh Minh Anh", 19));
        myModelList.add(new MyModel("Hoàng Bảo Ngọc", 18));
        myModelList.add(new MyModel("Vũ Tiến Dũng", 23));

        customAdapter = new CustomAdapter(this,myModelList,this);
        recyclerView.setAdapter(customAdapter);

    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, myModel.getName(), Toast.LENGTH_SHORT).show();

    }

}
