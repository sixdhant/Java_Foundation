package Multithreading_Methods;

class MyThread1 extends Thread 
{
    public void run() 
    {
        try 
        {
            System.out.println("Thread " + getName() + " is sleeping...");
            Thread.sleep(5000);  // Pause for 2 seconds
            System.out.println("Thread " + getName() + " has woken up.");
        } 
        catch (InterruptedException e)
        {
            System.out.println("Thread " + getName() + " was interrupted.");
        }
    }
}

public class Sleep_Thread {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}
