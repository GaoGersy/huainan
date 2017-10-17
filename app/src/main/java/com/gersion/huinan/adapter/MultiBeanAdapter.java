package com.gersion.huinan.adapter;

import android.os.Bundle;
import android.view.View;

import com.gersion.huinan.R;
import com.gersion.huinan.activity.DetailActivity;
import com.gersion.huinan.activity.MainActivity;
import com.gersion.huinan.bean.Bean;
import com.gersion.library.adapter.MultiTypeAdapter;
import com.gersion.library.viewholder.BaseViewHolder;

public class MultiBeanAdapter extends MultiTypeAdapter {
    @Override
    protected void convert(final BaseViewHolder helper, Object item) {
       final Bean.DataBean.ListBean bean = (Bean.DataBean.ListBean) item;
        helper.setText(R.id.tv_title, bean.getTitle());
        helper.setText(R.id.tv_content, bean.getSummary());
        View llContainer = helper.getView(R.id.ll_container);
        final MainActivity activity = (MainActivity) helper.getConvertView().getContext();
        llContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("data",bean);
                activity.toActivity(DetailActivity.class,bundle);
            }
        });
    }
}