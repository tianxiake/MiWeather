package com.runningsnail.miweather.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * @author yongjie created on 2019/3/30.
 */
public abstract class BaseActivity extends AppCompatActivity {

	/**
	 * 子类输出日志使用这个TAG,命名大写
	 * 只是为了习惯统一
	 */
	protected String TAG;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		buildLogTag();
	}

	/**
	 * 构建Activity的基础Log,用的是子类的类名
	 */
	protected void buildLogTag() {
		TAG = this.getClass().getSimpleName();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
