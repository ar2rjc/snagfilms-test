package com.example.snagapp.home;

import com.example.snagapp.data.SnagService;
import com.example.snagapp.data.to.Film;

import java.util.List;

// TODO - Generate a unit test for this presenter
public class HomePresenter implements HomeContract.Presenter {

    private final SnagService snagService;
    private HomeContract.View homeView;

    HomePresenter() {
        snagService = SnagService.getInstance();
    }

    @Override
    public void init(HomeContract.View view) {
        homeView = view;
    }

    @Override
    public void getFilms() {
        homeView.showLoading(true);
        // TODO - Add a settings activity or offer user input for the count of films to get
        snagService.getFilms(null, new SnagService.OnFilmsListener() {
            @Override
            public void onFilmsReady(List<Film> films) {
                homeView.showFilms(films);
                hideLoading();
            }

            @Override
            public void onFilmsError(String error) {
                homeView.showError(error);
                hideLoading();
            }

            @Override
            public void onNetworkError(String error) {
                homeView.showError(error);
                hideLoading();
            }
        });
    }

    private void hideLoading() {
        homeView.showLoading(false);
    }

    @Override
    public void tearDown() {
        homeView = null;
    }
}
