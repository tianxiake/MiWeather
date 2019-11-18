package com.runningsnail.miweather.activity;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.runningsnail.base.log.HiLogger;
import com.runningsnail.miweather.R;

import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;


public class MainActivity extends BaseActivity  implements EasyPermissions.PermissionCallbacks {

	private static final int FINE_LOCATION_CODE = 0x11;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    HiLogger.i(TAG, "onCreate");
	    setContentView(R.layout.activity_main);
		EasyPermissions.requestPermissions(this,
				"用于获取天气的信息哦", FINE_LOCATION_CODE,
				Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION);
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

	@AfterPermissionGranted(FINE_LOCATION_CODE)
	public void requestFineLocation() {
		HiLogger.i(TAG, "requestFineLocation");
		String[] perms = {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.WRITE_EXTERNAL_STORAGE};
		if (EasyPermissions.hasPermissions(this, perms)) {
			HiLogger.i(TAG, "权限都获取了 哈哈");
		} else {
			EasyPermissions.requestPermissions(this, "用于天气服务哦", FINE_LOCATION_CODE, perms);
		}
	}


	@Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

	@Override
	public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {
		HiLogger.d(TAG, "onPermissionsGranted A:{} ",requestCode);
	}

	@Override
	public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {

	}
}

