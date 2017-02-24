package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 记录县的信息
 * Created by lgh on 2017/2/23.
 */

public class County extends DataSupport{
    private int id;//实体类字段
    private String countyName;//县名字
    private String weatherId;//当前县的天气id
    private int cityId;//当前县所属市的id值

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }



    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
