package com.lambda.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Mathew", "Arnold"), new Person("Lewis", "Carroll"),
				new Person("Charles", "Dickens"), new Person("Thomas", "Carlyle"), new Person("Charlotte", "Bronte"));
		
//		Collections.sort(people, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person arg0, Person arg1) {
//				// TODO Auto-generated method stub
//				return arg0.getLastname().compareTo(arg1.getLastname());
//			}
//
//		});
		
		Collections.sort(people, ( arg0,  arg1) -> arg0.getLastname().compareTo(arg1.getLastname()));
		
		for(Person p: people){
		System.out.println(p.firstName+" "+p.lastname);	
		}
		
		MyInterface objInterface=(str)->System.out.println(str);
		objInterface.printIt("Hello lambda");
		
		MyClass objMyClass=new MyClass();
		objMyClass.testListener(new MyInterface() {
			
			@Override
			public void printIt(String text) {
				System.out.println(text);
				
			}
		});
		objMyClass.testListener( test -> System.out.println(test));
	}

}
