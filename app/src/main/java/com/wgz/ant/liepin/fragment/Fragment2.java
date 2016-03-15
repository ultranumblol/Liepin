package com.wgz.ant.liepin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wgz.ant.liepin.R;
import com.wgz.ant.liepin.adapter.ZhiweiRecyclerAdapter;

/**
 * Created by qwerr on 2016/3/15.
 */
public class Fragment2 extends Fragment {
    private RecyclerView mRecyclerView;
    private ZhiweiRecyclerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,null);

        initview(view);
        return  view;
    }

    private void initview(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.id_zhiwei_rview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
