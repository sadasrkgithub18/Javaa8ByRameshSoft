package com.rameshsoft.lambda;

@FunctionalInterface
public interface Practice 
{
  void job();
}

class PracticeImpl implements Practice
{

	@Override
	public void job() 
	{
	 System.out.println("JOB");	
	}
	
}


