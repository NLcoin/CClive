package com.wangbo.www.cclive.fragment;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.adapter.GameRecyclerViewAdapter;
import com.wangbo.www.cclive.adapter.GameViewPagerAdapter;
import com.wangbo.www.cclive.bean.GameBean;
import com.wangbo.www.cclive.bean.GameTypeBean;
import com.wangbo.www.cclive.helper.OkHttpClientHelper;
import com.wangbo.www.cclive.helper.UrlHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameFragment extends Fragment {

    @BindView(R.id.imageButton_search_game)
    ImageButton imageButtonSearchGame;
    @BindView(R.id.imageView_liveFast_game)
    ImageView imageViewLiveFastGame;
    @BindView(R.id.imageButton_scan_game)
    ImageButton imageButtonScanGame;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.viewPager_ad_game)
    ViewPager viewPagerAdGame;
    @BindView(R.id.recyclerView_horizontal_game)
    RecyclerView recyclerViewHorizontalGame;
    @BindView(R.id.imageButton_subjects_game)
    ImageButton imageButtonSubjectsGame;
    @BindView(R.id.recyclerView_content_game)
    RecyclerView recyclerViewContentGame;

    private Context mContext;
    //标语的数据
    private List<GameBean.DataBean.BannerBean> bannerList = new ArrayList<>();
    //详情数据
    private List<GameBean.DataBean.FiltersBean> filtersList = new ArrayList<>();
    //游戏类型的数据
    private List<GameTypeBean.DataBean.ListBean> gameTypeList = new ArrayList<>();
    //标语viewpager的适配器
    private GameViewPagerAdapter bannerAdapter;
    //游戏类型的适配器
    private GameRecyclerViewAdapter gameTypeAdapter;
    private  GameRecyclerViewAdapter gameRecyclerViewAdapter;
    private Handler handler = new Handler();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        bannerAdapter = new GameViewPagerAdapter(mContext, bannerList);
        gameTypeAdapter = new GameRecyclerViewAdapter(mContext, gameTypeList);
        gameRecyclerViewAdapter = new GameRecyclerViewAdapter(mContext, filtersList);
        initData();
    }

    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //下载并解析gameJson
                    String gameJson = OkHttpClientHelper
                            .getStringFromURL(mContext, UrlHelper
                                    .GAME_URL, "");
                    final GameBean.DataBean gameBean = parseGameJson(gameJson);
                    if (gameBean != null) {
                        //广告的数据
                        bannerList = gameBean.getBanner();
                        //详情数据
                        filtersList = gameBean.getFilters();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                //刷新标语的适配器
                                bannerAdapter.reloadAdapter(bannerList, true);
                                gameRecyclerViewAdapter.reloadAdapter(filtersList,true);
                            }
                        });
                    }
                    //下载并解析gameTypeJson
                    String gameTypeJson = OkHttpClientHelper
                            .getStringFromURL(mContext, UrlHelper
                                    .GAME_TYPE_URL, "");
                    final List<GameTypeBean.DataBean.ListBean> newGameTypeList =
                            parseGameTypeJson(gameTypeJson);
                    if (gameTypeList != null) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                //刷新游戏类型的适配器
                                gameTypeAdapter.reloadAdapter(newGameTypeList,true);
                            }
                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container,
                false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AnimationDrawable ad = (AnimationDrawable) imageViewLiveFastGame.getBackground();
        ad.start();
        //标语viewpager设置适配器
        viewPagerAdGame.setAdapter(bannerAdapter);
        //viewpager的轮播
        viewPagerAdGame.setCurrentItem(99999);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                viewPagerAdGame.setCurrentItem(viewPagerAdGame.getCurrentItem()+1);
                            }
                        });
                    }
                }
            }).start();


        //gameType recyclerview的设置
        LinearLayoutManager typeManager = new LinearLayoutManager(mContext,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerViewHorizontalGame.setLayoutManager(typeManager);
        recyclerViewHorizontalGame.setAdapter(gameTypeAdapter);
        //设置详情的recyclerview
        LinearLayoutManager contentManager = new LinearLayoutManager(mContext,
                LinearLayoutManager.VERTICAL, false);
        recyclerViewContentGame.setLayoutManager(contentManager);
        recyclerViewContentGame.setAdapter(gameRecyclerViewAdapter);
    }

    private GameBean.DataBean parseGameJson(String jsonString) {
        Gson gson = new Gson();
        GameBean bean = gson.fromJson(jsonString, new TypeToken<GameBean>() {
        }.getType());
        GameBean.DataBean data = bean.getData();
        return data;
    }

    private List<GameTypeBean.DataBean.ListBean> parseGameTypeJson(String jsonString) {
        Gson gson = new Gson();
        GameTypeBean bean = gson.fromJson(jsonString, new
                TypeToken<GameTypeBean>() {
        }.getType());
        List<GameTypeBean.DataBean.ListBean> list = bean.getData().getList();
        return list;
    }
}
