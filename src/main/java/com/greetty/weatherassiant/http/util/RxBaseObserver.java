package com.greetty.weatherassiant.http.util;

import android.widget.Toast;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by Greetty on 2017/11/11.
 */
public abstract class RxBaseObserver<T> implements Observer<T>, RxISubscriber<T> {

    public static final String errorMsg_SocketTimeoutException = "网络链接超时，请检查您的网络状态，稍后重试！";
    public static final String errorMsg_ConnectException = "网络链接异常，请检查您的网络状态";
    public static final String errorMsg_UnknownHostException = "网络异常，请检查您的网络状态";

    protected void doOnNetError() {

    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        doOnSubscribe(d);
    }

    @Override
    public void onNext(@NonNull T t) {
        doOnNext(t);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        if (e instanceof SocketTimeoutException) {
            setError(errorMsg_SocketTimeoutException);
        } else if (e instanceof ConnectException) {
            setError(errorMsg_ConnectException);
        } else if (e instanceof UnknownHostException) {
            setError(errorMsg_UnknownHostException);
        } else {
            doOnError(e.getMessage());
        }
    }

    @Override
    public void onComplete() {
        doOnCompleted();
    }

    private void setError(String errorMsg) {
        doOnNetError();
    }
}
