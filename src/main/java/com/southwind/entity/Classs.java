package com.southwind.entity;

import java.util.List;

public class Classs {
    private int id;
    private String name;
    private List<Student1> student1s;

    public List<Student1> getStudent1s() {
        return student1s;
    }

    public void setStudent1s(List<Student1> student1s) {
        this.student1s = student1s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
