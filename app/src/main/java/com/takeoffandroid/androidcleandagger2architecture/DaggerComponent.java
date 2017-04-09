package com.takeoffandroid.androidcleandagger2architecture;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by f22labs on 09/04/17.
 */


@Singleton
@Component(modules =  {DaggerModule.class})
public interface DaggerComponent {



    void inject(MainActivity mainActivity);

}
