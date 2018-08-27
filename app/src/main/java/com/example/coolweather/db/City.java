package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author DZJ
 * @CreateTime 2018/8/27 19:38
 * @Discription
 */
public class City extends DataSupport{
    private int id;
    private String provinceid;
    private  String cityname;
    private int citycode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }
}
