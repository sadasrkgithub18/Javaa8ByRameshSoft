package com.rameshsoft.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest 
{

	public static void main(String[] args) 
	{
	
		List<Integer> data = new ArrayList<Integer>();
		data.add(20);
		data.add(50);
		data.add(10);
		data.add(40);
		data.add(30);
		
		
		List<Integer> data1 = data.stream().map(m -> m*2).collect(Collectors.toList());
		
		data1.forEach(System.out::println);
		System.out.println("====================");
		data1.forEach(s-> System.out.println(s));
	}

}
