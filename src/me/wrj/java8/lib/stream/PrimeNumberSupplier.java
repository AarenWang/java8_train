package me.wrj.java8.lib.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeNumberSupplier implements Supplier<Long> {

	public static void main(String[] args) {
		Stream<Long> fibonacci = Stream.generate(new PrimeNumberSupplier());
		fibonacci.limit(10).forEach(System.out::println);
	}

	long temp = 5;

	@Override
	public Long get() {
		boolean found = true;
		while (found) {
			boolean d = false;
			for (int i = 2; i < temp; i++) {
				if (temp % i == 0) {
					System.out.println("temp % i"+temp % i);
					d = true;
					break;
				}
			}
			if(d){
				temp++;
			} else {
				return temp;
			}
			
		}
		return temp;
	}

}
