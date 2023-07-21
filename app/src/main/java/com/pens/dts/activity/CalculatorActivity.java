package com.pens.dts.activity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pens.dts.R;

import java.text.CollationElementIterator;

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
            public void onClick(View v) {
                Double v1 = Double.parseDouble(EdtNm1.getText().toString());
                Double v2 = Double.parseDouble(EdtNm2.getText().toString());

                Intent myCalcIntent = new Intent(CalculatorActivity.this,CalcResultActivity.class);
                Bundle myData = new Bundle();

                myData.putDouble("Num1",v1);
                myData.putDouble("Num2",v2);

                myCalcIntent.putExtra("Data",myData);


                startActivityForResult(myCalcIntent,101);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        CollationElementIterator tvResult;
        try{

            if((requestCode==101) &&(resultCode== Activity.RESULT_OK))
            {
                Bundle myResult = data.getBundleExtra("Result");
                Double vResult = myResult.getDouble("Result");
                result.setText("Sum is : " + vResult.toString());
            }

        }
        catch (Exception e)
        {
            result.setText("Something Wrong : " + requestCode);
        }
    }
}