package ru.mirea.inbo0319.pr1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Football", false);
        Ball b2 = new Ball("Golf");

        System.out.println(b1);

        b2.setIsReadyBool(true);
        System.out.println(b2);
    }
}
