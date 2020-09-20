package com.rameshsoft.lambda;

@FunctionalInterface
public interface JOB 
{
  int length(String str);
}

class JOBImpl implements JOB
{

	@Override
	public int length(String str) 
	{
		return str.length();
	}
	
}

