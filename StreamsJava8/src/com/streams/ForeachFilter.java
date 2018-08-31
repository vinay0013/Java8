package com.streams;

import java.util.Arrays;
import java.util.List;

public class ForeachFilter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		names.stream().filter(ForeachFilter::isNotSame).forEach(System.out::println);
	}

	private static boolean isNotSame(String name) {
		if (!name.equals("Sam"))
			return true;
		else
			return false;
	}
}
