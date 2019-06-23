package com.southwind.repository;

import com.southwind.entity.Course;
import com.southwind.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Course> findById(int cid);
    public Customer findAll(int id);
}
