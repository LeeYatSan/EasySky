package com.easysky.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    /*
    Entity Id
     */
    private int id;

    /*
    County Name
     */
    private String countyName;

    /*
    Weather Id
     */
    private String weatherId;

    /*
    City Id
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

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
}
