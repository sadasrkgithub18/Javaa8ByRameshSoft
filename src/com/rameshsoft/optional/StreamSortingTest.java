package com.rameshsoft.optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingTest 
{

	public static void main(String[] args) 
	{
	
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(50);
		data.add(150);
		data.add(550);
		data.add(350);
		data.add(250);
		
		
		//1. Natural Sorting
		List<Integer> data1 = data.stream().sorted().collect(Collectors.toList());
		
		for(int i : data1)
		{
			System.out.println(i);
		}
		
		System.out.println("============================");
		
		data1.forEach(s -> System.out.println(s));
		
		System.out.println("============================");
		
		data1.forEach(System.out::println);
		
		System.out.println("=========================================");
		
		//2. Descending order
		Comparator<Integer> comp = (a,b) -> -a.compareTo(b);
		List<Integer> data2 = data.stream().sorted(comp).collect(Collectors.toList());
		
		
		for(int i : data2)
		{
			System.out.println(i);
		}
		
		System.out.println("============================");
		
		data2.forEach(s -> System.out.println(s));
		
		System.out.println("============================");
		
		data2.forEach(System.out::println);
		
		System.out.println("=========================================");
		
	}

}
