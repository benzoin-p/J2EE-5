package com.demo.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * mybatis配置
 *
 * 由于引入了mybatis-spring，已废弃
 * @author DeaDLockey
 * @date 2022/10/31
 */
public class MyBatisConfig {
    public static SqlSession getSession()
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try
        {
            inputStream = Resources.getResourceAsStream(resource);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }
}
