package com.greetty.weatherassiant.http.util;

import com.greetty.weatherassiant.constant.NetConstant;
import com.greetty.weatherassiant.http.api.ApiStore;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by Greetty on 2017/11/11.
 * <p>
 * RetrofitUtil
 */
public class RetrofitUtil {

    private static final String BASE_URL = NetConstant.BASE_URL;

    private static Retrofit mRetrofit;
    private static ApiStore mApiStore;
    private static OkHttpClient mOkHttpClient;

    private static Retrofit getRetrofit() {
        if (mOkHttpClient == null)
            mOkHttpClient = new OkHttpClient();

        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .client(mOkHttpClient)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public static ApiStore getApiStore() {
        if (mApiStore == null) {
            mApiStore = getRetrofit().create(ApiStore.class);
        }
        return mApiStore;
    }

}
