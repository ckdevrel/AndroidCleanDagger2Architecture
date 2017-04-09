package com.takeoffandroid.androidcleandagger2architecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.takeoffandroid.androidcleandagger2architecture.modules.DaggerPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    DaggerPresenter daggerPresenter;


    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerApplication) getApplication()).getDaggerComponent().inject(MainActivity.this);


        daggerPresenter.saveUserMobile();

        txtMessage = (TextView)findViewById(R.id.txt_message) ;

        txtMessage.setText("Hello Dagger user, You mobile number is "+daggerPresenter.getUserMobile());

        Log.i(BuildConfig.APPLICATION_ID, "User Mobile number : "+daggerPresenter.getUserMobile());
    }
}
