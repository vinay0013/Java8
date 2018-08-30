package com.test;

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
		
		Collections.sort(people, (Person arg0, Person arg1) -> arg0.getLastname().compareTo(arg1.getLastname()));
		
		for(Person p: people){
		System.out.println(p.firstName+" "+p.lastname);	
		}
	}

}
