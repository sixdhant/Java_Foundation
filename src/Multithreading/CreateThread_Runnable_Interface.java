package Multithreading;

class MyRunnable implements Runnable 
{
    public void run() 
    {
        System.out.println("Runnable thread is running: " + Thread.currentThread().getName());
    }
}

public class CreateThread_Runnable_Interface 
{
    public static void main(String[] args) 
    {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();  // Starts the thread
    }
}

