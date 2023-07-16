package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pens.dts.R;

public class LoginActivity extends AppCompatActivity {
    TextView tvusername, tvforgotpw, idnanyaakun;
    EditText edusername, edpassword;
    Button btnlogin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin1 = findViewById(R.id.btn_login1);
        edusername = findViewById(R.id.ed_username);
        edpassword = findViewById(R.id.ed_password);

        btnlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}