package com.takeoffandroid.androidcleandagger2architecture;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.takeoffandroid.androidcleandagger2architecture.modules.DaggerPresenter;
import com.takeoffandroid.androidcleandagger2architecture.modules.DaggerPresenterImpl;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DaggerModule {


    private Context context;


    public DaggerModule(Application app) {
        this.context = app;
    }



    @Provides
    Context providesContext() {
        return context;
    }


    @Provides
    @Named("DaggerModule.UserMobile")
    String providesUserMobile() {
        return "9789010929";
    }


    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }



    @Provides
    @Singleton
    DaggerPresenter providesDaggerPresenter(@Named("DaggerModule.UserMobile") String userMobile, SharedPreferences sharedPreferences){
        return new DaggerPresenterImpl(userMobile,sharedPreferences);
    }



}
