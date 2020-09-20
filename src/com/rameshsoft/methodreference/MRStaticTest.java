package com.rameshsoft.methodreference;

public class MRStaticTest 
{
    public static void job()
    {
    	System.out.println("Java with Selenium");
    }
	
	public static void main(String[] args) 
	{
		//1. Way using Lambda
		Practice practice = ()-> {
			System.out.println("Keep trying....!!!!!!");
		};
		
		practice.test();
		
		System.out.println("=============================");
		
		//2. Way using method reference
		Practice practice2 = MRStaticTest::job;
		practice2.test();
	}

}
