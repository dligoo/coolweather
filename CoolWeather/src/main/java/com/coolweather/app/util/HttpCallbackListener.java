package com.coolweather.app.util;

/**
 * Created by Lvmin.Xia on 15/9/15.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
