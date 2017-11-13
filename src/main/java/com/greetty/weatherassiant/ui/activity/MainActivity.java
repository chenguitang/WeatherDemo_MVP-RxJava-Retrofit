package com.greetty.weatherassiant.ui.activity;

import android.app.ProgressDialog;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.greetty.weatherassiant.R;
import com.greetty.weatherassiant.base.BaseActivity;
import com.greetty.weatherassiant.contract.HomeContract;
import com.greetty.weatherassiant.model.WeatherDetails;
import com.greetty.weatherassiant.presenter.HomePresenter;
import com.greetty.weatherassiant.ui.adapter.ViewPagerAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements HomeContract.IHomeView {

    @BindView(R.id.vp_weather)
    ViewPager vpWeather;
    @BindView(R.id.et_city)
    EditText etCity;

    private static final String TAG = "MainActivity";

    private HomePresenter mHomePresenter;
    private ProgressDialog mProgressDialog = null;
    private ViewPagerAdapter mViewpagerAdapter;
    private String cityName;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        super.initData();
        mHomePresenter = new HomePresenter(this);
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("正在加载数据，请稍等。。。");
    }

    @OnClick(R.id.btn_get_weather)
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_weather:
                cityName = etCity.getText().toString();
                if (TextUtils.isEmpty(cityName))
                    showToast("城市名字不能为空，请输入您要查询的城市名字");
                else
                    mHomePresenter.loadData(cityName);
                break;
            default:
                break;

        }
    }


    @Override
    public void showProgress() {
        if (mProgressDialog != null)
            if (!mProgressDialog.isShowing()) {
                mProgressDialog.show();
            }
    }

    @Override
    public void dismissProgress() {
        if (mProgressDialog != null)
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
    }

    @Override
    public void loadDataSuccess(WeatherDetails data) {
        Log.e(TAG, "加载返回数据，结果码: " + data.getStatus());
        if (data.getStatus() == 200) {
            showToast("加载成功");
            Log.e(TAG, "返回数据日期: " + data.getDate());
            Log.e(TAG, "返回的数据为>>>昨天天气为：" + data.getData().getYesterday().toString());
            Log.e(TAG, "返回的数据为>>>感冒提示：" + data.getData().getGanmao());
            Log.e(TAG, "返回的数据为>>>温度提示：" + data.getData().getWendu());
            Log.e(TAG, "返回的数据为>>>城市：" + data.getCity());
            List<WeatherDetails.DataBean.ForecastBean> forecasts = data.getData().getForecast();
            for (int i = 0; i < forecasts.size(); i++) {
                Log.e(TAG, "返回的数据为>>>天气预报：" + forecasts.get(i).toString());
            }
            mViewpagerAdapter = new ViewPagerAdapter(MainActivity.this, data);
            vpWeather.setAdapter(mViewpagerAdapter);
            vpWeather.setCurrentItem(1);
        } else {
            Log.e(TAG, "加载失败: " + data.getMessage());
            showToast("加载失败");
        }
    }

    @Override
    public void loadDataError(Throwable throwable) {
        showToast("出错了：" + throwable.getMessage());
        Log.e(TAG, "出错了: " + throwable.getMessage());
    }
}
