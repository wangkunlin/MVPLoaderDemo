package com.wkl.loadermvp.view;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;

import com.wkl.loadermvp.loader.PresenterLoader;
import com.wkl.loadermvp.presenter.Presenter;
import com.wkl.loadermvp.presenter.factory.PresenterFactory;

public abstract class BaseActivity<P extends Presenter, F extends PresenterFactory>
        extends AppCompatActivity implements IView, LoaderManager.LoaderCallbacks<P> {

    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportLoaderManager().initLoader(1, null, this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void onStart() {
        super.onStart();
        presenter.onViewAttached(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onViewDetached();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Loader<P> onCreateLoader(int id, Bundle args) {
        return new PresenterLoader<>(this, createPresenterFactory());
    }

    public abstract F createPresenterFactory();

    @Override
    public void onLoadFinished(Loader<P> loader, P data) {
        this.presenter = data;
    }

    @Override
    public void onLoaderReset(Loader<P> loader) {
        presenter = null;
    }
}
