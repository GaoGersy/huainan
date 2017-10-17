package com.gersion.huinan.activity;

import android.content.Intent;
import android.view.View;

import com.gersion.huinan.R;
import com.gersion.huinan.base.BaseActivity;
import com.gersion.huinan.bean.Bean;
import com.gersion.huinan.view.RefreshWebView;
import com.gersion.huinan.view.TitleView;

public class DetailActivity extends BaseActivity {

    private TitleView mTitleView;
    private RefreshWebView mRefreshWebView;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initView() {
        mTitleView = findView(R.id.titleView);
        mRefreshWebView = findView(R.id.refreshWebView);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        Bean.DataBean.ListBean bean = (Bean.DataBean.ListBean) intent.getSerializableExtra("data");
        mRefreshWebView.loadUrl(bean.getWebview_url());
        mTitleView.setTitleText(bean.getTitle());
    }

    @Override
    protected void initListener() {
        mTitleView.setOnBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
