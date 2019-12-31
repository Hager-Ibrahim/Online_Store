package com.example.onlinestore.retrofit;

import com.example.onlinestore.model.home.Item.ItemList;
import com.example.onlinestore.model.home.token.Token;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

import static com.example.onlinestore.utils.Constants.HEADER_AUTHORIZATION;
import static com.example.onlinestore.utils.Constants.METHOD_GET_BEST_OFFERS;
import static com.example.onlinestore.utils.Constants.METHOD_GET_TOKEN;

public interface ApiInterface {


    @POST(METHOD_GET_TOKEN)
    @FormUrlEncoded
    Call<Token> getToken(@Field("username") String userName , @Field("password") String password , @Field("grant_type") String grantType, @Field("deviceName") String deviceName);


    @GET(METHOD_GET_BEST_OFFERS)
    Call<ItemList> getBestOffers(@Header(HEADER_AUTHORIZATION) String auth);


    @POST("TrainingAPI/FilterItems?categoryId=1041&colorId=&sizeId=&sortBy=")
    Call<ItemList> getCategoriesDetails(@Header(HEADER_AUTHORIZATION) String auth);

}
