package com.gersion.huinan.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public abstract class BaseFragment extends Fragment {
    public static final int REQUEST_CODE_LOGIN = 201;
    private static final Handler handler = new Handler();
    protected BaseActivity activity;
    protected View view;
    private Toast mToast;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = (BaseActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(setLayoutId(), container, false);
        initView();
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData(savedInstanceState);
        initListener();
    }

    protected abstract int setLayoutId();

    protected abstract void initView();

    protected abstract void initData(Bundle bundle);

    protected abstract void initListener();

    protected <T extends View> T findView(int id){
        return (T) view.findViewById(id);
    }

    public void toActivity(Class<?> clazz) {
        toActivity(clazz,null);
    }

    public void toActivity(Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(getActivity(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public void toActivityForResult(Class<?> clazz, int requestCode) {
        toActivityForResult(clazz, requestCode, null);
    }

    public void toActivityForResult(Class<?> clazz, int requestCode, Bundle bundle) {
        Intent intent = new Intent(getActivity(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    public void showToast(String msg) {
        mToast = Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT);
        if (!TextUtils.isEmpty(msg)) {
            if (mToast == null) {
            } else {
                mToast.setText(msg);
            }
            mToast.show();
        }
    }
}
