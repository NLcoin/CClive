package com.wangbo.www.cclive.application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.squareup.okhttp.OkHttpClient;
import com.wangbo.www.cclive.helper.OkHttpClientHelper;

/**
 * Created by Administrator on 2016/8/11.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化okhttp
        initOkHttp();
        Fresco.initialize(getApplicationContext());

    }

    private void initOkHttp() {
        //  单列获取okHttpClient对象
        OkHttpClient okHttpClient = OkHttpClientHelper.getOkHttpSingletonInstance();
    }

}
