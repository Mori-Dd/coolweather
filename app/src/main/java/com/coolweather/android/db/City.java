package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 记录市的信息
 * Created by lgh on 2017/2/23.
 */

public class City extends DataSupport{
    private int id;//实体类字段
    private String cityName;//市名字
    private int cityCode;//市的代号
    private int provinceId;//当前市所属省的id值

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }



    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
