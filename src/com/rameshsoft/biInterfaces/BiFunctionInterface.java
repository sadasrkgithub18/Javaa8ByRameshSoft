package com.rameshsoft.biInterfaces;

import java.util.function.BiFunction;

public class BiFunctionInterface 
{

	public static void main(String[] args) 
	{
	  BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {
		  int res = a + b;
		  return res;
	  };
	  
	  int res = biFunction.apply(50, 150);
	  System.out.println("Result is: "+res);
	}

}
