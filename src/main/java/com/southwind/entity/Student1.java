package com.southwind.entity;

public class Student1 {
    private int id;
    private String name;
    private Classs classs;

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

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classs=" + classs +
                '}';
    }
}
