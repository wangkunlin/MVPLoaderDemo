package com.wkl.loadermvp.presenter;

import com.wkl.loadermvp.view.MainView;

/**
 * IMainPresenter.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public interface IMainPresenter extends Presenter<MainView> {

    void showToast();
}
