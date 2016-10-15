package com.wangbo.www.cclive.helper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.List;


public class FragmentHelper {

    public static void replaceFragment(FragmentManager manager, List<Fragment> list, int
            tabIndex, int layoutId, int enter, int exit) {
        // 开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        //设置碎片显示的自定义动画
        if (enter != 0 && exit != 0) {
            transaction.setCustomAnimations(enter, exit);
        }
        // 替换碎片
        transaction.replace(layoutId, list.get(tabIndex));
        // 提交事务
        transaction.commit();
    }

    public static void switchFragment(FragmentManager manager, List<Fragment> list, int
            tabIndex, int layoutId, int enter, int exit) {
        // 开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        //让当前显示的碎片进行隐藏
        for (int i = 0; i < list.size(); i++) {
            // 判断碎片是否 显示
            if (list.get(i).isVisible()) {
                transaction.hide(list.get(i));
            }
        }
        //设置碎片显示的自定义动画
        if (enter != 0 && exit != 0) {
            transaction.setCustomAnimations(enter, exit);
        }
        // 获取碎片
        Fragment toFragment = list.get(tabIndex);
        // 如果碎片已经添加过了 就show ，否则就添加
        if (toFragment.isAdded()) {
            // 显示
            transaction.show(toFragment);
        } else {
            // 添加碎片
            transaction.add(layoutId, toFragment);
        }
        // 提交事务
        transaction.commit();
    }
}
