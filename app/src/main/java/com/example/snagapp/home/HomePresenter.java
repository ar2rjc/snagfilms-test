package com.example.snagapp.home;

import com.example.snagapp.data.SnagService;
import com.example.snagapp.data.to.Film;

import java.util.List;

public class HomePresenter implements HomeContract.Presenter {

    private final SnagService snagService;
    private HomeContract.View homeView;

    public HomePresenter() {
        snagService = SnagService.getInstance();
    }

    @Override
    public void init(HomeContract.View view) {
        homeView = view;
    }

    @Override
    public void getFilms() {
        snagService.getFilms(null, new SnagService.OnFilmsListener() {
            @Override
            public void onFilmsReady(List<Film> films) {
                homeView.showFilms(films);
            }

            @Override
            public void onFilmsError(String error) {
                homeView.showError(error);
            }

            @Override
            public void onNetworkError(String error) {
                homeView.showError(error);
            }
        });
    }

    @Override
    public void tearDown() {
        homeView = null;
    }
}
