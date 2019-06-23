package com.southwind.test;


import com.southwind.entity.Student;
import com.southwind.entity.User;
import com.southwind.repository.StudentRepository;
import com.southwind.repository.UserRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        studentRepository.deleteByName("王五");
        Student student = new Student();
        student.setAge(14);
        student.setName("小六1");
        student.setMoney(10000);
        studentRepository.save(student);

        Student student2 = new Student();
        student2.setId(26);
        student2.setName("小紫紫");
        student2.setAge(11);
        student2.setMoney(1999);
        studentRepository.update(student2);
        List<Student> studentList = studentRepository.findAll();
        for (Student student1: studentList) {
            System.out.println(student1);
        }
        sqlSession.commit();













//        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        List<Student> studentList = null;
//        studentList =  studentRepository.findAll();
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

    }
//    public static void main(String[] args) {
//        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //调用mybatis原生接口执行SQL
//        String statement = "com.southwind.mapper.UserMapper.get";
//        User user = sqlSession.selectOne(statement,1);
//        System.out.println(user);


//        UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
//        User user = userRepository.findByName("张三");
//        System.out.println(user);
//        User user1 = userRepository.findByAge(11);
//        System.out.println(user1);
//        User user = new User();
//        user.setUsername("李四");
//        user.setPassword("1214134");
//        user.setAge(11);
//        int result = userRepository.save(user);
//        System.out.println(result);
//        User user1 = userRepository.findById(2);
//        System.out.println(user1);
//        int re = userRepository.deleteById(1);
//        System.out.println(re);
//        List<User> userList = userRepository.findAll();
//        for (User user2 : userList){
//            System.out.println(user2);
//        }
//        sqlSession.commit();
//    }
}
