package com.easysky.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    /*
    Entity Id
     */
    private int id;

    /*
    City Name
     */
    private String cityName;


    /*
    City Code
     */
    private int cityCode;

    /*
    Province Id
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
