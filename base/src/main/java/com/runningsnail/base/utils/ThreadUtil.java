package com.runningsnail.base.utils;

import android.os.Looper;

public class ThreadUtil {


    /**
     * 判断是否是主线程
     */
    public static boolean isMainThread() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
