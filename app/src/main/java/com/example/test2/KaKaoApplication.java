package com.example.test2;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KaKaoApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init( this, "3d5cb5c66f52569ea7303d1b258dec7d");

    }
}
