package ru.mirea.inbo0319.pr1;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tuzik", 15);
        Dog d2 = new Dog("Barbos", 21);
        d1.printHumanAge();
        d2.setAge(10);
        System.out.println(d2);
    }
}
