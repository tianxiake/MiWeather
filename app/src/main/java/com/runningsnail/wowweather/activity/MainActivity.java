package com.runningsnail.wowweather.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.runningsnail.wowweather.R;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity  {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }



}
