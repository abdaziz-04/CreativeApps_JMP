package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.pens.dts.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView lvItem;
    private  String[] namanegara = new String[] {
            "Indonesia", "Thailand", "Malaysia",
            "Vietnam", "Jepang", "China",
            "Kamboja", "Rusia",
            "Palestina", "Arab Saudi"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namanegara);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "Memilih: " + namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }

    public void inItemClick(AdapterView<?> parent, View view, int position) {

    }
}