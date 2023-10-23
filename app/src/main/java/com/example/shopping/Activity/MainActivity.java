package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.shopping.Adapter.PopularListAdapter;
import com.example.shopping.Domain.PopularDomain;
import com.example.shopping.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initRecyclerview();
       bottom_navigation();
       
    }

    private void bottom_navigation() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity.class)));
        cartBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("MacBook Pro 13 M2 chip","With M2 Pro and M2 Max, MacBook Pro is capable of transforming pro workflows across a wide range of disciplines, from art to science to app development. Users looking to upgrade from Intel-based Mac models will experience even more dramatic improvements in performance, battery life, connectivity, and overall productivity. MacBook Pro also maintains performance whether users are plugged in or on battery.","pic1",15,4,500));
        items.add(new PopularDomain("Ps-5 Digital","With M2 Pro and M2 Max, MacBook Pro is capable of transforming pro workflows across a wide range of disciplines, from art to science to app development. Users looking to upgrade from Intel-based Mac models will experience even more dramatic improvements in performance, battery life, connectivity, and overall productivity. MacBook Pro also maintains performance whether users are plugged in or on battery.","pic2",10,4.5,450));
        items.add(new PopularDomain("Iphone 14","With M2 Pro and M2 Max, MacBook Pro is capable of transforming pro workflows across a wide range of disciplines, from art to science to app development. Users looking to upgrade from Intel-based Mac models will experience even more dramatic improvements in performance, battery life, connectivity, and overall productivity. MacBook Pro also maintains performance whether users are plugged in or on battery.","pic3",13,4.2,800));

        recyclerViewPopular=findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular=new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}