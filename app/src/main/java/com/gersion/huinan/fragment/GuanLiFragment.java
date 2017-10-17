package com.gersion.huinan.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gersion.huinan.R;
import com.gersion.huinan.adapter.MultiBeanAdapter;
import com.gersion.huinan.base.BaseFragment;
import com.gersion.huinan.bean.Bean;
import com.gersion.huinan.callback.DialogCallback;
import com.gersion.huinan.constants.AppConstants;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.List;

/**
 * Created by aa326 on 2017/10/17.
 */

public class GuanLiFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private MultiBeanAdapter mAdapter;
    private int page;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_guan_li;
    }

    @Override
    protected void initView() {
        mRecyclerView = (RecyclerView) findView(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mAdapter = new MultiBeanAdapter();
        mAdapter.registerMultiBean(Bean.DataBean.ListBean.class,R.layout.item_guan_li);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void initData(Bundle bundle) {
        getData();
    }

    private void getData() {
        String url = AppConstants.BASE_URL + page;
        OkGo.<Bean>get(url)
                .tag(this)
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<Bean>(getActivity()) {
                    @Override
                    public void onSuccess(Response<Bean> response) {
                        Bean.DataBean data = response.body().getData();
                        List<Bean.DataBean.ListBean> list = data.getList();
                        mAdapter.getItems().addAll(list);
                        page++;
                        if (page>10){
                            mAdapter.notifyDataSetChanged();
                            return;
                        }
                        getData();
                    }
                });
    }

    @Override
    protected void initListener() {
    }
}
