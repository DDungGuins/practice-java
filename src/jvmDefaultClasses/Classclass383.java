package jvmDefaultClasses;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Classclass383 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class classPerson2 = Class.forName("jvmDefaultClasses.Person2");//처음엔 이렇게 했 다..
		Constructor [] cons = classPerson2.getConstructors();
		Field [] fields = classPerson2.getFields();
		Method[] methods = classPerson2.getMethods();
		
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		for (Field f : fields) {
			System.out.println(f);
			
		}
				
		for (Method m : methods) {
			System.out.println(m);
			
		}
		// 개멋있어..PWD password
//		
//		Person2 person1 = new Person2();
//		Class pclass = Class.forName("jvmDefaultClasses.Person2");
//		Person2 person2=(Person2)pclass.newInstance();
//		System.out.println(person1);
//		System.out.println(person2);
//	
	}

}

class Person2 {

	private String name; 
	private int age;
	
	public Person2 ( ) {
		
	}
	
	public Person2(String name) {
		this.name=name;
	
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
