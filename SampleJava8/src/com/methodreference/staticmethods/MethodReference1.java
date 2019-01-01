package com.methodreference.staticmethods;

import java.util.function.BiFunction;

public class MethodReference1 {
	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference1::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
        BiFunction<Float, Float, Float>adder3 = Arithmetic::add; 
        
        int result = adder.apply(10, 20);  
        float result2 = adder2.apply(10, 20.0f);  
        float result3 = adder3.apply(10.0f, 20.0f);  
        System.out.println(result); 
        System.out.println(result2);  
        System.out.println(result3); 
        
        
    }  
}
