package Multithreading;

class B implements Runnable
{
	public void run()
	{
		try 
		{
			for (int i = 1; i <= 5; i++) {
				System.out.println("Siddhant");
				Thread.sleep(1000);
			}

		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}

	}
}

public class Test1 
{
	public static void main(String[] args) throws InterruptedException {
		
		B t1 = new B();
		Thread t2 = new Thread(t1);
		t2.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Deshmukh");
			Thread.sleep(1000);
		}
		
	}
}
