package com.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapOptional {

	public static void main(String[] args) {
		List<User> userList = Arrays.asList(new User("Sam", 20, Arrays.asList("12", "21")),
				new User("John", 23, Arrays.asList("13", "31")), new User("Peter", 21, Arrays.asList("14", "41")),
				new User("Adam", 22, Arrays.asList("11", "11")));
		Optional<String> optionalList = userList.stream().map(user -> user.getProjId().stream())
				.flatMap(stringStream -> stringStream.filter(a -> a.equals("14"))).findAny();
		userList.stream().filter(a -> a.getProjId().contains("14")).forEach(a -> System.out.println(a.getName()));
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		 // Creating a list of Prime Numbers 
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = 
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  listOfListofInts); 
          
        // Using flatMap for transformating and flattening. 
        List<Integer> listofInts  = listOfListofInts.stream() 
                                    .flatMap(list -> list.stream()) 
                                    .collect(Collectors.toList()); 
  
        System.out.println("The Structure after flattening is : " + 
                                                         listofInts);

		//get count of empty string
		int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		
		 String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
	      System.out.println("Merged String: " + mergedString);
	      
	      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
	      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
			
	      System.out.println("Highest number in List : " + stats.getMax());
	      System.out.println("Lowest number in List : " + stats.getMin());
	      System.out.println("Sum of all numbers : " + stats.getSum());
	      System.out.println("Average of all numbers : " + stats.getAverage());
	      System.out.println("Random Numbers: ");

	}

}
