package com.runningsnail.miweather.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.runningsnail.base.log.HiLogger;
import com.runningsnail.miweather.LocationWrapper;
import com.runningsnail.miweather.R;
import com.runningsnail.miweather.entity.MiLocation;


public class MainActivity extends BaseActivity  {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HiLogger.i(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        LocationWrapper locationWrapper = new LocationWrapper(this);
        locationWrapper.registerLocationCallback(new LocationWrapper.LocationListener() {
            @Override
            public void onReceiveLocation(MiLocation miLocation) {
                HiLogger.i(TAG, "miLocation %s", miLocation);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            } else {
                locationWrapper.start();
            }

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 2);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_WIFI_STATE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_WIFI_STATE}, 3);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, 4);
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {


                } else {
                    HiLogger.i(TAG, "failure %s", requestCode);
                }
                break;
            case 2:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    HiLogger.i(TAG, "failure %s", requestCode);
                }
                break;
            case 3:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    HiLogger.i(TAG, "failure %s", requestCode);
                }
                break;
            case 4:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    HiLogger.i(TAG, "failure %s", requestCode);
                }
                break;
            default:
                break;


        }
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
}
