package it.molveno.restaurant.sorting;

import java.util.Random;

public class Bird implements Comparable<Bird> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public Bird(String name) {

        this.name = name;
        this.age = new Random().nextInt(40);

    }

    public Bird() {
        this.name = "Raaf " + Double.valueOf(Math.random() * 100).byteValue();
    }

    @Override
    public String toString() {

        return "Bird{name:" + name + ",age:" + age + "}";
    }

    @Override
    public int compareTo(Bird other) {

        int nameDiff = this.name.compareTo(other.name);

        if (nameDiff != 0) {
            return nameDiff;
        } else {
            return this.age - other.age;
        }

    }

    public void setAge(int age) {
        this.age = age;
    }
}
