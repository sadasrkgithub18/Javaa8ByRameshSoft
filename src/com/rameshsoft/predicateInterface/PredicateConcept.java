package com.rameshsoft.predicateInterface;

import java.util.function.Predicate;

public class PredicateConcept 
{

	public static void main(String[] args) 
	{
		
		Predicate<Integer> predicate = (ele) -> {
			boolean status = false;
			if(ele == 20)
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
		};
		
		//predicate.test(30);
		System.out.println(predicate.test(30));
	}

}
