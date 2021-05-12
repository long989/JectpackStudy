package com.kachexiongdi.qkljetpackmvvm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * author : qiukailong
 * date   : 2021/4/28  6:24 PM
 * desc   :
 */
public class MyTextView extends AppCompatTextView implements LifecycleObserver {
    private static final String TAG = "MyTextView";

    public MyTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause(){
        Log.e(TAG,"onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume(){
        Log.e(TAG,"onResume");
    }
}
