package com.example.s_shop.ultil;

import android.util.Base64;
import android.util.Log;

import com.example.s_shop.model.DataToken;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

public class JWTUtils {

    public static DataToken decoded(String JWTEncoded){
        try {
            String[] split = JWTEncoded.split("\\.");
            Log.d(TAG.toString, "Header: " + getJson(split[0]));
            Log.d(TAG.toString, "Body: " + getJson(split[1]));
            Gson gson = new Gson();
            DataToken dataToken = gson.fromJson(getJson(split[1]), DataToken.class);
            return dataToken;
        } catch (UnsupportedEncodingException e) {
            return new DataToken();
        }
    }

    private static String getJson(String strEncoded) throws UnsupportedEncodingException{
        byte[] decodedBytes = Base64.decode(strEncoded, Base64.URL_SAFE);
        return new String(decodedBytes, "UTF-8");
    }
}