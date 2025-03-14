/*      Multiple Inheritance  Example	   */

package com.JavaBasicConcept;
public class _36_Interface_Mutiple_1 implements sid27, sid28
{
	public void show()
	{
		System.out.println("Interface A");
	}
	public void Display()
	{
		System.out.println("Interface B");
	}
	public static void main(String[] args) 
	{
		_36_Interface_Mutiple_1 sid = new _36_Interface_Mutiple_1();
		sid.show();
		sid.Display();
	}
}

interface sid27
{
	void show();	// public + abstract
	
}

interface sid28
{
	void Display();	// public + abstract
}

/* 

Interface A
Interface B

*/