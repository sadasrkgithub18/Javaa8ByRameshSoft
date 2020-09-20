package com.rameshsoft.predicateInterface;

import java.util.function.Predicate;

public class PredicateInterfaceConcept implements Predicate<Integer>
{
	@Override
	public boolean test(Integer t) 
	{
		boolean status = true;
		if(t == 100)
		{
			System.out.println("Equals");
			status = true;
		}
		else
		{
			System.out.println("Not Equals");
			status = false;
		}
		
		return status;
	}
	
	public static void main(String[] args)
	{
		Predicate<Integer> function = new PredicateInterfaceConcept();
		function.test(100);
	}


}
