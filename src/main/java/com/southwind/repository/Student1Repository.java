package com.southwind.repository;

import com.southwind.entity.Classs;
import com.southwind.entity.Student1;

import java.util.List;

public interface Student1Repository {
    public List<Student1> findById();
    public List<Classs> findAll();

}
