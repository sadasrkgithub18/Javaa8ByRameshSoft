package com.rameshsoft.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest 
{

	public static void main(String[] args) 
	{
	  List<String> data = new ArrayList<String>();
	  data.add("Java 8");
	  data.add("Java 9");
	  data.add("BDD");
	  data.add("Jenkins");
	  data.add("Maven");
	  
	  
	 List<String> data1 =  data.stream().filter(s->s.length()>=5).collect(Collectors.toList());
	  data1.forEach(System.out::println);
	  
	  System.out.println("==========================");
	  
	  data1.forEach(s-> System.out.println(s));
	  
	  
	}

}
