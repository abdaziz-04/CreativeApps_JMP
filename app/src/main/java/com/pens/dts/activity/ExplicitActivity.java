package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pens.dts.R;

public class ExplicitActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edInputNama, edInputInstansi;
    Button btnData, btnTanpaData;

    public static final String KEY_NAME = "name";
    public static final String KEY_INSTANSI = "instansi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        btnData = findViewById(R.id.btn_data);
        btnTanpaData = findViewById(R.id.btn_nodata);
        edInputNama = findViewById(R.id.ed_inputNama); // Inisialisasi EditText inputNama
        edInputInstansi = findViewById(R.id.ed_inputInstansi); // Inisialisasi EditText inputInstansi

        btnData.setOnClickListener(this);
        btnTanpaData.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.btn_data) {
            postData();
        } else if (viewId == R.id.btn_nodata) {
            postTanpaData();
        }

    }


    public void postData() {
        String name = edInputNama.getText().toString().trim();
        String instansi = edInputInstansi.getText().toString().trim();

        Intent moveIntentWithData = new Intent(this, TampilActivity.class);

        moveIntentWithData.putExtra(KEY_NAME, name);
        moveIntentWithData.putExtra(KEY_INSTANSI, instansi);

        startActivity(moveIntentWithData);
    }


    public void postTanpaData() {
        Intent newIntent = new Intent(this, TampilActivity.class);
        startActivity(newIntent);
    }

}