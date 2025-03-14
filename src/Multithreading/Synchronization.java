package Multithreading;

class Bus implements Runnable {
	int avialable = 1, passenger;

	Bus(int passenger) {
		this.passenger = passenger;
	}

	public synchronized void run() {
		String nString = Thread.currentThread().getName();
		if (avialable >= passenger) {
			System.out.println(nString + " - Reversed Seaat");
			avialable = avialable - passenger;
		} else {
			System.out.println("Sorry");
		}

	}
}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus = new Bus(1);
		Thread t1 = new Thread(bus);
		Thread t2 = new Thread(bus);
		Thread t3 = new Thread(bus);

		t1.setName("siddhant");
		t2.setName("Arti");
		t3.setName("Manisha");

		t1.start();
		t2.start();
		t3.start();

	}

}
