package me.wrj.java8.language.scope;

public class Test2 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(this.getClass());

			}
		}).start();

		new Thread(() -> {
			
			
		}).start();
	}

}
