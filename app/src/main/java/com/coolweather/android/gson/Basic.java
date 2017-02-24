package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包含城市的一些基本信息
 * Created by lgh on 2017/2/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
