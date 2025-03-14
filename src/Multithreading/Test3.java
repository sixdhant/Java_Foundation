package Multithreading;

class C extends Thread
{
	public void run()
	{
		String nString = Thread.currentThread().getName();
		for(int i =1; i<=3; i++)
		{
			System.out.println(nString);
		}
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C t1 = new C();
		C t2 = new C();
		C t3 = new C();
		C t4 = new C();
		
		t1.setName("Siddhant");
		t2.setName("Arti"); 
		t3.setName("Manisha");
		t4.setName("Suresh");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
