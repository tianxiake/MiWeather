package com.runningsnail.miweather;

import android.content.Context;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.runningsnail.miweather.entity.LocationOption;
import com.runningsnail.miweather.entity.MiLocation;
import com.runningsnail.miweather.utils.EntityConvertHelper;

/**
 * 定位帮助类,简单的包装了一个百度定位sdk,用于定位功能
 * @author yongjie created on 2019-11-16.
 */
public class LocationWrapper {

	private LocationClient locationClient;
	private LocationClientOption locationClientOption;

	public LocationWrapper(Context context) {
		locationClient = new LocationClient(context.getApplicationContext());
		locationClientOption = new LocationClientOption();
		locationClientOption.setIsNeedAddress(true);
		locationClient.setLocOption(locationClientOption);
	}

	public LocationWrapper(Context context, LocationOption locationOption) {
		locationClient = new LocationClient(context.getApplicationContext());
		locationClientOption = new LocationClientOption();
		locationClientOption.setIsNeedAddress(locationOption.isNeedAddress());
		locationClientOption.setCoorType(locationOption.getCoorType().coorType);
		locationClient.setLocOption(locationClientOption);
	}

	public void setLocationOption(LocationOption locationOption) {
		locationClientOption.setIsNeedAddress(locationOption.isNeedAddress());
		locationClientOption.setCoorType(locationOption.getCoorType().coorType);
		locationClient.setLocOption(locationClientOption);
	}

	public void start() {
		locationClient.start();
	}

	public void stop() {
		locationClient.stop();
	}


	public void restart() {
		locationClient.restart();
	}

	public void registerLocationCallback(LocationListener LocationListener) {
		locationClient.registerLocationListener(LocationListener);
	}

	public void unregisterLocationCallback(LocationListener LocationListener) {
		locationClient.unRegisterLocationListener(LocationListener);

	}

	public static abstract class LocationListener extends BDAbstractLocationListener {
		@Override
		public void onReceiveLocation(BDLocation bdLocation) {
			MiLocation miLocation = EntityConvertHelper.convertBDLocationTo(bdLocation);
			onReceiveLocation(miLocation);
		}

		public abstract void onReceiveLocation(MiLocation miLocation);
	}


}

