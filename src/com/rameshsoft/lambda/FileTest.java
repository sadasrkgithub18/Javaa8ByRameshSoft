package com.rameshsoft.lambda;

public class FileTest 
{

	public static void main(String[] args) 
	{
		//1. Way without using Lambda
//		Practice practice = new PracticeImpl();
//		practice.job();
//		
		//2. Way using Lambda
		Practice practice2 = () -> {
			System.out.println("Selenium");
		};
		practice2.job();
		
		
		
 	}

}
