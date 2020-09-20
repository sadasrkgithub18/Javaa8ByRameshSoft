package com.rameshsoft.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest 
{

	public static void main(String[] args) 
	{
	
		//1. Way
		/*String s[] = {"Hello" ,"Rameshsoft","Java with Selenium"};
		
		Stream<String> stream = Arrays.stream(s);
		//stream.forEach(ele -> System.out.println(ele));
		
		stream.forEach(System.out::println);
		*/
		
		
		//2. Way
//		Stream<String> dstream = Stream.of("JAVA 8","Selenium","Cucumber","BDD");
//		dstream.forEach(System.out::println);
//		
	
		//3. Way
	    List<String> list  = new ArrayList<String>();
	    list.add("Hello");
	    list.add("Java 8");
	    list.add("Cucumber");
	    
	    
	    Stream<String> streams = list.stream();
	    streams.forEach(System.out::println);
	}

}
