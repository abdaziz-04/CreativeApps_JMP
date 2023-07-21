package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.pens.dts.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView lvItem;
    private  String[] namaNegara = new String[] {
            "Indonesia", "Rusia",
            "Palestina", "Arab Saudi"
    };

    private String[] ibuKota = new String[] {
      "Jakarta", "Moskow","Yerussalem","Riyadh"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namaNegara);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent myActivityInfo = new Intent(getApplicationContext(),
                        ListInfoActivity.class);
                Bundle myBundle = new Bundle();
                myBundle.putString("Negara",namaNegara[position]);
                myBundle.putString("IbuKota",ibuKota[position]);
                myBundle.putInt("Posisi",position + 1);

                myActivityInfo.putExtra("Bundle",myBundle);

                startActivity(myActivityInfo);
            }
    });
}}