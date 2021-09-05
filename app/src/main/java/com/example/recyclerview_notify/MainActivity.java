package com.example.recyclerview_notify;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private ArrayList<Model> dataList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        buildData();
        setDataToRecycler();
    }

    private void setDataToRecycler() {
        Adapter adapter = new Adapter(this, dataList);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void buildData() {
        dataList.add(new Model("Books"));
        dataList.add(new Model("Podcasts"));
        dataList.add(new Model("News"));
        dataList.add(new Model("Business"));
        dataList.add(new Model("Entertainment"));
        dataList.add(new Model("Sports"));
        dataList.add(new Model("Technology"));
        dataList.add(new Model("Pronunciation"));
        dataList.add(new Model("Grammar"));
        dataList.add(new Model("Health"));
        dataList.add(new Model("Books"));
        dataList.add(new Model("Books"));
        dataList.add(new Model("Books"));
        dataList.add(new Model("Podcasts"));
        dataList.add(new Model("News"));
        dataList.add(new Model("Business"));
        dataList.add(new Model("Entertainment"));
        dataList.add(new Model("Sports"));
        dataList.add(new Model("Technology"));
        dataList.add(new Model("Pronunciation"));
        dataList.add(new Model("Grammar"));
        dataList.add(new Model("Health"));
        dataList.add(new Model("Books"));
        dataList.add(new Model("Books"));
    }


    @Override
    public void onItemClicked(TextView textView, LinearLayout linearLayout, int position, boolean isUnTouched) {
//        if (isUnTouched) {
//            textView.setTextColor(Color.parseColor("#ffffff"));
//            linearLayout.setBackgroundColor(Color.parseColor("#0099cc"));
//            isUnTouched = false;
//        } else {
//            textView.setTextColor(Color.parseColor("#0099cc"));
//            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
//            isUnTouched = true;
//        }
    }
}