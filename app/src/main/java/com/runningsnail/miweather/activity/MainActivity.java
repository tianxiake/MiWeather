package com.runningsnail.miweather.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.runningsnail.base.log.HiLogger;
import com.runningsnail.miweather.R;


public class MainActivity extends BaseActivity  {

    private static final String TAG = "MainActivity";
    private LocationClient locationClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HiLogger.i(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        locationClient = new LocationClient(getApplicationContext());
        LocationClientOption option = new LocationClientOption();
        option.setIsNeedAddress(true);
        locationClient.setLocOption(option);
        locationClient.registerLocationListener(new BDAbstractLocationListener() {
            @Override
            public void onReceiveLocation(BDLocation bdLocation) {
                HiLogger.i(TAG, "BD %s,%s,%s,%s,%s,%s,%s",
                        bdLocation.getLongitude(),
                        bdLocation.getLatitude(),
                        bdLocation.getAddrStr(),
                        bdLocation.getStreet(),
                        bdLocation.getDistrict(),
                        bdLocation.getCity(),
                        bdLocation.getStreetNumber());
            }
        });

        LocationClient locationClient2 = new LocationClient(getApplicationContext());
        locationClient2.setLocOption(option);
        locationClient2.registerLocationListener(new BDAbstractLocationListener() {
            @Override
            public void onReceiveLocation(BDLocation bdLocation) {
                HiLogger.i(TAG, "BD2 %s,%s,%s,%s,%s,%s,%s",
                        bdLocation.getLongitude(),
                        bdLocation.getLatitude(),
                        bdLocation.getAddrStr(),
                        bdLocation.getStreet(),
                        bdLocation.getDistrict(),
                        bdLocation.getCity(),
                        bdLocation.getStreetNumber());
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            } else {
                locationClient.start();
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
