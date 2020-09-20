package com.rameshsoft.methodreference;

public class ConstructerTest 
{

	public static void main(String[] args) 
	{
		//1. way
		JOB job = new JOB("Work hard");
		
		System.out.println("========================");
		
		//2. Way
		RameshSoft rameshSoft = s -> new JOB(s);
		rameshSoft.get("Practice");
		
		System.out.println("========================");
		
		//3. Way
		RameshSoft rameshSoft2 = JOB::new;
		rameshSoft2.get("Prepare well");
	}

}
