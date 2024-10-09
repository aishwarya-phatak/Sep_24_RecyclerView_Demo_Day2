package com.bitcode.sep_24_recyclerview_demo_day2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    ArrayList<Product> productArrayList;
    TextView txtTitle, txtPrice;
    ImageView imgView;

    public ProductsAdapter(ArrayList<Product> products){
        this.productArrayList = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        Product product;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
       View productView= layoutInflater.inflate(R.layout.product_view_holder,null);

       txtTitle = productView.findViewById(R.id.txtTitle);
       txtPrice = productView.findViewById(R.id.txtPrice);
       imgView = productView.findViewById(R.id.imgView);

        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
          Product productToBeBound = productArrayList.get(position);

          txtTitle = holder.itemView.findViewById(R.id.txtTitle);
          txtPrice = holder.itemView.findViewById(R.id.txtPrice);
          imgView = holder.itemView.findViewById(R.id.imgView);

          txtTitle.setText("" + productToBeBound.productTitle);
          txtPrice.setText("" + productToBeBound.productPrice);
          imgView.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }
}