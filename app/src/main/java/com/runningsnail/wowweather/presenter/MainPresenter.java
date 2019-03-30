package com.runningsnail.wowweather.presenter;

import com.runningsnail.wowweather.model.MainModel;
import com.runningsnail.wowweather.view.MainView;

/**
 * @author yongjie created on 2019/3/30.
 */
public class MainPresenter extends BasePresenter<MainView, MainModel> {

	@Override
	protected MainModel createModel() {
		return new MainModel();
	}
}
