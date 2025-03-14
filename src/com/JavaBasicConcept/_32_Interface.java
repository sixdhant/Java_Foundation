/* 		 Interface  Example		*/


package com.JavaBasicConcept;
import java.util.Scanner;

public class _32_Interface 
{
	public static void main(String[] args) 
	{
		Client sid = new Siddhant31();
		sid.input();
		sid.output();
	}
}

interface Client
{
	void input();	// public + abstract
	void output();	// public + abstract
}

class Siddhant31 implements Client
{
	String name; double sal;
	public void input()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sobj.nextLine();
		
		System.out.print("Enter Salary: ");
		sal = sobj.nextDouble();
	}
	
	public void output()
	{
		System.out.println("Output : "+name+" and "+sal);
	}
}

/*

Enter Name: siddhant deshmukh
Enter Salary: 50000.50
Output : siddhant deshmukh and 50000.5


*/