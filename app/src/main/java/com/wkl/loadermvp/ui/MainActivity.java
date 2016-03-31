package com.wkl.loadermvp.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.wkl.loadermvp.R;
import com.wkl.loadermvp.presenter.IMainPresenter;
import com.wkl.loadermvp.presenter.factory.MainPresenterFactory;
import com.wkl.loadermvp.presenter.factory.PresenterFactory;
import com.wkl.loadermvp.view.BaseActivity;
import com.wkl.loadermvp.view.MainView;

/**
 * MainActivity.java
 * Author: wangkunlin
 * Date: 2016-03-29
 * Email: 1040057694@qq.com
 */
public class MainActivity extends BaseActivity<IMainPresenter, PresenterFactory> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.showToast();
            }
        });
    }

    @Override
    public PresenterFactory createPresenterFactory() {
        return new MainPresenterFactory();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "showToast", Toast.LENGTH_SHORT).show();
    }
}
