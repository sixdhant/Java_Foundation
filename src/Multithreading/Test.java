package Multithreading;

class A extends Thread {
	@Override
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

public class Test {
	public static void main(String[] args) throws InterruptedException {

		A t1 = new A();
		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Deshmukh");
			Thread.sleep(1000);
		}
	}
}
