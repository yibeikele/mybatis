package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public void deleteByName(String name);
    public void save(Student student);
    public void update(Student student);
}
