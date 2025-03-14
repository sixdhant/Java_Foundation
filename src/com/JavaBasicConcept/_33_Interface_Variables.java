/*      Interface_Variables Example	     */

package com.JavaBasicConcept;
public class _33_Interface_Variables 
{
	public static void main(String[] args) 
	{
		CustomerSid sid = new SellerSid();
		sid.purchase();
		System.out.println("Check Static or Not : "+CustomerSid.amt); // Static
	}
}

interface CustomerSid
{
	int amt = 5;		// public + static + final
	public abstract void purchase(); // public + abstract
	
}
class SellerSid implements CustomerSid
{
	@Override
	public void purchase()
	{
		//amt = 7;  final
		System.out.println("Siddhant needs "+ amt + " Rice.");
	}
}

/* 

Siddhant needs 5 Rice.
Check Static or Not : 5

*/