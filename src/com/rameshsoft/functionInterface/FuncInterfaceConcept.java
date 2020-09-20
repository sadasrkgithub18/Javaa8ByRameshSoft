package com.rameshsoft.functionInterface;

import java.util.function.Function;

public class FuncInterfaceConcept 
{

	public static void main(String[] args) 
	{
		Function<String, Integer> function = (String s)->{
			int length = s.length();
			return length;
		};
		
		int len  = function.apply("Rameshsoft");
		System.out.println("Length is:"+len);
	}

}
