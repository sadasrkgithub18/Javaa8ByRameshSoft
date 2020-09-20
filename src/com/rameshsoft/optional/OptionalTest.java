package com.rameshsoft.optional;

import java.util.Optional;

public class OptionalTest 
{

	public static void main(String[] args) 
	{
	  String s = "SRK";
	  String ss = null;
	  
	  //1. 
	  Optional<String> optional = Optional.ofNullable(ss);
	  
	  if(optional.isPresent())
	  {
		  System.out.println(optional.get());
	  }
	  else
	  {
		  System.out.println("Value is not available");
	  }
	  
	  System.out.println("==================================");
	  
      Optional<String> optional2 = Optional.of(ss);
	  
	  if(optional2.isPresent())
	  {
		  System.out.println(optional.get());
	  }
	  else
	  {
		  System.out.println("Value is not available");
	  }
	
	  
	}

}
