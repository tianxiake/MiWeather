package com.runningsnail.base;

/**
 * @author yongjie created on 2019-07-22.
 */
public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {

    protected V view;
    protected M model;

    public BasePresenter() {
        model = createModel();
    }

    protected void attachView(V view) {
        this.view = view;
    }

    protected void detachView() {
        this.view = null;
    }

    protected abstract M createModel();
}
