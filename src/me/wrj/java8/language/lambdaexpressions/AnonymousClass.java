package me.wrj.java8.language.lambdaexpressions;

public class AnonymousClass {

	public static void main(String[] args) {
		
		//使用匿名内部类来
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}

		}).start();

		// 使用lambda表达式
		new Thread(
				() -> System.out.println(Thread.currentThread().getName())

		).start();
	}

}
