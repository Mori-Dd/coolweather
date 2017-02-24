package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 当前天气的信息
 * Created by lgh on 2017/2/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
