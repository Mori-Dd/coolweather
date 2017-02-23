package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**记录省级信息
 * Created by lgh on 2017/2/23.
 */

public class Province extends DataSupport {
    private int id;//实体类字段
    private String provinceName;//省名字
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }



}
