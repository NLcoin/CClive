package com.wangbo.www.cclive.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wangbo.www.cclive.R;
import com.wangbo.www.cclive.bean.GameBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameGridViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<GameBean.DataBean.FiltersBean.LiveListBean> list;
    private LayoutInflater inflater;

    public GameGridViewAdapter(Context mContext, List<GameBean.DataBean
            .FiltersBean.LiveListBean> list) {
        this.mContext = mContext;
        this.list = list;
        inflater = (LayoutInflater) mContext.getSystemService(Context
                .LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GameViewHolder gameViewHolder = null;
        if (convertView==null){
            convertView = inflater.inflate(R.layout.item_gridview_game, parent,false);
            gameViewHolder = new GameViewHolder(convertView);
            convertView.setTag(gameViewHolder);
        }else {
            gameViewHolder = (GameViewHolder) convertView.getTag();
        }
        gameViewHolder.simpleDraweeViewItemGridViewGame.setImageURI(list.get(position).getCover()+".jpg");
        gameViewHolder.textViewItemNameGridView.setText(list.get(position).getNickname());
        gameViewHolder.textViewItemGridViewTitle.setText(list.get(position).getTitle());
        gameViewHolder.textViewPeopleNumGame.setText(list.get(position).getVisitor()+"");
        return convertView;
    }

    static class GameViewHolder {
        @BindView(R.id.simpleDraweeView_item_gridView_game)
        SimpleDraweeView simpleDraweeViewItemGridViewGame;
        @BindView(R.id.textView_item_nameGridView)
        TextView textViewItemNameGridView;
        @BindView(R.id.textView_peopleNum_game)
        TextView textViewPeopleNumGame;
        @BindView(R.id.textView_item_gridView_title)
        TextView textViewItemGridViewTitle;

        GameViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
