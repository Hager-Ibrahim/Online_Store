package com.example.onlinestore.model.home.Item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SizeList {

    @SerializedName("SizeId")
    @Expose
    private Integer sizeId;
    @SerializedName("ItemSizeArabicName")
    @Expose
    private String itemSizeArabicName;
    @SerializedName("ItemSizeEnglishName")
    @Expose
    private String itemSizeEnglishName;

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getItemSizeArabicName() {
        return itemSizeArabicName;
    }

    public void setItemSizeArabicName(String itemSizeArabicName) {
        this.itemSizeArabicName = itemSizeArabicName;
    }

    public String getItemSizeEnglishName() {
        return itemSizeEnglishName;
    }

    public void setItemSizeEnglishName(String itemSizeEnglishName) {
        this.itemSizeEnglishName = itemSizeEnglishName;
    }
}
