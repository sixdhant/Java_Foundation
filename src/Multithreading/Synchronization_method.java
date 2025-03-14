package Multithreading;

import java.net.Authenticator;

class Table
{
	public synchronized void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i*n);
		}
	}
}

class Thread1 extends Thread
{
	Table table;
	Thread1(Table table)
	{
		this.table= table;
	}
	public void run()
	{
		table.printTable(7);
	}
}
class Thread2 extends Thread
{
	Table table;
	Thread2(Table table)
	{
		this.table= table;
	}
	public void run()
	{
		table.printTable(5);
	}
}

public class Synchronization_method {

	public static void main(String[] args) {
	
		Table table = new Table();

		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);
		
		thread1.start();
		thread2.start();

	}

}
