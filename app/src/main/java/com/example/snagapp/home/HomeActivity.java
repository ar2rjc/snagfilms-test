package com.example.snagapp.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.snagapp.R;
import com.example.snagapp.data.to.Film;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private static final int COL_SPAN_COUNT = 3;

    @BindView(R.id.filmRecycler)
    RecyclerView filmRecycler;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private HomePresenter homePresenter;
    private FilmsAdapter filmsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        homePresenter = new HomePresenter();
        homePresenter.init(this);
        initFilmsRecycler();
    }

    @Override
    protected void onStart() {
        super.onStart();
        homePresenter.getFilms();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.tearDown();
        homePresenter = null;
    }

    @Override
    public void showFilms(List<Film> films) {
        filmsAdapter.updateDataSet(films);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading(boolean isShowing) {
        progressBar.setVisibility(isShowing ? View.VISIBLE : View.GONE);
    }

    private void initFilmsRecycler() {
        filmsAdapter = new FilmsAdapter();
        filmRecycler.setAdapter(filmsAdapter);
        filmRecycler.setLayoutManager(new GridLayoutManager(this, COL_SPAN_COUNT));
    }
}
