package ru.mirea.inbo0319.pr1;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", " + this.age;
    }
    public void printHumanAge() {
        System.out.println(name + " is " + 7*age + " in human years!");
    }
}
