package com.lambda.multipleparam;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample5 {
	public static void main(String[] args) {  
        
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(a, b)->(a*b);  
        System.out.println(ad2.add(5,7));  
        
        
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai"); 
        
        list.forEach(  
                (n)->System.out.println(n)  
            );  
    }  
}
