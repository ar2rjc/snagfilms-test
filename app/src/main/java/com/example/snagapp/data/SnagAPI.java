package com.example.snagapp.data;

import com.example.snagapp.data.to.SnagResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SnagAPI {
    String API_TYPE = "SnagFilmsAPI";
    String BASE_URL = "http://www.snagfilms.com/apis/";

    @GET("films.json")
    Call<SnagResponse> getFilms(@Query("limit") int limit);
}
