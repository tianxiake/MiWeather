package com.runningsnail.wowweather.presenter;

import com.runningsnail.wowweather.view.BaseView;
import com.runningsnail.wowweather.model.BaseModel;

/**
 * @author create by yongjie on 2018/7/3
 */
public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {

    protected V view;
    protected M model;

    public BasePresenter() {
        model = createModel();
    }

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        view = null;
    }

    protected abstract M createModel();
}
