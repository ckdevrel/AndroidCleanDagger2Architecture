package com.takeoffandroid.androidcleandagger2architecture;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules =  {DaggerModule.class})
public interface DaggerComponent {



    void inject(MainActivity mainActivity);

}
