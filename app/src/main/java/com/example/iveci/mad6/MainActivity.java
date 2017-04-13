package com.example.iveci.mad6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> ldata = new ArrayList<>();
    ArrayAdapter<String> adapter;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.edtoadd);
        setListView();
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String sr = s.toString();
                if(sr.length() > 0) lv.setFilterText(sr);
                else lv.clearTextFilter();
            }
        });
    }

    public void onClick(View v){
        adapter.insert(e1.getText().toString(),ldata.size());
        Comparator<String> dataAsc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);//Ascending order.
                // Change values each other to change order.
            }
        };
        Collections.sort(ldata,dataAsc);
        adapter.notifyDataSetChanged();
        Toast.makeText(getApplicationContext(),"Data added. Check now.",Toast.LENGTH_SHORT).show();
    }

    public void setListView(){
        lv = (ListView) findViewById(R.id.listv);
        ldata.add("Apple");
        ldata.add("Orange");
        ldata.add("Grape");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice,ldata);
        lv.setChoiceMode(lv.CHOICE_MODE_SINGLE);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return true;
            }
        });

    }
}
