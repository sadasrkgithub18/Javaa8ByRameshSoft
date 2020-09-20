package com.rameshsoft.optional;

import java.util.Optional;

public class OptionalTest2 
{

	public static void main(String[] args) 
	{
	  String[] s = {"JAVA","Selenium",null,"Cucumber"};
	  
	  for(int i=0; i<s.length; i++)
	  {
		  Optional<String> optional = Optional.ofNullable(s[i]);
		  
		  if(optional.isPresent())
		  {
			  System.out.println(optional.get().toUpperCase());
		  }
		  else
		  {
			  System.out.println("Value is not available at: "+s[i]);
		  }
	  }
	}

}
