package com.kachexiongdi.qkljetpackmvvm;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

/**
 * author : qiukailong
 * date   : 2021/4/29  5:05 PM
 * desc   :
 */
public class MyApplication extends Application {

    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }

    public static MyApplication getInstance(){
        return instance;
    }
}
