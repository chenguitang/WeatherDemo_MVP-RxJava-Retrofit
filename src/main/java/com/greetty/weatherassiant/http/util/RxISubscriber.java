package com.greetty.weatherassiant.http.util;

import io.reactivex.disposables.Disposable;

/**
 * RxISubscriber
 *
 * @param <T> T
 */
public interface RxISubscriber<T> {

    void doOnSubscribe(Disposable d);

    void doOnError(String errorMsg);

    void doOnNext(T t);

    void doOnCompleted();
}
