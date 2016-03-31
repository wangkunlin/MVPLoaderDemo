package com.wkl.loadermvp.presenter;

import com.wkl.loadermvp.view.MainView;

/**
 * MainPresenter.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public class MainPresenter implements IMainPresenter {

    private MainView view;

    @Override
    public void onViewAttached(MainView view) {
        this.view = view;
    }

    @Override
    public void onViewDetached() {

    }

    @Override
    public void onDestroyed() {

    }

    @Override
    public void showToast() {
        view.showToast();
    }
}
