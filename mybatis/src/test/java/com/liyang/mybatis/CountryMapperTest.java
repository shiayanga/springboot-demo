package com.liyang.mybatis;

import com.liyang.mybatis.entity.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.io.Reader;
import java.util.List;

/**
 * @author LiYang
 * @version V1.0
 * @className CountryMapperTest
 * @description TODO
 * @date 2021/3/1 22:24
 */

public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init() {
        try {
            // 读入 mybatis 配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            // 创建sqlSessionFactory的过程中，通过读取配置文件中的mapper.xml进行具体方法的解析，SQLSessionFactory就包含了所有的属性配置和执行SQL的信息
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            // selectList方法查找到ID为queryAll的方法，执行SQL
            List<Country> countryList = sqlSession.selectList("queryAll");
            for (Country country : countryList) {
                System.out.println(country.getCountryCode() + "\t" + country.getCountryName());
            }
            sqlSession.close();
        } catch (Exception e) {
            sqlSession.close();
            e.printStackTrace();
        }
    }
}
