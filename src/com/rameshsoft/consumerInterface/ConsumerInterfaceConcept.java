package com.rameshsoft.consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept implements Consumer<Integer>
{
	@Override
	public void accept(Integer t) 
	{
		System.out.println(t);
	}
	
	public static void main(String[] args) 
	{
		Consumer<Integer> consumer  =  new ConsumerInterfaceConcept();
		consumer.accept(18);
	}

	

}
