package com.sxj.testMyBatis;

import com.sxj.testMyBatis.domain.User;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

@Log4j
public class Test {

    public static  void main(String[] args) throws  Exception{
        String resource = "testMybatis/mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory fact = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sqlSession = fact.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(2);
        log.info("User: "+user);
    }

}
