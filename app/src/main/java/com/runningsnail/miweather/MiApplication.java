package com.runningsnail.miweather;

import androidx.multidex.MultiDexApplication;

import com.runningsnail.base.log.HiLogger;

/**
 * @author yongjie created on 2019-11-16.
 */
public class MiApplication extends MultiDexApplication {
	@Override
	public void onCreate() {
		super.onCreate();
		//处理日志是否开启
		HiLogger.setLogEnable(BuildConfig.LOG_ENABLE);
	}
}
