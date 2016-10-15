package com.wangbo.www.cclive.activity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.fragment.GameFragment;
import com.wangbo.www.cclive.fragment.HomepageFragment;
import com.wangbo.www.cclive.fragment.MineFragment;
import com.wangbo.www.cclive.helper.FragmentHelper;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RadioGroup radioGroup_main;
    private RadioButton[] arrRadioButton;
    private Drawable[] arrIconDrawable = null;
    private List<Fragment> totalList = new ArrayList<>();
    private FragmentManager manager=null;
    private Context mContext=this;
    private String[] arrTabTitles = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // 调用初始化控件方法
        initView();
        // 调用初始化数据方法
        initData();
        // 调用初始化按钮的方法
        initTabs();
    }

    private void initData() {
        // 获取碎片管理器
        manager=getSupportFragmentManager();
        // 获取 资源中的数组
        arrTabTitles=getResources().getStringArray(R.array.arrTabTitles);
        // 创建 数组对象
        arrRadioButton=new RadioButton[arrTabTitles.length];
        // 获取资源的 无类型数组 对象
        TypedArray typedArray = getResources().obtainTypedArray(R.array.arrIconDrawable);
        // 创建 数组
        arrIconDrawable=new Drawable[typedArray.length()];
        for (int i = 0; i < arrTabTitles.length; i++) {
            // 设置 按钮上的  icon
            arrIconDrawable[i]=typedArray.getDrawable(i);
        }
        // 创建 碎片对象
        HomepageFragment homePageFragment =new HomepageFragment();
        GameFragment gameFragment = new GameFragment();
        // 给碎片设置 管理器
//        homePageFragment.setManager(manager);
        //  向数组中添加碎片
        totalList.add(gameFragment);
        totalList.add(homePageFragment);
        totalList.add(homePageFragment);
        totalList.add(homePageFragment);
        totalList.add(new MineFragment());
    }

    private void initTabs() {
        for (int i = 0; i < totalList.size(); i++) {
            // 创建 按钮
            arrRadioButton[i] = new RadioButton(mContext);
            // 按钮设置 文字
            arrRadioButton[i].setText(arrTabTitles[i]);
            //设置文字为灰色
            arrRadioButton[i].setTextColor(Color.GRAY);
            arrRadioButton[i].setTextSize(12);
            arrRadioButton[i].setButtonDrawable(android.R.color.transparent);
            // 获取屏幕宽度
            int screenWidth = getResources().getDisplayMetrics().widthPixels;
            //水平平分整个宽度
            arrRadioButton[i].setWidth(screenWidth / 5);
            //设置文字居中
            arrRadioButton[i].setGravity(Gravity.CENTER);
            //去除背景
            arrRadioButton[i].setBackgroundResource(android.R.color.transparent);
            //在RadioButton上方放置icon图标
            arrIconDrawable[i].setBounds(0, 0, 60, 60);
            arrRadioButton[i].setCompoundDrawables(null, arrIconDrawable[i], null, null);
            //设置icon图标与文字间的填充
            arrRadioButton[i].setCompoundDrawablePadding(5);
            //设置icon矢量图的颜色
            arrIconDrawable[i].setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
            // 将button 添加到radiogroup中
            radioGroup_main.addView(arrRadioButton[i]);
        }
        // 默认显示第一个碎片的界面
        FragmentHelper.replaceFragment(manager,totalList,0,R.id.framelayot_home,0,0);
        // 默认第一个 按钮 为被选中 状态 ，设置其文字 和按钮颜色
        arrIconDrawable[0].setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
        arrRadioButton[0].setTextColor(Color.BLUE);
        // 设置监听
        radioGroup_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("TAG", "======onCheckedChanged:"+totalList.size());
                for (int i = 0; i < totalList.size(); i++) {
                    // 每次循环 将所有 按钮的文字和颜色 回复 到一样的初始化状态
                    arrIconDrawable[i].setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
                    arrRadioButton[i].setTextColor(Color.GRAY);
                    if (checkedId==arrRadioButton[i].getId()){
                        // 设置被选中的按钮的 文字和图标的颜色
                        arrIconDrawable[i].setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                        arrRadioButton[i].setTextColor(Color.BLUE);
                        // 显示 被选中的 碎片
                        FragmentHelper.switchFragment(manager,totalList,i,R.id.framelayot_home,0,0);
                    }
                }
            }
        });
    }
    private void initView() {
        // 初始化控件
        radioGroup_main= (RadioGroup) findViewById(R.id.radiogroup_home);

    }
}
