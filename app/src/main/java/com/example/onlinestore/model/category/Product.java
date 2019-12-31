package com.example.onlinestore.model.category;

import android.graphics.drawable.Drawable;

public class Product {

    private Drawable productImage;
    private String productName;

    public Product(Drawable productImage, String productName) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public Drawable getProductImage() {
        return productImage;
    }

    public void setProductImage(Drawable productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
