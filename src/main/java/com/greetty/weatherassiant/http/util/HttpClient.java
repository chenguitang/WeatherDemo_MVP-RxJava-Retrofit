package com.greetty.weatherassiant.http.util;


import com.greetty.weatherassiant.model.WeatherDetails;

import io.reactivex.Observable;


/**
 * Created by Greetty on 2017/11/11.
 *
 */
public class HttpClient extends RetrofitUtil {


    private HttpClient() {

    }

    private static final HttpClient HTTPCLIENT_INSTANCE = new HttpClient();

    public static HttpClient getInstance() {
        return HTTPCLIENT_INSTANCE;
    }


    public Observable<WeatherDetails> getWeather(String city) {
        Observable<WeatherDetails> cityWeatherDetails = getApiStore().findCityWeatherDetails(city);
        return cityWeatherDetails;
    }

}
