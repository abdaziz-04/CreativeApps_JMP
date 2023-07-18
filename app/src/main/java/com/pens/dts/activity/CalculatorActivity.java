package com.pens.dts.activity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pens.dts.R;

public class CalculatorActivity extends AppCompatActivity {
    EditText EdtNm1, EdtNm2;
    Button btnADD;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EdtNm1 = findViewById(R.id.tv_ednm1);
        EdtNm2 = findViewById(R.id.tv_ednm2);
        btnADD = findViewById(R.id.btn_add);
        result = findViewById(R.id.tv_hasiltambah);

        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1 = Double.parseDouble(EdtNm1.getText().toString());
                Double v2 = Double.parseDouble(EdtNm2.getText().toString());

                Intent CalcIntent = new Intent(this, CalcResultActivity.class);
                Bundle myData = new Bundle();

                myData.putDouble("Num1",v1);
                myData.putDouble("Num2",v2);

                CalcIntent.putExtra("Data", myData);
                StartActivityForResult(CalcIntent, 101);

            }
        });

    }

}