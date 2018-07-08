package com.example.snagapp.data;

import android.support.annotation.Nullable;

import com.example.snagapp.base.BaseAPIListener;
import com.example.snagapp.data.to.Film;
import com.example.snagapp.data.to.SnagResponse;
import com.example.snagapp.util.RetrofitFactory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SnagService {

    private static volatile SnagService INSTANCE;

    private SnagAPI snagAPI;

    private SnagService() {
        initSnagAPI();
    }

    public static synchronized SnagService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SnagService();
        }
        return INSTANCE;
    }

    public void getFilms(@Nullable Integer limit, final OnFilmsListener callback) {
        int count = limit == null ? 10 : limit;
        snagAPI.getFilms(count).enqueue(new Callback<SnagResponse>() {
            @Override
            public void onResponse(Call<SnagResponse> call, Response<SnagResponse> response) {
                if (response.isSuccessful()) {
                    SnagResponse res = response.body();
                    if (res != null) {
                        List<Film> films = response.body().getFilms().getFilm();
                        callback.onFilmsReady(films);
                    } else {
                        callback.onFilmsError("No films available");
                    }
                } else {
                    callback.onFilmsError(handleError(response.code()));
                }
            }

            @Override
            public void onFailure(Call<SnagResponse> call, Throwable t) {
                callback.onNetworkError(t.getMessage());
            }
        });
    }

    private void initSnagAPI() {
        snagAPI = RetrofitFactory.getAPIClient(SnagAPI.API_TYPE).create(SnagAPI.class);
    }

    private String handleError(int apiHttpErrorCode) {
        // TODO - Handle errors from Error wrapper class that loads error messages from strings.xml
        return "ERROR " + apiHttpErrorCode;
    }

    public interface OnFilmsListener extends BaseAPIListener {
        void onFilmsReady(List<Film> films);

        void onFilmsError(String error);
    }
}
