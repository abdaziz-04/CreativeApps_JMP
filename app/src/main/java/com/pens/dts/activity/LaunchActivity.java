package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pens.dts.R;

public class LaunchActivity extends AppCompatActivity {

    Button btnLogin, btnRegister1;
    TextView tvsudahpunyaakun, tvblmpunyaakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

//        Tombol
        btnLogin = findViewById(R.id.btn_login);
        btnRegister1 = findViewById(R.id.btn_register1);

//        Teks
        tvblmpunyaakun = findViewById(R.id.tv_blmpnyakun);
        tvsudahpunyaakun = findViewById(R.id.tv_sudahpunyaakun);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                Log.d("LoginActivity", "Text Login bisa cuy");
            }
        });

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RegisterActivity", "Register bisa juga cuy");
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}