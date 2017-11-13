package com.greetty.weatherassiant.ui.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greetty.weatherassiant.R;
import com.greetty.weatherassiant.model.WeatherDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Greetty on 2017/11/12.
 * <p>
 * ViewPagerAdapter
 */

public class ViewPagerAdapter extends PagerAdapter {

    //    private List<WeatherDetails.>
    private static final String TAG = "ViewPagerAdapter";
    private WeatherDetails mWeatherDetails;
    private Context mContext;
    private static HashMap<Integer, View> mViewPagers = new HashMap<>();
    //    List<View> mListView;
    private ViewHolders mViewHolder;

    public ViewPagerAdapter(Context context, WeatherDetails weatherDetails) {
        this.mWeatherDetails = weatherDetails;
        mContext = context;
//        mListView = new ArrayList<>(1+mWeatherDetails.getData().getForecast().size());
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        if (mViewPagers.get(position) == null) {
        View view = LayoutInflater.from(mContext).inflate(
                R.layout.viewpager_weather_detail, null);
        mViewHolder = new ViewHolders(view);
        if (position == 0) {
            mViewHolder.tv_date.setText(mWeatherDetails.getData().getYesterday().getDate());
            mViewHolder.tv_sunrise.setText(mWeatherDetails.getData().getYesterday().getSunrise());
            mViewHolder.tv_high.setText(mWeatherDetails.getData().getYesterday().getHigh());
            mViewHolder.tv_low.setText(mWeatherDetails.getData().getYesterday().getLow());
            mViewHolder.tv_sunset.setText(mWeatherDetails.getData().getYesterday().getSunset());
            mViewHolder.tv_fx.setText(mWeatherDetails.getData().getYesterday().getFx());
            mViewHolder.tv_fl.setText(mWeatherDetails.getData().getYesterday().getFl());
            mViewHolder.tv_type.setText(mWeatherDetails.getData().getYesterday().getType());
            mViewHolder.tv_notice.setText(mWeatherDetails.getData().getYesterday().getNotice());
            mViewPagers.put(position, view);
        } else {
            mViewHolder.tv_date.setText(mWeatherDetails.getData().getForecast().get(position - 1).getDate());
            mViewHolder.tv_sunrise.setText(mWeatherDetails.getData().getForecast().get(position - 1).getSunrise());
            mViewHolder.tv_high.setText(mWeatherDetails.getData().getForecast().get(position - 1).getHigh());
            mViewHolder.tv_low.setText(mWeatherDetails.getData().getForecast().get(position - 1).getLow());
            mViewHolder.tv_sunset.setText(mWeatherDetails.getData().getForecast().get(position - 1).getSunset());
            mViewHolder.tv_fx.setText(mWeatherDetails.getData().getForecast().get(position - 1).getFx());
            mViewHolder.tv_fl.setText(mWeatherDetails.getData().getForecast().get(position - 1).getFl());
            mViewHolder.tv_type.setText(mWeatherDetails.getData().getForecast().get(position - 1).getType());
            mViewHolder.tv_notice.setText(mWeatherDetails.getData().getForecast().get(position - 1).getNotice());
            mViewPagers.put(position, view);
        }
//        }
        Log.e(TAG, "position: " + position);

        container.addView(mViewPagers.get(position));
        return mViewPagers.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewPagers.get(position));
    }

    @Override
    public int getCount() {
        return 1 + mWeatherDetails.getData().getForecast().size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    private class ViewHolders {

        TextView tv_date;
        TextView tv_sunrise;
        TextView tv_high;
        TextView tv_low;
        TextView tv_sunset;
        TextView tv_fx;
        TextView tv_fl;
        TextView tv_type;
        TextView tv_notice;

        private ViewHolders(View view) {
            tv_date = (TextView) view.findViewById(R.id.tv_date);
            tv_sunrise = (TextView) view.findViewById(R.id.tv_sunrise);
            tv_high = (TextView) view.findViewById(R.id.tv_high_temperature);
            tv_low = (TextView) view.findViewById(R.id.tv_low_temperature);
            tv_sunset = (TextView) view.findViewById(R.id.tv_sunset);
            tv_fx = (TextView) view.findViewById(R.id.tv_fx);
            tv_fl = (TextView) view.findViewById(R.id.tv_fl);
            tv_type = (TextView) view.findViewById(R.id.tv_type);
            tv_notice = (TextView) view.findViewById(R.id.tv_notice);
        }
    }
}
