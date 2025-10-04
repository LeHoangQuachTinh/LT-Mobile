package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginScreen extends AppCompatActivity {

    Button btnLogin_2145;
    EditText edtUserName_2145,edtPassword_2145;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_screen);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnLogin_2145 = findViewById(R.id.button_2145);
        edtUserName_2145 = findViewById(R.id.editTextTextEmailAddress_2145);
        edtPassword_2145 = findViewById(R.id.editTextTextPassword2_2145);

        btnLogin_2145.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, ProfileScreen.class);
                intent.putExtra("Username",edtUserName_2145.getText().toString());
                intent.putExtra("Password",edtPassword_2145.getText().toString());
                startActivity(intent);
            }
        });



    }

}