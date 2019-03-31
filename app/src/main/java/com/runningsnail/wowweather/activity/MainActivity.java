package com.runningsnail.wowweather.activity;

import android.util.Log;

import com.runningsnail.wowweather.R;
import com.runningsnail.wowweather.entity.FutureWeather;
import com.runningsnail.wowweather.entity.NowWeather;
import com.runningsnail.wowweather.log.Logger;
import com.runningsnail.wowweather.net.ServiceFactory;
import com.runningsnail.wowweather.net.WeatherService;
import com.runningsnail.wowweather.view.MainView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements MainView {

	@Override
	public int getContentViewId() {
		return R.layout.activity_main;
	}

	@Override
	public void initData() {

	}

	@Override
	public void initView() {

	}

	@Override
	protected void onResume() {
		super.onResume();
	}
}
