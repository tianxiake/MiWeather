package com.runningsnail.base.utils;

import android.os.Handler;
import android.os.Looper;

/**
 * @author yongjie created on 2019/4/12.
 * Android MainHandler使用工具类
 */
public class MainHandler extends Handler {

    private static volatile MainHandler instance;

    public static MainHandler getInstance() {
        if (null == instance) {
            synchronized (MainHandler.class) {
                if (null == instance) {
                    instance = new MainHandler();
                }
            }
        }
        return instance;
    }

    private MainHandler() {
        super(Looper.getMainLooper());
    }
}
