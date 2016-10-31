package me.wrj.java8.language.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class VarAccess {

    public static void main(String[] args) {

        // Java 8 以前 i 必须用final修饰
        int i = 0;
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(i);
                // i = 1; 都不能对i进行赋值
            }
        });

        int j = 1;
        new Thread(() -> {
            System.out.println(j);
            // j = 1;不能对j进行赋值 官方名称为"effectively final"
               });

        List<String> words = Arrays.asList("China", "American,Britain");
        int sumLength = 0;
        // 无法通过下面方法求字符串长度之和
        // words.forEach(str -> sumLength += str.length());

        // 需要通过map reduce来计算长度之和
        words.stream().map(str -> str.length()).reduce(0, (a, b) -> a + b);

    }

}
