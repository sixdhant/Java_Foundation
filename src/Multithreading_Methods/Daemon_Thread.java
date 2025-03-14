package Multithreading_Methods;

class DaemonThread extends Thread 
{
    public void run() 
    {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted.");
            }
        }
    }
}

public class Daemon_Thread {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Mark as daemon thread
        daemonThread.start();

        System.out.println("Main thread is running...");
        try {
            Thread.sleep(3000); // Main thread runs for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished. Daemon thread will stop.");
    }
}

