package com.greetty.weatherassiant.contract;

import com.greetty.weatherassiant.base.BaseView;
import com.greetty.weatherassiant.model.WeatherDetails;

/**
 * Created by Greetty on 2017/11/11.
 */
public interface HomeContract extends BaseView {

    interface IHomeView {

        /**
         * 显示进度
         */
        void showProgress();

        /**
         * 隐藏进度
         */
        void dismissProgress();

        /**
         * 加载数据成功
         *
         * @param data 返回数据
         */
        void loadDataSuccess(WeatherDetails data);

        /**
         * 加载数据失败
         *
         * @param throwable 出错信息
         */
        void loadDataError(Throwable throwable);
    }

    interface IHomePresenter {
        /**
         * 加载天气数据
         *
         * @param city 城市
         */
        void loadData(String city);

        /**
         * 注销subscribe
         */
        void unSubscribe();
    }
}
