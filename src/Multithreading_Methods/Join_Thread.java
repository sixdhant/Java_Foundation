package Multithreading_Methods;

class MyThread3 extends Thread 
{
    public void run() 
    {
        System.out.println("Thread " + getName() + " is running...");
        try 
        {
            Thread.sleep(3000);  // Simulate some work
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread " + getName() + " has completed.");
    }
}

public class Join_Thread 
{
    public static void main(String[] args) 
    {
        MyThread3 thread1 = new MyThread3();
        thread1.setName("Worker-1");

        MyThread3 thread2 = new MyThread3();
        thread2.setName("Worker-2");

        thread1.start();
        thread2.start();

        try 
        {
            thread1.join();  // Wait for thread1 to finish
            thread2.join();  // Wait for thread2 to finish
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("All threads have completed.");
    }
}
