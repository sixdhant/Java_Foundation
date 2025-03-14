package Multithreading_Methods;

class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class Start_and_Run_Thread 
{
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
        thread.start();  // Starts the thread and invokes the run() method
    }
}

