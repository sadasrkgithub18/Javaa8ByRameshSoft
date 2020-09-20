package com.rameshsoft.biInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceConcept 
{

	public static void main(String[] args) 
	{
	  BiConsumer<Integer, Integer> biConsumer = (a,b) -> {
		  int res = a + b;
		  System.out.println("Result is: "+res);
	  };
	  
	  biConsumer.accept(50, 50);
	}

}
