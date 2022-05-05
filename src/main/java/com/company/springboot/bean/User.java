package com.company.springboot.bean;

import javax.print.DocFlavor;

/**
 * @Author wlb10
 * @PackageName boot-01-helloworld
 * @Package com.company.springboot.bean
 * @Date 2022/4/28 9:40
 * @Version 1.0
 */
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
