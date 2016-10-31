package me.wrj.java8.language.lambdaexpressions;

import java.util.function.Consumer;

public class TargetType {

    public static void main(String[] args) {
        IntOperation twice = x -> x * 2;
        IntOperation square = x -> x * x;
        System.out.println(twice.operate(3));
        System.out.println(square.operate(3));

        // lambda必须是函数式接口实例
        // Object o = x -> System.out.println(x);

        Consumer<?> c = x -> System.out.println(x);
        Object o = c;
    }
}

interface IntOperation {

    int operate(int i);
}
