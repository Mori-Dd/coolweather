package com.coolweather.android.gson;

/**
 * 当前空气质量情况
 * Created by lgh on 2017/2/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
