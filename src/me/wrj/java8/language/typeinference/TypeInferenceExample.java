package me.wrj.java8.language.typeinference;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TypeInferenceExample {
	
	Map<String, Object> map1 = new HashMap<>();
	
	Map<String, Object> map2 = new HashMap<String, Object>();
	
	public static void main(String[] args) {
		
		Comparator<String> comparator = (String str1,String str2) -> {
			return str1.compareTo(str2);
		};
		
		// str1 str2 的String类型申明可以省略
		Comparator<String> comparator2 = (str1,str2) -> {
			return str1.compareTo(str2);
		};
		
		
		
	}


}
