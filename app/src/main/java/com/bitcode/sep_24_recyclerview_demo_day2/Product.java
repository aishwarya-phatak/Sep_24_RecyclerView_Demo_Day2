package com.bitcode.sep_24_recyclerview_demo_day2;

import android.media.Image;

import androidx.annotation.NonNull;

import java.io.Serializable;

//model class
public class Product implements Serializable {
    int productId;
    String productTitle;
    String productPrice;
    int productImage;

    public Product(int productId, String productTitle, String productPrice, int productImage) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    @NonNull
    @Override
    public String toString() {
        return " productId " + productId + "productTitle " + productTitle + "productPrice " + productPrice;
    }
}
