package com.nmi168h.daggersandbox;

import android.app.Application;

import com.nmi168h.daggersandbox.di.DaggerAppComponent;

public class SandboxApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .build()
                .inject(this);
    }
}
