package com.example.myapplication;

public class MyModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name = "";
    int age = 0;
}
