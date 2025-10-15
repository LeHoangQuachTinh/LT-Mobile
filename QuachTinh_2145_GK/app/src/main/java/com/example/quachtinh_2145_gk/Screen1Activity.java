package com.example.quachtinh_2145_gk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Screen1Activity extends AppCompatActivity {

    EditText edtUsername_2145, edtPass_2145, edtPhone_2145, edtEmail_2145, edtName_2145;
    Button btnRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen1);

        edtUsername_2145 = findViewById(R.id.edtUsername);
        edtPass_2145 = findViewById(R.id.edtPass);
        edtPhone_2145 = findViewById(R.id.edtPhone);
        edtEmail_2145 = findViewById(R.id.edtEmail);
        edtName_2145 = findViewById(R.id.edtName);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtPass_2145.getText().toString().isEmpty()
                        || edtName_2145.getText().toString().isEmpty()
                        || edtUsername_2145.getText().toString().isEmpty()
                        || edtPhone_2145.getText().toString().isEmpty()
                        || edtEmail_2145.getText().toString().isEmpty()) {

                    Toast.makeText(Screen1Activity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show(); // ✅ có show()
                } else {
                    Intent intent = new Intent(Screen1Activity.this, Screen2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Username", edtUsername_2145.getText().toString());
                    bundle.putString("Pass", edtPass_2145.getText().toString());
                    bundle.putString("Phone", edtPhone_2145.getText().toString());
                    bundle.putString("Email", edtEmail_2145.getText().toString());
                    bundle.putString("Name", edtName_2145.getText().toString());

                    intent.putExtra("bundle", bundle);
                    startActivity(intent);
                }
            }
        });
    }
}
