package com.example.onlinestore.ui.Product;

import android.util.Log;

import com.example.onlinestore.model.home.Item.Item;
import com.example.onlinestore.model.home.Item.ItemList;
import com.example.onlinestore.retrofit.ApiClient;
import com.example.onlinestore.retrofit.ApiInterface;
import com.example.onlinestore.utils.AppPreferences;
import com.example.onlinestore.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.onlinestore.utils.Constants.BEARER_TOKEN;

public class ProductPresenter {

    AppPreferences appPreferences;
    ProductInterface productInterface;

    public ProductPresenter( ProductInterface productInterface) {
        this.appPreferences = new AppPreferences();
        this.productInterface = productInterface;
    }


    public void getProductsList(){
        Call<ItemList> productCall = ApiClient.getClient().create(ApiInterface.class)
                .getCategoriesDetails(BEARER_TOKEN +appPreferences.getToken());

        productCall.enqueue(new Callback<ItemList>() {
            @Override
            public void onResponse(Call<ItemList> call, Response<ItemList> response) {

                if(response.isSuccessful()){
                    List<Item> b = response.body().getItemList();
                    productInterface.setProductsListForRecyclerView(b);
                }
                else {
                    productInterface.setFailureMsg(response.message());
                }
            }

            @Override
            public void onFailure(Call<ItemList> call, Throwable t) {
                productInterface.setFailureMsg(t.getMessage());
            }
        });
    }
}
