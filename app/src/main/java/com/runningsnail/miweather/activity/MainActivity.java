package com.runningsnail.miweather.activity;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.runningsnail.base.log.HiLogger;
import com.runningsnail.miweather.R;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

@RuntimePermissions
public class MainActivity extends BaseActivity {

	private static final int FINE_LOCATION_CODE = 0x11;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    HiLogger.i(TAG, "onCreate");
	    setContentView(R.layout.activity_main);
		MainActivityPermissionsDispatcher.getWeatherWithPermissionCheck(this);
	}

	@NeedsPermission({Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE})
	public void getWeather() {
		HiLogger.i(TAG, "getWeather");
	}

	@OnPermissionDenied({Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE})
	public void onGetWeatherDeny() {
		HiLogger.i(TAG, "onGetWeatherDeny");
	}

	@OnNeverAskAgain({Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE})
	public void onGetWeatherNeverAskAgain() {
		HiLogger.i(TAG, "onGetWeatherNeverAskAgain");
	}

	@OnShowRationale({Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE})
	public void onGetWeatherShowRotionale(PermissionRequest permissionRequest) {
		HiLogger.i(TAG, "onGetWeatherShowRotionale");
		permissionRequest.proceed();
	}



	@Override
	protected void onRestart() {
		super.onRestart();
		HiLogger.i(TAG,"onRestart");
	}

	@Override
	protected void onStart() {
		super.onStart();
		HiLogger.i(TAG,"onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		HiLogger.i(TAG, "onResume");
	}

	@Override
	protected void onPause() {
	    super.onPause();
	    HiLogger.i(TAG, "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		HiLogger.i(TAG,"onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		HiLogger.i(TAG, "onDestroy");
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		MainActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
	}
}

