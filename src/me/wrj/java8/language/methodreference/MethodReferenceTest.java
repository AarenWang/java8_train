package me.wrj.java8.language.methodreference;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTest {
	
	public static void main(String[] args) {
		 Function<String, String> upperfier = String::toUpperCase;
		 System.out.println(upperfier.apply("Hello"));
		 
		//集合元素判断
		 Set<String> knowNames = new HashSet<>();
		 knowNames.add("Zhang");
		 knowNames.contains("Zhang");

		 Predicate<String> isKnowName = knowNames::contains;
		 isKnowName.test("Zhang");
		 isKnowName.test("Li");
		 
		 Supplier<Thread> getThread = Thread::currentThread;
		 Thread thread = getThread.get();
		 System.out.println(thread.getName());
		 
		 Supplier<String> supplier = String::new;
		 System.out.println("supplier="+supplier.get());
		 
	}

}
