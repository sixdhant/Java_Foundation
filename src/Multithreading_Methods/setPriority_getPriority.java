package Multithreading_Methods;

class MyThread4 extends Thread 
{
    public void run() 
    {
        System.out.println("Thread " + getName() + " with priority " + getPriority() + " is running.");
    }
}

public class setPriority_getPriority 
{
    public static void main(String[] args) 
    {
        MyThread4 thread1 = new MyThread4();
        thread1.setName("LowPriority");
        thread1.setPriority(Thread.MIN_PRIORITY);  // Set lowest priority

        MyThread4 thread2 = new MyThread4();
        thread2.setName("HighPriority");
        thread2.setPriority(Thread.MAX_PRIORITY);  // Set highest priority

        thread1.start();
        thread2.start();
    }
}

