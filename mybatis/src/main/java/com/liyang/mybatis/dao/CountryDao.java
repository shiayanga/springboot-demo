package com.liyang.mybatis.dao;

import com.liyang.mybatis.entity.Country;

import java.util.List;

/**
 * @author LiYang
 * @version V1.0
 * @className CountryDao
 * @description TODO
 * @date 2021/3/1 22:14
 */
public interface CountryDao {
    /**
     * 查询所有数据
     *
     * @return java.util.List<com.liyang.mybatis.entity.Country>
     * @author LiYang
     * @description
     * @date 2021/3/1 22:14
     **/
    List<Country> queryAll();
}
