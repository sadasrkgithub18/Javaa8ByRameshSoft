package com.rameshsoft.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamTest 
{

	public static void main(String[] args) 
	{
	
		List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		data.add(60);
		data.add(70);
		data.add(80);
		data.add(90);
		data.add(100);
		
		// data.parallelStream().forEach(s-> System.out.println(s));
		
		// data.stream().forEach(s-> System.out.println(s));
		
		List<Integer> data1 = data.parallelStream().filter(s-> s>20).collect(Collectors.toList());
		
		// System.out.println(data1);
		// data1.forEach(s -> System.out.println(s));
		// data1.forEach(System.out::println);
		
		
		// data.parallelStream().map(s->s*2).forEach(s-> System.out.println(s));
		
		// data.parallelStream().limit(5).forEach(System.out::println);
		
		// data.parallelStream().skip(5).forEach(System.out::println);
		
		// data.parallelStream().sorted().forEach(System.out::println);
		
		data.stream().limit(5).forEach(System.out::println);
		
	}

}
