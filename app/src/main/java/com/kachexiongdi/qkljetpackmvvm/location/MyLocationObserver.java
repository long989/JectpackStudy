package com.kachexiongdi.qkljetpackmvvm.location;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * author : qiukailong
 * date   : 2021/4/29  4:35 PM
 * desc   :
 */
public class MyLocationObserver implements LifecycleObserver {
    private Context mContext;
    private LocationManager locationManager;

    public MyLocationObserver(Context context) {
        mContext = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void startGPS() {
        Log.e("qkl", "startGPS");
        locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, myLocationListener);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stopGPS() {
        Log.e("qkl", "stopGPS");
        locationManager.removeUpdates(myLocationListener);
    }

    private LocationListener myLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(@NonNull Location location) {
            Log.e("qkl", location.toString());
        }
    };
}
