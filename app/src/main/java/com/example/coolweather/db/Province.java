package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author DZJ
 * @CreateTime 2018/8/27 19:35
 * @Discription
 */
public class Province extends DataSupport {
    private int id;
    private String provincename;
    private int provincecode;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }
    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }

    public int getProvincecode() {
        return provincecode;
    }
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }
}
