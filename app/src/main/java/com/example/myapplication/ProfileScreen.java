package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileScreen extends AppCompatActivity {
    Button btnSetting_2145;
    TextView txtPassword_2145,txtUsername_2145;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();

        String userName = intent.getStringExtra("Username");
        String passWord = intent.getStringExtra("Password");

        btnSetting_2145 = findViewById(R.id.btnSettings);
        txtUsername_2145 = findViewById(R.id.textEmail_2145);
        txtPassword_2145 = findViewById(R.id.textPass_2145);

        txtUsername_2145.setText(userName);
        txtPassword_2145.setText(passWord);
        btnSetting_2145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}