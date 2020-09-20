package com.rameshsoft.defaultmethods;

public class DefaultTest 
{

	public static void main(String[] args) 
	{
		RBI rbi = new RBI();
		rbi.balEnq();
		rbi.pinChange();
		rbi.cashWithDraw();
		rbi.cashDeposit();
		
		SBI sbi = new SBI();
		sbi.balEnq();
		sbi.pinChange();
		sbi.cashWithDraw();
		sbi.cashDeposit();
		
		CBI cbi = new CBI();
		cbi.balEnq();
		cbi.pinChange();
		cbi.cashWithDraw();
		cbi.cashDeposit();
	}

}
