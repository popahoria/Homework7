package com.fasttrack;


public class Person {
    private String name = "";
    private int age = 0;
    private Boolean isMarried = false;

    public Person(String name, int age, Boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isMarried() {
        return this.isMarried;

    }

    @Override
    public String toString() {
        return "Person " +
                "name = " + name + '\'' +
                ", age = " + age +
                ", isMarried = " + isMarried;
    }
}

