package me.wrj.java8.language.methodreference;

public class InterfaceInherit {

}

interface MyInterface1{
	
	default void test(String str){
		System.out.println("MyInterface1 "+str);
	}
}

interface MyInferface2{
	
	default void test(String str){
		System.out.println("MyInterface2 "+str);
	}
}

interface SubInterface extends MyInterface1,MyInferface2{

	@Override
	default void test(String str) {
		MyInferface2.super.test(str);
	}
	
}

class SubClass implements  MyInterface1,MyInferface2{

	@Override
	public void test(String str) {
		MyInterface1.super.test(str);
	}
	
}