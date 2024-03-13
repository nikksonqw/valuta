package com.example.valuta;

import android.os.Bundle;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();


        list.add(new DataFlags(R.drawable.kz, R.string.kaz, R.string.kazKZT, R.string.astana));
        list.add(new DataFlags(R.drawable.in, R.string.indian, R.string.indianINR, R.string.new_deli));
        list.add(new DataFlags(R.drawable.ma, R.string.moroccan, R.string.moroccanMAD, R.string.rabat));
        list.add(new DataFlags(R.drawable.kr, R.string.korean, R.string.koreaKRW, R.string.seoul));


        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }}


