package com.southwind.test;

import com.southwind.entity.Course;
import com.southwind.entity.Customer;
import com.southwind.repository.CustomerRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
        List<Course> courses  = customerRepository.findById(1);
        Customer customer = customerRepository.findAll(1);
        System.out.println(courses);
        System.out.println(customer);
        sqlSession.commit();
    }
}
