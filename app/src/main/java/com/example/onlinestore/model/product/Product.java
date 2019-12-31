package com.example.onlinestore.model.product;

public class Product {

    private String productImage;

    public Product(String productImage) {
        this.productImage = productImage;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
