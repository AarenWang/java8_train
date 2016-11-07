package me.wrj.java8.language.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InconvenientClass {

	public static void main(String[] args) {
		
		//使用匿名内部类来
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}

		}).start();

		
		
		List<String> nameList = Arrays.asList("a","b","c");
		nameList.forEach(str -> System.out.println(str));
		
		List<String> upperNameList = new ArrayList<String>();
		for(String name : nameList){
		    upperNameList.add(name.toLowerCase());
		}
		
		// 使用lambda表达式
        new Thread(
                () -> System.out.println(Thread.currentThread().getName())

        ).start();
        
        
        //使用流操作
		nameList.stream().map(str -> str.toUpperCase());
		
		
	}

}
