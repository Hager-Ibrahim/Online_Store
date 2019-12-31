package com.example.onlinestore.model.home.Item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemList {



    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("ItemList")
    @Expose
    private List<Item> itemList = null;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

}
