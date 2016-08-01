package com.diyihangdaima.black.networktest;

/**
 * Created by black on 2016/8/1/0001.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
