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
		locationClientOption.setCoorType(LocationOption.CoorType.GCJ02.coorType);
		locationClient.setLocOption(locationClientOption);
	}

	public LocationWrapper(Context context, LocationOption locationOption) {
		locationClient = new LocationClient(context.getApplicationContext());
		locationClientOption = new LocationClientOption();
		setOption(locationOption);
	}

	public void setLocationOption(LocationOption locationOption) {
		setOption(locationOption);
	}

	/**
	 * start调用之后会返回一次定位信息
	 */
	public void start() {
		locationClient.start();
	}

	/**
	 * 停止定位信息,重新获取定位信息使用 {@link #start()}
	 */
	public void stop() {
		locationClient.stop();
	}

	/**
	 * 重新启动定位服务
	 */
	public void restart() {
		locationClient.restart();
	}

	/**
	 * 主动请求获取位置信息
	 */
	public void requestLocation() {
		locationClient.requestLocation();
	}


	public void registerLocationCallback(LocationListener LocationListener) {
		locationClient.registerLocationListener(LocationListener);
	}

	public void unregisterLocationCallback(LocationListener LocationListener) {
		locationClient.unRegisterLocationListener(LocationListener);

	}

	private void setOption(LocationOption locationOption) {
		locationClientOption.setIsNeedAddress(locationOption.isNeedAddress());
		locationClientOption.setCoorType(locationOption.getCoorType().coorType);
		locationClientOption.setIsNeedAltitude(locationOption.isNeedAltitude());
		locationClient.setLocOption(locationClientOption);
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

