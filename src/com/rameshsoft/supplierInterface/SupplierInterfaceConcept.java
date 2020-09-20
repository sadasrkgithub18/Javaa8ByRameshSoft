package com.rameshsoft.supplierInterface;

import java.util.function.Supplier;

public class SupplierInterfaceConcept implements Supplier<Double>
{
	@Override
	public Double get() 
	{
		double d = Math.random();
		return d;
	}
	
	
	public static void main(String[] args) 
	{
		Supplier<Double> supplier = new SupplierInterfaceConcept();
		System.out.println(supplier.get());
	}

	

}
