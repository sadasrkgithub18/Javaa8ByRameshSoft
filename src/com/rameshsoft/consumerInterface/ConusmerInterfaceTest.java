package com.rameshsoft.consumerInterface;

import java.util.function.Consumer;

public class ConusmerInterfaceTest 
{

	public static void main(String[] args) 
	{
		Consumer<Integer> consumer  = (ele) -> {
			System.out.println("Value of a is: "+ele);
		};
		
		consumer.accept(99);
		consumer.accept(999);
	}

}
