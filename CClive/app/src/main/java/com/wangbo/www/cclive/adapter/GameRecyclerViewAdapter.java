package com.wangbo.www.cclive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.bean.GameBean;
import com.wangbo.www.cclive.bean.GameTypeBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameRecyclerViewAdapter extends RecyclerView
        .Adapter<RecyclerView.ViewHolder> {
    private List<? extends Object> list;
    private Context mContext;
    private LayoutInflater inflater;

    public GameRecyclerViewAdapter(Context mContext, List<? extends Object> list) {
        this.mContext = mContext;
        this.list = list;
        inflater = (LayoutInflater) mContext.getSystemService(Context
                .LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof GameBean.DataBean.FiltersBean) {
            return 0;
        } else if (list.get(position) instanceof GameTypeBean.DataBean
                .ListBean) {
            return 1;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        if (viewType == 0) {
            View view = inflater.inflate(R.layout
                    .item_contentrecyclerview_game, parent, false);
            return new ContentViewHolder(view);
        } else if (viewType == 1) {
            View view = inflater.inflate(R.layout
                    .item_horizontal_recyclerview, parent, false);
            return new HorizontalViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case 0:
                GameBean.DataBean.FiltersBean filtersBean = (GameBean
                        .DataBean.FiltersBean) (list.get(position));
                ((ContentViewHolder) holder).textViewItemContent.setText(filtersBean.getName());
                GameGridViewAdapter gameGridViewAdapter = new
                        GameGridViewAdapter(mContext, filtersBean.getLiveList());
                ((ContentViewHolder) holder).gridViewItemContentRecyclerView.setAdapter(gameGridViewAdapter);
                break;
            case 1:
                GameTypeBean.DataBean.ListBean listBean = (GameTypeBean
                        .DataBean.ListBean) (list.get(position));
                ((HorizontalViewHolder) holder).simpleDraweeViewItemHorizontal
                        .setImageURI(listBean.getIcon() + ".jpg");
                ((HorizontalViewHolder) holder).textViewItemHorizontal.setText(listBean.getName());
                break;

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

     class HorizontalViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.simpleDraweeView_item_horizontal)
        SimpleDraweeView simpleDraweeViewItemHorizontal;
        @BindView(R.id.textView_item_horizontal)
        TextView textViewItemHorizontal;

        public HorizontalViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class ContentViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textView_item_content)
        TextView textViewItemContent;
        @BindView(R.id.gridView_item_contentRecyclerView)
        GridView gridViewItemContentRecyclerView;
        public ContentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void reloadAdapter(List _list, boolean isClear) {
        if (isClear) {
            list.clear();
        }
        list.addAll(_list);
        notifyDataSetChanged();
    }


}
