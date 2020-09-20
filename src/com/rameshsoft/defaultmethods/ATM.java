package com.rameshsoft.defaultmethods;

public interface ATM 
{
  void pinChange();
  void balEnq();
  void cashWithDraw();
  
  default void cashDeposit()
  {
	  System.out.println("Default ATM implementation");
  }
}

class RBI implements ATM
{

	@Override
	public void pinChange() 
	{
		System.out.println("In Pin change method");
	}

	@Override
	public void balEnq() 
	{
		System.out.println("In Bal enq method");
	}

	@Override
	public void cashWithDraw() 
	{
		System.out.println("In cash with draw method");
		System.out.println("=========================");
	}
	
	  public void cashDeposit()
	  {
		  System.out.println("RBI ATM implementation");
	  }

}


class SBI implements ATM
{
	@Override
	public void pinChange() 
	{
		System.out.println("In Pin change method");
	}

	@Override
	public void balEnq() 
	{
		System.out.println("In Bal enq method");
	}

	@Override
	public void cashWithDraw() 
	{
		System.out.println("In cash with draw method");
		System.out.println("=========================");
	}
	
	  public void cashDeposit()
	  {
		  System.out.println("SBI ATM implementation");
	  }

}


class CBI implements ATM
{
	@Override
	public void pinChange() 
	{
		System.out.println("In Pin change method");
	}

	@Override
	public void balEnq() 
	{
		System.out.println("In Bal enq method");
	}

	@Override
	public void cashWithDraw() 
	{
		System.out.println("In cash with draw method");
		System.out.println("=========================");
	}

}

