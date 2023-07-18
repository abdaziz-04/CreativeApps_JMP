package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.pens.dts.R;

public class TampilActivity extends AppCompatActivity {
    TextView tvNameOut, tvInstansiOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tvNameOut = findViewById(R.id.tv_nameOutput);
        tvInstansiOut = findViewById(R.id.tv_institusiOutput);

            String name = getIntent().getStringExtra(ExplicitActivity.KEY_NAME);
            String instansi = getIntent().getStringExtra(ExplicitActivity.KEY_INSTANSI);

            tvNameOut.setText(name);
            tvInstansiOut.setText(instansi);
    }
}
