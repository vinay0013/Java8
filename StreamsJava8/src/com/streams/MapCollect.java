package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapCollect {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		List<User> userList = names.stream().map(User::new).collect(Collectors.toList());
		userList.forEach(s->System.out.println(s.name+" "+s.age));
		int a=(int) userList.stream().mapToInt(n->n.age).count();
		System.out.println(a);
		Converter converter=MapCollect::print;
		System.out.println();
	}
	
	public static String print(){
		return "void";
	}
	public static String print(String s1){
		return s1;
	}
	public String print (String s1,String s2){
		return s1+" + "+s2;
	}

}

@FunctionalInterface
interface Converter {
    void convert();
}
