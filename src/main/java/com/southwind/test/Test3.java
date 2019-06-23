package com.southwind.test;

import com.southwind.entity.Book;
import com.southwind.entity.Course;
import com.southwind.entity.Customer;
import com.southwind.repository.BookRepository;
import com.southwind.repository.CustomerRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test3.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        BookRepository bookRepository = sqlSession.getMapper(BookRepository.class);
        CustomerRepository customerRepository = sqlSession1.getMapper(CustomerRepository.class);
        List<Course> courses = customerRepository.findById(3);
        System.out.println(courses);
        Book book = bookRepository.findById(5);
        System.out.println(book);
        sqlSession.commit();
    }
}
