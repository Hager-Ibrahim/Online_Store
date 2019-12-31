package com.example.onlinestore.model.home.Item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("RefNumber")
    @Expose
    private String refNumber;
    @SerializedName("ArabicName")
    @Expose
    private String arabicName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;
    @SerializedName("DescAR")
    @Expose
    private Object descAR;
    @SerializedName("DescEN")
    @Expose
    private Object descEN;
    @SerializedName("ArabicDetails")
    @Expose
    private String arabicDetails;
    @SerializedName("EnglishDetails")
    @Expose
    private Object englishDetails;
    @SerializedName("CategoryImage")
    @Expose
    private String categoryImage;
    @SerializedName("CategoryVideo")
    @Expose
    private String categoryVideo;
    @SerializedName("ItemCode")
    @Expose
    private String itemCode;
    @SerializedName("IsNewItem")
    @Expose
    private Boolean isNewItem;
    @SerializedName("UnitPrice")
    @Expose
    private Integer unitPrice;
    @SerializedName("ReviewStars")
    @Expose
    private Integer reviewStars;
    @SerializedName("IsPromotion")
    @Expose
    private Boolean isPromotion;
    @SerializedName("ItemOrder")
    @Expose
    private Integer itemOrder;
    @SerializedName("PromotionUnitPrice")
    @Expose
    private Integer promotionUnitPrice;
    @SerializedName("RecieveDetails")
    @Expose
    private List<Object> recieveDetails = null;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("CategoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("CategoryArabicName")
    @Expose
    private String categoryArabicName;
    @SerializedName("CategoryEnglishName")
    @Expose
    private String categoryEnglishName;
    @SerializedName("BrandId")
    @Expose
    private Integer brandId;
    @SerializedName("BrandArabicName")
    @Expose
    private String brandArabicName;
    @SerializedName("BrandEnglishName")
    @Expose
    private String brandEnglishName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
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

    public Object getDescAR() {
        return descAR;
    }

    public void setDescAR(Object descAR) {
        this.descAR = descAR;
    }

    public Object getDescEN() {
        return descEN;
    }

    public void setDescEN(Object descEN) {
        this.descEN = descEN;
    }

    public String getArabicDetails() {
        return arabicDetails;
    }

    public void setArabicDetails(String arabicDetails) {
        this.arabicDetails = arabicDetails;
    }

    public Object getEnglishDetails() {
        return englishDetails;
    }

    public void setEnglishDetails(Object englishDetails) {
        this.englishDetails = englishDetails;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getCategoryVideo() {
        return categoryVideo;
    }

    public void setCategoryVideo(String categoryVideo) {
        this.categoryVideo = categoryVideo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(Boolean isNewItem) {
        this.isNewItem = isNewItem;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getReviewStars() {
        return reviewStars;
    }

    public void setReviewStars(Integer reviewStars) {
        this.reviewStars = reviewStars;
    }

    public Boolean getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public Integer getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }

    public Integer getPromotionUnitPrice() {
        return promotionUnitPrice;
    }

    public void setPromotionUnitPrice(Integer promotionUnitPrice) {
        this.promotionUnitPrice = promotionUnitPrice;
    }

    public List<Object> getRecieveDetails() {
        return recieveDetails;
    }

    public void setRecieveDetails(List<Object> recieveDetails) {
        this.recieveDetails = recieveDetails;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryArabicName() {
        return categoryArabicName;
    }

    public void setCategoryArabicName(String categoryArabicName) {
        this.categoryArabicName = categoryArabicName;
    }

    public String getCategoryEnglishName() {
        return categoryEnglishName;
    }

    public void setCategoryEnglishName(String categoryEnglishName) {
        this.categoryEnglishName = categoryEnglishName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandArabicName() {
        return brandArabicName;
    }

    public void setBrandArabicName(String brandArabicName) {
        this.brandArabicName = brandArabicName;
    }

    public String getBrandEnglishName() {
        return brandEnglishName;
    }

    public void setBrandEnglishName(String brandEnglishName) {
        this.brandEnglishName = brandEnglishName;
    }


}
