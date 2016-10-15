package com.wangbo.www.cclive;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.wangbo.www.cclive.activity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建handler对象
        Handler handler = new Handler();
        // 使用handler的postDelayed实现延时跳转
        handler.postDelayed(new Runnable() {
            public void run() {
                // 设置跳转意图
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                // 开始跳转
                startActivity(intent);
                // 跳转后销毁当前界面
                finish();
            }
        }, 2000);// 2秒后跳转至应用主界面MainActivity

    }
}
