package com.greetty.weatherassiant.presenter;

import android.util.Log;

import com.greetty.weatherassiant.contract.HomeContract;
import com.greetty.weatherassiant.http.util.HttpClient;
import com.greetty.weatherassiant.model.WeatherDetails;

import org.reactivestreams.Subscriber;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Greetty on 2017/11/11.
 */
public class HomePresenter implements HomeContract.IHomePresenter {

    private static final String TAG = "HomePresenter";

    private HomeContract.IHomeView mHomeView;
    private Disposable mDisposable;

    public HomePresenter(HomeContract.IHomeView homeView) {
        this.mHomeView = homeView;
    }

    @Override
    public void loadData(String city) {
        HttpClient.getInstance().getWeather(city)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherDetails>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        mDisposable=d;
                        mHomeView.showProgress();
                        Log.d(TAG, "+++++++++++事件订阅了++++++++++");
                    }

                    @Override
                    public void onNext(@NonNull WeatherDetails weatherDetails) {
                        mHomeView.loadDataSuccess(weatherDetails);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mHomeView.loadDataError(e);
                        mHomeView.dismissProgress();
                    }

                    @Override
                    public void onComplete() {
                        mHomeView.dismissProgress();
                    }
                });

    }

    @Override
    public void unSubscribe() {
        mDisposable.dispose();
    }
}
