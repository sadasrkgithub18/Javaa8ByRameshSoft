package com.rameshsoft.lambda;

public class FileTestStrLength 
{

	public static void main(String[] args) 
	{
	  JOB job = new JOBImpl();
	  int len = job.length("Selenium");
	  System.out.println("Length of string is: "+len);
	  
	  System.out.println("===============================");
	  
	  //2. Using Functional Interface
	  JOB job2 = (ele) -> {
		 int len2 = ele.length();
		 return len2;
	  };
	  
	  //1. way to get the length
	  int lent = job2.length("Cucumber");
	  System.out.println("Length is: "+lent);
	  
	  //2. Way to get length
	  System.out.println(job2.length("Cucumber"));
	}

}
