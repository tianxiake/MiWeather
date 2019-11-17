package com.runningsnail.miweather.utils;

import com.baidu.location.BDLocation;
import com.runningsnail.miweather.entity.MiLocation;

/**
 * @author yongjie created on 2019-11-16.
 */
public class EntityConvertHelper {

	public static MiLocation convertBDLocationTo(BDLocation bdLocation) {
		MiLocation miLocation = new MiLocation();
		if (bdLocation != null) {
			miLocation.setLongitude(bdLocation.getLongitude());
			miLocation.setAltitude(bdLocation.getAltitude());
			miLocation.setLatitude(bdLocation.getLatitude());
			miLocation.setCity(bdLocation.getCity());
			miLocation.setCountry(bdLocation.getCountry());
			miLocation.setProvince(bdLocation.getProvince());
			miLocation.setStreet(bdLocation.getStreet());
			miLocation.setStreetNumer(bdLocation.getStreetNumber());
			miLocation.setDistrict(bdLocation.getDistrict());
			miLocation.setAddrStr(bdLocation.getAddrStr());
			miLocation.setLocType(bdLocation.getLocType());
		}
		return miLocation;
	}
}
