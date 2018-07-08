package com.example.snagapp.util;

import com.example.snagapp.data.SnagAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {

    public static Retrofit getAPIClient(String type) {
        switch (type) {
            case SnagAPI.API_TYPE:
                return new Retrofit.Builder()
                .baseUrl(SnagAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            default:
                throw new UnsupportedOperationException("Unknown API client: " + type);
        }
    }
}
