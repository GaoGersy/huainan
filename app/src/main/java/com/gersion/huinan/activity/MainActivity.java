package com.gersion.huinan.activity;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.gersion.huinan.R;
import com.gersion.huinan.base.BaseActivity;
import com.gersion.huinan.fragment.GuanLiFragment;
import com.gersion.huinan.view.TitleView;

public class MainActivity extends BaseActivity {

    private TitleView mTitleView;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mTitleView = findView(R.id.titleView);
        mTitleView.setTitleText("惯例库");
        mTitleView.setBackVisiable(false);
    }

    @Override
    protected void initData() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl_container,new GuanLiFragment());
        fragmentTransaction.commit();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        OkGo.getInstance().cancelTag(this);
    }
}
