package Multithreading;

class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class CreateThread_Thread_Class 
{
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
        thread.start();  // Starts the thread
    }
}
