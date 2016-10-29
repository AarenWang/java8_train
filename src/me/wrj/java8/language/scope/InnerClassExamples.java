package me.wrj.java8.language.scope;

public class InnerClassExamples {

	public static void main(String... args) {
		Hello h = new Hello();
		h.r.run();
		System.out.println(h);
		
		Hello2 h2 = new Hello2();
		h2.r.run();
		System.out.println(h2);
	}
}

class Hello {
	public Runnable r = new Runnable() {
		public void run() {
			System.out.println(this);
			System.out.println(toString());
			
		}
	};

	public String toString() {
		return "Hello's custom toString()";
	}
}

class Hello2 {
	  public Runnable r = () -> {
	      System.out.println(this);
	      System.out.println(toString());
	    };

	  public String toString() {
	    return "Hello2's custom toString()";
	  }
	} 
