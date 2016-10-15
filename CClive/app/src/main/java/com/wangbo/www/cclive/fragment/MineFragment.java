package com.wangbo.www.cclive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.iterface.IMyInterface;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by Administrator on 2016/8/29.
 */
public class MineFragment extends Fragment implements IMyInterface, View.OnClickListener {
    @BindView(R.id.imageView_userImage)
    ImageView imageViewUserImage;
    @BindView(R.id.imageView_userName)
    TextView imageViewUserName;
    @BindView(R.id.textview_loginok_attentionNum)
    TextView textviewLoginokAttentionNum;
    @BindView(R.id.textview_loginok_fansNum)
    TextView textviewLoginokFansNum;
    @BindView(R.id.textview_loginok_videoNum)
    TextView textviewLoginokVideoNum;
    @BindView(R.id.layout_LoginOK_mineFragment)
    LinearLayout layoutLoginOKMineFragment;
    @BindView(R.id.layout_LoginNo_mineFragment)
    TextView layoutLoginNoMineFragment;
    @BindView(R.id.layout_msg_minefragment)
    LinearLayout layoutMsgMinefragment;
    @BindView(R.id.layout_charge_minefragment)
    LinearLayout layoutChargeMinefragment;
    @BindView(R.id.layout_rank_minefragment)
    ImageView layoutRankMinefragment;
    @BindView(R.id.layout_plan_minefragment)
    LinearLayout layoutPlanMinefragment;
    @BindView(R.id.layout_cshow_minefragment)
    LinearLayout layoutCshowMinefragment;
    @BindView(R.id.layout_online_minefragment)
    LinearLayout layoutOnlineMinefragment;
    @BindView(R.id.layout_account_minefragment)
    LinearLayout layoutAccountMinefragment;
    @BindView(R.id.layout_setting_minefragment)
    LinearLayout layoutSettingMinefragment;
    private  Unbinder bind;
    //初始化数据源


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        bind= ButterKnife.bind(this, view);
        initView();
        return view;
    }

    @Override
    public void initView() {
        layoutMsgMinefragment.setOnClickListener(this);

    }

    @Override
    public void initDada() {

    }

    @Override
    public void operateData() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_msg_minefragment:
                if (layoutLoginNoMineFragment.getVisibility() == View.VISIBLE) {
                    layoutLoginNoMineFragment.setVisibility(View.GONE);
                } else {
                    layoutLoginNoMineFragment.setVisibility(View.VISIBLE);
                }
                if (layoutLoginOKMineFragment.getVisibility() == View.VISIBLE) {
                    layoutLoginOKMineFragment.setVisibility(View.GONE);
                } else {
                    layoutLoginOKMineFragment.setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}
