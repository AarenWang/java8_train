package me.wrj.java8.language.functionalinterface;


@FunctionalInterface
public interface EwalletPayService {

	public String pay(String orderId);
	
	public  String toString();
	
	//public  String toString2();

  
}
