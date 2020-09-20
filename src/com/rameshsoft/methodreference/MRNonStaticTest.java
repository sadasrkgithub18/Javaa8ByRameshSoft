package com.rameshsoft.methodreference;

public class MRNonStaticTest 
{
	public void job(String s)
	{
		System.out.println("If you do job: "+s);
	}

	public static void main(String[] args) 
	{
		
		 
		
		//2. Way using method reference
		MRNonStaticTest mrNonStaticTest = new MRNonStaticTest();
		Customer customer = mrNonStaticTest::job;
		mrNonStaticTest.job("You get Salary");
		customer.test("Sal");
	}

}
