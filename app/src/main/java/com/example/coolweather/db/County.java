package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author DZJ
 * @CreateTime 2018/8/27 19:41
 * @Discription
 */
public class County extends DataSupport{
    private int id;
    private String countyname;
    private String weatherid;
    private int cityid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

}
