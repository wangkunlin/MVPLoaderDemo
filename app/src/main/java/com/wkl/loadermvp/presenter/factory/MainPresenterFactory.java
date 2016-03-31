package com.wkl.loadermvp.presenter.factory;

import com.wkl.loadermvp.presenter.MainPresenter;

/**
 * MainPresenterFactory.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public class MainPresenterFactory implements PresenterFactory<MainPresenter> {
    @Override
    public MainPresenter create() {
        return new MainPresenter();
    }
}
