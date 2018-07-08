package com.example.snagapp.home;

import com.example.snagapp.base.BasePresenter;
import com.example.snagapp.data.to.Film;

import java.util.List;

public interface HomeContract {

    interface View {
        void showFilms(List<Film> films);
        void showError(String error);
        void showLoading(boolean isShowing);
    }

    interface Presenter extends BasePresenter<View> {
        void getFilms();
    }
}
