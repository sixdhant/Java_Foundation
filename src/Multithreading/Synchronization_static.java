package Multithreading;

class Bank extends Thread
{
	static int amount;
	static int balence = 5000;
	
	Bank(int amount) 
	{
		this.amount = amount;
	}
	
	public static synchronized void withdrwal()
	{
		String nString = Thread.currentThread().getName();
		
		if(balence >= amount)
		{
			System.out.println(nString+" : has withdwal amount");
			balence = balence - amount;
		}
		else 
		{
			System.out.println(nString+" : insuficient amount");
		}
		
	}
	
	public void run()
	{
		Bank.withdrwal();
	}
	
}

public class Synchronization_static {
    public static void main(String[] args) {
        
    	Bank bank1 = new Bank(5000);
    	
    	Thread thread1 = new Thread(bank1);
    	Thread thread2 = new Thread(bank1);
    	
    	Bank bank2 = new Bank(5000);
    	
    	Thread thread3 = new Thread(bank2);
    	Thread thread4 = new Thread(bank2);
    	
    	thread1.setName("Siddhant");
    	thread2.setName("Arti");
    	thread3.setName("Manisha");
    	thread4.setName("Suryakant");
    	
    	thread1.start();
    	thread2.start();
    	thread3.start();
    	thread4.start();
    	
    }
}
