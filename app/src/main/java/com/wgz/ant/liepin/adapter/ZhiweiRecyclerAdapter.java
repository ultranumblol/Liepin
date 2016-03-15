package com.wgz.ant.liepin.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wgz.ant.liepin.R;

import java.util.List;
import java.util.Map;

/**
 * Created by qwerr on 2016/3/15.
 */
public class ZhiweiRecyclerAdapter extends RecyclerView.Adapter<ZhiweiRecyclerAdapter.MyViewHolder> {
    private List<Map<String,Object>> mData;
    private Context context;
    private OnItemClickLitener mOnItemClickLitener;

    public ZhiweiRecyclerAdapter(List<Map<String, Object>> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    public interface OnItemClickLitener{
        void onItemClick(View view,int position);

    }

    private void setonItemClickListner(OnItemClickLitener onItemClickLitener){
       this.mOnItemClickLitener = onItemClickLitener;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_zhiwei_rview,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView compImg;
        TextView compName;
        TextView ZPzhiwei;
        TextView money;
        TextView detiles;


        public MyViewHolder(View itemView) {
            super(itemView);
            compImg = (ImageView) itemView.findViewById(R.id.zhiwei_comp_img);
            compName = (TextView) itemView.findViewById(R.id.zhiwei_comp_name);
            ZPzhiwei = (TextView) itemView.findViewById(R.id.zhiwei_name);
            money = (TextView) itemView.findViewById(R.id.zhiwei_money);
            detiles = (TextView) itemView.findViewById(R.id.zhiwei_detiles);
        }
    }
}
