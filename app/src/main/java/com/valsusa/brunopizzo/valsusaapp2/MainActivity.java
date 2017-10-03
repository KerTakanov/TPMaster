package com.valsusa.brunopizzo.valsusaapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayListS = new ArrayList<>();
        arrayListS.add("wtf");
        ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayListS);
        lv.setAdapter(myarrayAdapter);
        lv.setTextFilterEnabled(true);
    }
}
