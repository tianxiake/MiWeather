package com.runningsnail.wowweather.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.runningsnail.wowweather.log.Logger;


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
		setContentView(getContentViewId());
		initView();
		initData();
	}

	/**
	 * 构建Activity的基础Log,用的是子类的类名
	 */
	private void buildLogTag() {
		TAG = this.getClass().getSimpleName();
	}

	/**
	 * 布局ID
	 */
	public abstract int getContentViewId();

	/**
	 * 初始化数据
	 */
	public abstract void initData();

	/**
	 * 初始化View
	 */
	public abstract void initView();


	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}