package com.rameshsoft.functionInterface;

import java.util.function.Function;

public class FunctionInterfaceConcept implements Function<String, Integer>
{

	@Override
	public Integer apply(String t) 
	{
		return t.length();
	}
	
	public static void main(String[] args) 
	{
		Function<String, Integer> function = new FunctionInterfaceConcept();
		int length = function.apply("Rameshsoft");
		System.out.println("Length is: "+length);
	}

	

}
