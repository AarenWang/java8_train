package me.wrj.java8.language.lambdaexpressions;

public class VarAccess {

	public static void main(String[] args) {
		
		// Java 8 以前 i 必须用final修饰
		int i = 0;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				//i = 1; 都不能对i进行赋值
			}
		});
		
		
		new Thread( () -> {
			System.out.println(i);
		});
}

}
