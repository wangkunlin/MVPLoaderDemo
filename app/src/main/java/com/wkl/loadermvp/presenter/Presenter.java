package com.wkl.loadermvp.presenter;

import com.wkl.loadermvp.view.IView;

/**
 * Presenter.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public interface Presenter<V extends IView> {
    void onViewAttached(V view);
    void onViewDetached();
    void onDestroyed();
}
