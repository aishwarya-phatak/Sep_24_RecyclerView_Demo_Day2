package com.bitcode.sep_24_recyclerview_demo_day2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ProductsAdapter productsAdapter;
    RecyclerView productsRecyclerView;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArray();
        initViews();
    }

    private void initViews(){
        productsRecyclerView = findViewById(R.id.productRecyclerView);
        productsAdapter = new ProductsAdapter(products);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false));
        productsRecyclerView.setAdapter(productsAdapter);
    }

    private void initArray(){
        products = new ArrayList<Product>();
        for (int i = 0;i<5;i++) {
            products.add(new Product(
                    i + 100,
                    "product " + i,
                    "" + i + 1000 * 5,
                    R.drawable.ic_launcher_background
            ));
        }
    }
}