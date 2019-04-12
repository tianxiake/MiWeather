package com.runningsnail.wowweather.net;

import com.runningsnail.base.log.HiLogger;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author yongjie created on 2019/3/30.
 */
public class ServiceFactory {
	public static final String TAG = "ServiceFactory";

	private static Retrofit weatherRetrofit;

	static {
		HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
			@Override
			public void log(String message) {
				HiLogger.d(TAG, message);
			}
		});
		httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		OkHttpClient client = new OkHttpClient().newBuilder()
				.addInterceptor(httpLoggingInterceptor)
				.build();
		weatherRetrofit = new Retrofit.Builder()
				.baseUrl("https://api.caiyunapp.com/")
				.client(client)
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
				.build();
		HiLogger.d(TAG, "build weatherRetrofit %s", weatherRetrofit);
	}

	/**
	 * 构建访问天气信息的网络接口
	 */
	public static WeatherService createWeatherService() {
		return weatherRetrofit.create(WeatherService.class);
	}

}
