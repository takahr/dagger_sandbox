package com.nmi168h.daggersandbox.di;

import com.nmi168h.daggersandbox.SandboxApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class})
public interface AppComponent extends AndroidInjector<SandboxApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SandboxApplication> {
    }
}
