package com.daon.onorder;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

public class App extends Application {

    private LifecycleObserver lifecycleListener = new CycleListener();

    @Override
    public void onCreate() {
        super.onCreate();
        setupLifecycleObserver();
    }

    private void setupLifecycleObserver(){
        ProcessLifecycleOwner.get().getLifecycle().addObserver(lifecycleListener);
    }
}
class CycleListener implements LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onMoveToFoground(){
        // Moving to Foground…

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onMoveToBackground() {
        Log.d("daon_test", "backGround");
    }
} // end LifecycleObserver