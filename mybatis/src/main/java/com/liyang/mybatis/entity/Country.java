package com.liyang.mybatis.entity;

/**
 * @author LiYang
 * @version V1.0
 * @className entity
 * @description TODO
 * @date 2021/3/1 21:58
 */
public class Country {
    private Integer id;
    private String countryName;
    private String countryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
