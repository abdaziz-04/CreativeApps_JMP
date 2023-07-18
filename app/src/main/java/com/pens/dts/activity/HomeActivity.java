package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pens.dts.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCalculator, btnImplicit, btnExplicit, btnSubmit, btnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCalculator = findViewById(R.id.btn_calculator);
        btnImplicit = findViewById(R.id.btn_implicit);
        btnExplicit = findViewById(R.id.btn_explicit);
        btnSubmit = findViewById(R.id.btn_submit2);
        btnListView = findViewById(R.id.btn_ListView);

        btnCalculator.setOnClickListener(this);
        btnImplicit.setOnClickListener(this);
        btnExplicit.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
        btnListView.setOnClickListener(this);
    }

    public void clickCalculator(View view) {
    }

    public void clickImplicit(View view) {
    }

    public void clickExplicit(View view) {
    }

    public void clickSubmit(View view) {
    }

    public void clickListView(View view) {
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_calculator) {
            Intent newIntent = new Intent(this, CalculatorActivity.class);
            startActivity(newIntent);
        } else if (view.getId() == R.id.btn_implicit) {
            Intent intentImplicit = new Intent(this, ImplicitActivity.class);
            startActivity(intentImplicit);
        } else if (view.getId() == R.id.btn_explicit) {
            Intent intentExplicit = new Intent(this, ExplicitActivity.class);
            startActivity(intentExplicit);
        } else if (view.getId() == R.id.btn_submit2) {
            Intent intentSubmit = new Intent(this, CalculatorActivity.class);
            startActivity(intentSubmit);
        } else if (view.getId() == R.id.btn_ListView) {
            Intent intentListView = new Intent(this,ListViewActivity.class);
            startActivity(intentListView);
        }
    }

}