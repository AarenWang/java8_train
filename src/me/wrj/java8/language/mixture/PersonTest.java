package me.wrj.java8.language.mixture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getFirstName().compareTo(p2.getFirstName());
	}
	
}

public class PersonTest {
	

	public static <T> void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ted", "Neward", 42), new Person("Charlotte", "Neward", 39),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Neal", "Ford", 45), new Person("Candy", "Ford", 39), new Person("Jeff", "Brown", 43),
				new Person("Betsy", "Brown", 39)

		);
		
		// 写法一
		PersonComparator pComparator = new PersonComparator();
		Collections.sort(list, pComparator);

		//写法二
		Comparator<Person> firstNameComparator = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
			
		};
		
		Collections.sort(list, firstNameComparator);
		
		// 写法三
		Collections.sort(list,new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		});
		
		// 写法四 用lambda表达式代替内部类
		Collections.sort(list, (Person p1,Person p2) -> {
			return p1.getFirstName().compareTo(p2.getFirstName());
			
		});
		
		
		// 写法五 用lambda表达式代替内部类 省略lambda表达式参数类型
		Collections.sort(list, (p1,p2)-> {
			return p1.getFirstName().compareTo(p2.getFirstName());
			
		});
		
		// 写法六 Comparator接口comparing方法生成比较器
		Collections.sort(list, Comparator.comparing(Person::getFirstName));
		
		
		//继续比较  thenComparing
		Collections.sort(list, Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
		
		
		
	}

}
