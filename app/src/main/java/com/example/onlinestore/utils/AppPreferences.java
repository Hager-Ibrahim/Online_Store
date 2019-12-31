package com.example.onlinestore.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferences {


    public static String TOKEN = "token";


    private static net.grandcentrix.tray.AppPreferences pref;
    private static AppPreferences appPreferences ;


    public static synchronized AppPreferences open(Context context){

        if(pref == null){
            pref = new net.grandcentrix.tray.AppPreferences(context);
        }

        if(appPreferences == null){
            appPreferences = new AppPreferences() {};
        }

        return appPreferences;
    }

    public void clearPref() {
        pref.clear();
    }


    public void saveToken(String token){
        pref.put(TOKEN, token);
    }

    public String getToken(){
        return pref.getString(TOKEN , "");
    }

}
