package Multithreading_Methods;

class MyThread6 extends Thread 
{
    public void run() 
    {
        System.out.println("Thread name: " + getName());
    }
}

public class setName_getName 
{
    public static void main(String[] args) 
    {
        MyThread6 thread = new MyThread6();
        thread.setName("CustomThread");
        thread.start();
    }
}
