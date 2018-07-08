package com.example.snagapp.data;

import android.support.annotation.Nullable;

import com.example.snagapp.base.BaseAPIListener;
import com.example.snagapp.data.to.Film;
import com.example.snagapp.data.to.SnagResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SnagService {

    private static volatile SnagService INSTANCE;

    private SnagAPI snagAPI;
    private OnFilmsListener listener;

    private SnagService() {

    }

    public static synchronized SnagService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SnagService();
        }
        return INSTANCE;
    }

    public void setOnFilmsListener(OnFilmsListener listener) {
        this.listener = listener;
    }

    private void unsetFilmListener() {
        this.listener = null;
    }

    public void getFilms(@Nullable Integer limit) {
        int count = limit == null ? 10 : limit;
        snagAPI.getFilms(count).enqueue(new Callback<SnagResponse>() {
            @Override
            public void onResponse(Call<SnagResponse> call, Response<SnagResponse> response) {
                if(response.isSuccessful()) {
                    List<Film> films = response.body().getFilms().getFilm();
                } else {
                    listener.onFilmsError();
                }
            }

            @Override
            public void onFailure(Call<SnagResponse> call, Throwable t) {
                listener.onNetworkError(t.getMessage());
            }
        });
    }

    public interface OnFilmsListener extends BaseAPIListener {
        void onFilmsReady(List<Film> films);
        void onFilmsError();
    }
}
