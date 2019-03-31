package com.runningsnail.wowweather.net;

import android.support.test.runner.AndroidJUnit4;

import com.runningsnail.wowweather.entity.FutureWeather;
import com.runningsnail.wowweather.entity.NowWeather;
import com.runningsnail.wowweather.log.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author yongjie created on 2019/3/31.
 */
@RunWith(AndroidJUnit4.class)
public class WeatherServiceTest {

	public static final String TAG = "WeatherServiceTest";

	@Test
	public void getNowWeather() {
		WeatherService weatherService = ServiceFactory.createWeatherService();
		Observable<NowWeather> nowWeather = weatherService.getNowWeather("121.6544,25.1552");
		nowWeather.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Observer<NowWeather>() {
			@Override
			public void onSubscribe(Disposable d) {
				Logger.d(TAG, "NowWeather onSubscribe");
			}

			@Override
			public void onNext(NowWeather nowWeather) {
				Logger.d(TAG, "%s %s", "NowWeather", nowWeather.toString());
			}

			@Override
			public void onError(Throwable e) {
				Logger.d(TAG, "NowWeather onError");
			}

			@Override
			public void onComplete() {

				Logger.d(TAG, "NowWeather onComplete");
			}
		});

	}

	@Test
	public void getFutureWeather() {
		WeatherService weatherService = ServiceFactory.createWeatherService();
		Observable<FutureWeather> futureWeather = weatherService.getFutureWeather("121.6544,25.1552");
		futureWeather.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Observer<FutureWeather>() {
			@Override
			public void onSubscribe(Disposable d) {
				Logger.d(TAG, "FutureWeather onSubscribe");
			}

			@Override
			public void onNext(FutureWeather futureWeather) {
				Logger.d(TAG, "%s %s", "futureWeather", futureWeather.toString());
			}

			@Override
			public void onError(Throwable e) {
				Logger.d(TAG, "FutureWeather onError");
			}

			@Override
			public void onComplete() {
				Logger.d(TAG, "FutureWeather onComplete");
			}
		});
	}
}