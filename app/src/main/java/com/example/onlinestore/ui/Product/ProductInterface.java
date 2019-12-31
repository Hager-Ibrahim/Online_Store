package com.example.onlinestore.ui.Product;

import com.example.onlinestore.model.home.Item.Item;

import java.util.List;

public interface ProductInterface {

    void setProductsListForRecyclerView(List<Item> itemLists);

    void setFailureMsg(String failureMsg);
}
