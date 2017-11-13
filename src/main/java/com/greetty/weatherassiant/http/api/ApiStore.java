package com.greetty.weatherassiant.http.api;

import com.greetty.weatherassiant.model.WeatherDetails;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


/**
 * Created by Greetty on 2017/11/11.
 */
public interface ApiStore {

//    @FormUrlEncoded
//    @POST("open/api/weather/json.shtml")
//    Observable<WeatherDetails> findCityWeatherDetails(@Field("city") String city);

    @GET("open/api/weather/json.shtml?")
    Observable<WeatherDetails> findCityWeatherDetails(@Query("city") String city);


}
