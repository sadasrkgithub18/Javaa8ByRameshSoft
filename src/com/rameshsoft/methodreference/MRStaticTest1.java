package com.rameshsoft.methodreference;

import java.util.function.BiFunction;

public class MRStaticTest1 
{
    public static int add(int a,int b)
    {
    	int res = a + b;
    	return res;
    }
	
	
	public static void main(String[] args) 
	{
	
	 //1. Way using Lambda
	 BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {
		 int res = a + b;
		 return res;
	 };
	 
	 int res = biFunction.apply(25, 75);
	 System.out.println("Result is: "+res);
	 
	 System.out.println("=============================");
		
	 //2. Way using method reference
	 BiFunction<Integer, Integer, Integer> biFunction2 = MRStaticTest1::add;
	 int result = biFunction2.apply(100, 100);
	 System.out.println("Result is: "+result);
	 
	}

}
