package com.example.onlinestore.ui.splash;

import android.content.Context;

import com.example.onlinestore.model.home.token.Token;
import com.example.onlinestore.retrofit.ApiClient;
import com.example.onlinestore.retrofit.ApiInterface;
import com.example.onlinestore.utils.AppPreferences;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashPresenter {

    public void getToken(final Context context){

        String username = "TopTato";
        String password = "T0pT@T0.P@$$";
        String grant_type = "password";
        String deviceName = "AndroidTrainer";

        ApiClient.getClient().create(ApiInterface.class).getToken(username,password,grant_type,deviceName)
                .enqueue(new Callback<Token>() {
                    @Override
                    public void onResponse(Call<Token> call, Response<Token> response) {
                        if(response.isSuccessful()){
                            String token = response.body().getAccessToken();
                            AppPreferences.open(context).saveToken(token);
                        }
                    }

                    @Override
                    public void onFailure(Call<Token> call, Throwable t) {

                    }
                });
    }
}
