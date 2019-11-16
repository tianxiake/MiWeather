package com.runningsnail.miweather;

import android.content.Context;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.runningsnail.miweather.entity.HelpOption;
import com.runningsnail.miweather.entity.MiLocation;
import com.runningsnail.miweather.utils.EntityConvertHelper;

/**
 * @author yongjie created on 2019-11-16.
 */
public class LocationHelperWrapper {

	private LocationClient locationClient;

	public LocationHelperWrapper(Context context) {
		locationClient = new LocationClient(context.getApplicationContext());
		LocationClientOption locationClientOption = new LocationClientOption();
		locationClientOption.setIsNeedAddress(true);
		locationClient.setLocOption(locationClientOption);
	}

	public LocationHelperWrapper(Context context, HelpOption helpOption) {
		locationClient = new LocationClient(context.getApplicationContext());
		LocationClientOption locationClientOption = new LocationClientOption();
		locationClientOption.setIsNeedAddress(helpOption.isNeedAddress());
		locationClientOption.setCoorType(helpOption.getCoorType().coorType);
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

	public void registerLocationCallback(LocationCallback LocationCallback) {
		locationClient.registerLocationListener(LocationCallback);
	}

	public void unregisterLocationCallback(LocationCallback LocationCallback) {
		locationClient.unRegisterLocationListener(LocationCallback);

	}

	public abstract class LocationCallback extends BDAbstractLocationListener {
		@Override
		public void onReceiveLocation(BDLocation bdLocation) {
			MiLocation miLocation = EntityConvertHelper.convertBDLocationTo(bdLocation);
			onReceiveLocation(miLocation);
		}

		public abstract void onReceiveLocation(MiLocation miLocation);
	}


}

