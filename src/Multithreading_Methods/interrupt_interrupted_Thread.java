package Multithreading_Methods;

class MyThread5 extends Thread 
{
    public void run() 
    {
        try 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.println("Thread " + getName() + " is running...");
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread " + getName() + " was interrupted.");
        }
    }
}

public class interrupt_interrupted_Thread 
{
    public static void main(String[] args) 
    {
        MyThread5 thread = new MyThread5();
        thread.start();
        try 
        {
            Thread.sleep(3000);
            thread.interrupt();  // Interrupt the thread after 3 seconds
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
