package com.miki.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/*
 *  项目名:  ServiceDemo
 *  包  名:  com.miki.servicedemo
 *  文件名:  MyIntentService
 *  创建者:  WZH
 *  时  间:  2018/5/16  15:37
 *  描  述:  TODO
 */
public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //打印当前线程
        Log.d(TAG, "onHandleIntent: Thread id is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: executed");
    }
}
