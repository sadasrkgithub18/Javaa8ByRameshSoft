package com.rameshsoft.supplierInterface;

import java.util.function.Supplier;

public class SupllierCon 
{

	public static void main(String[] args) 
	{
	  Supplier<Double> supplier = () -> {
		  return  Math.random();
	  };
	  
	  double d = supplier.get();
	  System.out.println(d);
	}

}
