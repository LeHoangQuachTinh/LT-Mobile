package com.example.quachtinh_2145_gk;

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

public class Screen2Activity extends AppCompatActivity {

    TextView txtName_2145,txtUsername_2145,txtPhone_2145,txtEmail_2145;
    Button btnBack_2145;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen2);

        txtEmail_2145 = findViewById(R.id.txtEmail);
        txtUsername_2145 = findViewById(R.id.txtUsername);
        txtPhone_2145 = findViewById(R.id.txtPhone);
        txtName_2145 = findViewById(R.id.txtName);

        btnBack_2145 = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        txtName_2145.setText( bundle.getString("Name"));
        txtUsername_2145.setText( bundle.getString("Username"));
        txtPhone_2145.setText( bundle.getString("Phone"));
        txtEmail_2145.setText( bundle.getString("Email"));

        btnBack_2145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}