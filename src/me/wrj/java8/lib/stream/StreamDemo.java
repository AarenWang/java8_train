package me.wrj.java8.lib.stream;

import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.iterate(0, x -> x + 5);
		stream.forEach(x -> System.out.println(x));
	}

}
