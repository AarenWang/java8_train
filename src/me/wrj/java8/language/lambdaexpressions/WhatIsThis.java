package me.wrj.java8.language.lambdaexpressions;

public class WhatIsThis {

    void checkThis() {
        System.out.println("outer " + this);

        new Thread(new Runnable() {

            public void run() {
                System.out.println("inner " + this);
                printThis();
            }
        }).start();

        new Thread(() -> {
            System.out.println("in lambda " + this);
        }).start();
    }

    void printThis() {
        System.out.println("from printThis() " + this);
    }

    public static void main(String[] args) {
        new WhatIsThis().checkThis();
    }
}
