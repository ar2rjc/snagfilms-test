package com.example.snagapp.base;

public interface BasePresenter<T> {
    void init(T view);
    void tearDown();
}
