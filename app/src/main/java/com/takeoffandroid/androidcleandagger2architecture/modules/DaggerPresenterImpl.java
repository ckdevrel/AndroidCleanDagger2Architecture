package com.takeoffandroid.androidcleandagger2architecture.modules;

import android.content.SharedPreferences;

import dagger.Provides;

/**
 * Created by f22labs on 08/04/17.
 */

public class DaggerPresenterImpl implements DaggerPresenter {


    private String userMobile;

    private String KEY_MOBILE = "mobile";

    private SharedPreferences sharedPreferences;

    public DaggerPresenterImpl(String userMobile, SharedPreferences sharedPreferences) {
        this.userMobile = userMobile;
        this.sharedPreferences = sharedPreferences;
    }


    @Override
    public void saveUserMobile() {

        sharedPreferences.edit()
                .putString(KEY_MOBILE, userMobile)
                .apply();

    }

    @Override
    public String getUserMobile() {


        String mobile = sharedPreferences.getString(KEY_MOBILE, "");

        return mobile;
    }
}
