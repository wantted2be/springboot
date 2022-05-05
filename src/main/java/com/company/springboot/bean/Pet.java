package com.company.springboot.bean;

/**
 * @Author wlb10
 * @PackageName boot-01-helloworld
 * @Package com.company.springboot.bean
 * @Date 2022/4/28 9:41
 * @Version 1.0
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
