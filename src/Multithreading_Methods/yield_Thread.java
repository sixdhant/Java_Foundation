package Multithreading_Methods;

public class yield_Thread 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(() -> 
        {
            System.out.println("Thread-1 is running.");
            Thread.yield();  // Give other threads of equal priority a chance to execute
            System.out.println("Thread-1 has completed.");
        });

        Thread t2 = new Thread(() -> 
        {
            System.out.println("Thread-2 is running.");
        });

        t1.start();
        t2.start();
    }
}
