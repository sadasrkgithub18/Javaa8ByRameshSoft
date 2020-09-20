package com.rameshsoft.methodreference;

public interface RameshSoft 
{
  public JOB get(String s);
}

class JOB
{
	private String s;
	
	public JOB(String s)
	{
		this.s = s;
		System.out.println("If you want job u have to: "+s);
	}
}