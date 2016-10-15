package com.wangbo.www.cclive.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.bean.GameBean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameViewPagerAdapter extends PagerAdapter {
    private List<GameBean.DataBean.BannerBean> list;
    private Context mContext;
    private LayoutInflater inflater;
    public GameViewPagerAdapter(Context mContext,List<GameBean.DataBean.BannerBean> list){
        this.mContext = mContext;
        this.list = list;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        if (list!=null){
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (list.size()!=0){
            int newPosition = position % list.size();
            View view = inflater.inflate(R.layout.item_viewpager_game,
                    container, false);
            //初始化控件
            SimpleDraweeView simpleDraweeView_item_gameViewPager =
                    (SimpleDraweeView) view.findViewById(R.id.simpleDraweeView_item_gameViewPager);

            //加载图片
            simpleDraweeView_item_gameViewPager.setImageURI(list.get(newPosition).getPic()+".jpg");
            container.addView(view);
            return view;
        }
            return null;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    public void reloadAdapter(List<GameBean.DataBean.BannerBean> _list,boolean isClear){
        if (isClear){
            list.clear();
        }
        list.addAll(_list);
    }
}
