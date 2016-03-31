package com.wkl.loadermvp.loader;

import android.content.Context;
import android.support.v4.content.Loader;

import com.wkl.loadermvp.presenter.Presenter;
import com.wkl.loadermvp.presenter.factory.PresenterFactory;

/**
 * PresenterLoader.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public class PresenterLoader<P extends Presenter> extends Loader<P> {
    /**
     * Stores away the application context associated with context.
     * Since Loaders can be used across multiple activities it's dangerous to
     * store the context directly; always use {@link #getContext()} to retrieve
     * the Loader's Context, don't use the constructor argument directly.
     * The Context returned by {@link #getContext} is safe to use across
     * Activity instances.
     *
     * @param context used to retrieve the application context.
     */
    public PresenterLoader(Context context, PresenterFactory<P> factory) {
        super(context);
        this.factory = factory;
    }

    private P presenter;
    private final PresenterFactory<P> factory;

    @Override
    protected void onStartLoading() {
        if (presenter != null) {
            deliverResult(presenter);
            return;
        }
        forceLoad();
    }

    @Override
    protected void onForceLoad() {
        presenter = factory.create();
        deliverResult(presenter);
    }

    @Override
    protected void onReset() {
        presenter.onDestroyed();
        presenter = null;
    }
}
