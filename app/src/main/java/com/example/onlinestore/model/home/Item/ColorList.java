package com.example.onlinestore.model.home.Item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorList {

    @SerializedName("ColorId")
    @Expose
    private Integer colorId;
    @SerializedName("ArabicName")
    @Expose
    private String arabicName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
