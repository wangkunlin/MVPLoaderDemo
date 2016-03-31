package com.wkl.loadermvp.presenter.factory;

import com.wkl.loadermvp.presenter.Presenter;

/**
 * PresenterFactory.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public interface PresenterFactory<T extends Presenter> {

    T create();
}
