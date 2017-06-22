package com.qianmi.pointmanager;

import android.os.Bundle;

import com.qianmi.baselibrary.BaseActivity;

import butterknife.ButterKnife;


public class PointActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        ButterKnife.bind(this);

    }

}
