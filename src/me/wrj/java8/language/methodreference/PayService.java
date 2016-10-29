package me.wrj.java8.language.methodreference;


public interface PayService {
	
	
		default public  void printOrderInfo(String orderId){
			System.out.println(orderId);
		}
}
