package com.southwind.repository;

import com.southwind.entity.User;

import java.util.List;

public interface UserRepository {
    public int save(User user);
    public int deleteById(int id);
    public int update(User user);
    public User findById(int id);
    public List<User> findAll();
    public User findByName(String username);
    public User findByAge(Integer age);
}
