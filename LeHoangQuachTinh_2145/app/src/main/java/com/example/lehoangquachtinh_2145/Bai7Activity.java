package com.example.lehoangquachtinh_2145;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Bai7Activity extends AppCompatActivity {
    private Spinner spnCategory;
    private TextView tvMultiSelect;

    // Dữ liệu chọn nhiều
    String[] languages = {"Java", "Android", "PHP", "C#", "ASP.NET"};
    boolean[] selectedLanguages = new boolean[languages.length];
    List<String> selectedItems = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);

        spnCategory = findViewById(R.id.spnCategory);
        tvMultiSelect = findViewById(R.id.tvMultiSelect);

        // Tạo danh sách dữ liệu cho Spinner chọn 1
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Android");
        list.add("PHP");
        list.add("C#");
        list.add("ASP.NET");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnCategory.setAdapter(adapter);

        // Bắt sự kiện chọn một
        spnCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(
                        Bai7Activity.this,
                        spnCategory.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT
                ).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Không làm gì
            }
        });

        // Mở dialog chọn nhiều khi bấm vào TextView
        tvMultiSelect.setOnClickListener(v -> showMultiSelectDialog());
    }

    // Hàm hiển thị Dialog chọn nhiều
    public void showMultiSelectDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Chọn các ngôn ngữ yêu thích");

        builder.setMultiChoiceItems(languages, selectedLanguages, (dialog, which, isChecked) -> {
            if (isChecked) {
                if (!selectedItems.contains(languages[which])) {
                    selectedItems.add(languages[which]);
                }
            } else {
                selectedItems.remove(languages[which]);
            }
        });

        builder.setPositiveButton("OK", (dialog, which) -> {
            if (selectedItems.isEmpty()) {
                tvMultiSelect.setText("Chưa chọn ngôn ngữ nào");
            } else {
                String selectedText = String.join(", ", selectedItems);
                tvMultiSelect.setText(selectedText);
            }
        });

        builder.setNegativeButton("Hủy", null);
        builder.show();
    }
}
