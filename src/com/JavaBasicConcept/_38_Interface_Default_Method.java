/*	Interface Default Method 		*/

package com.JavaBasicConcept;
public class _38_Interface_Default_Method 
{
	public static void main(String[] args) 
	{
		B21 B = new B21();
		B.a1();
		B.a2();
		B.a3();
		
		C21 C = new C21();
		C.a1();
		C.a2();
		C.a3();
		
		D21 D = new D21();
		D.a1();
		D.a2();
		D.a3();
	}
}
interface A21
{
	void a1();		// public + abstract
	void a2();		// public + abstract
	default void a3()
	{
		System.out.println("May or May not Override in sub implementing classes");
	}
}
class B21 implements A21
{
	public void a1()
	{
		System.out.println("Class B a1()");
	}
	public void a2()
	{
		System.out.println("Class B a2()");
	}
	public void a3()
	{
		System.out.println("Override in sub implementing class B");
	}
}
class C21 implements A21
{
	public void a1()
	{
		System.out.println("Class C a1()");
	}
	public void a2()
	{
		System.out.println("Class C a2()");
	}
	
}

class D21 implements A21
{
	public void a1()
	{
		System.out.println("Class D a1()");
	}
	public void a2()
	{
		System.out.println("Class D a2()");
	}	
}

/* 

Class B a1()
Class B a2()
Override in sub implementing class B
Class C a1()
Class C a2()
May or May not Override in sub implementing classes
Class D a1()
Class D a2()
May or May not Override in sub implementing classes

*/