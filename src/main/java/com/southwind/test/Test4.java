package com.southwind.test;

import com.southwind.entity.Classs;
import com.southwind.entity.Student1;
import com.southwind.repository.Student1Repository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        InputStream inputStream = Test4.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student1Repository student1Repository = sqlSession.getMapper(Student1Repository.class);
        List<Student1> student1 = student1Repository.findById();
        for (Student1 student11: student1) {
            System.out.println(student11);
        }
        List<Classs> classes = student1Repository.findAll();
        for (Classs classs1 : classes) {
            System.out.println(classs1);
        }
    }
}
