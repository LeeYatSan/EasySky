package com.easysky.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    /*
    Entity ID
     */
    private int id;

    /*
    Province Name
     */
    private String provinceName;

    /*
    Province Code
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
