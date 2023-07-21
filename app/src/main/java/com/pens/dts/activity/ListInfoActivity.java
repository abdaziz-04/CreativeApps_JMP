package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pens.dts.R;

public class ListInfoActivity extends AppCompatActivity {
    TextView tvNegara, tvIbukota, tvPosisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_info);

        Intent myIntent = getIntent();
        Bundle myBundle = myIntent.getBundleExtra("Bundle");

        tvNegara = findViewById(R.id.tvNegara);
        tvIbukota = findViewById(R.id.tvIbukota);
        tvPosisi = findViewById(R.id.tvPosisi);


        tvNegara.setText(myBundle.getString("Negara"));
        tvIbukota.setText(myBundle.getString("IbuKota"));
        tvPosisi.setText("Posisi : " + myBundle.getInt("Posisi"));
    }
}