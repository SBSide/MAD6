package com.example.iveci.mad6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Rest> data = new ArrayList<>();
    ListView lv;
    EditText e1,e2;
    RestAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = (EditText) findViewById(R.id.edtoadd2);
        e2 = (EditText) findViewById(R.id.edtotel);
        setListView();
    }

    public void onClick(View v){
        if (v.getId() == R.id.bstname){
            adapter.setNameAscSort();
        }
        else if (v.getId() == R.id.baddit2){
            data.add(new Rest(e1.getText().toString(),e2.getText().toString(),0));
            adapter.notifyDataSetChanged();
        }
    }

    public void setListView(){
        lv = (ListView) findViewById(R.id.listv2);
        data.add(new Rest("Rest","0103150",2));
        adapter = new RestAdapter(this,data);
        lv.setAdapter(adapter);
    }

}
