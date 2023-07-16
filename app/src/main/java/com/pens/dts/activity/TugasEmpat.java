package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.pens.dts.R;

public class TugasEmpat extends AppCompatActivity {
    TextView tvHasil;
    EditText edInputNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_empat);

        tvHasil = findViewById(R.id.tv_hasil);
        edInputNama = findViewById((R.id.ed_inputNama));
    }

    public void postSubmit(View view) {
        String name = edInputNama.getText().toString();
        tvHasil.setText(name);
    }
}