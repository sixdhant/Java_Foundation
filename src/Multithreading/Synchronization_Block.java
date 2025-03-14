package Multithreading;

class Table1 {
    void printTable(int n) 
    {
        synchronized (this) { // Synchronization block
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i * n);
                try 
                {
                    Thread.sleep(100); // Adding a small delay for better visualization
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread3 extends Thread {
    Table1 table;
    
    Thread3(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.printTable(7);
    }
}

class Thread4 extends Thread {
    Table1 table;
    
    Thread4(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.printTable(5);
    }
}

public class Synchronization_Block {
    public static void main(String[] args) {
        Table1 table = new Table1();

        Thread3 thread1 = new Thread3(table);
        Thread4 thread2 = new Thread4(table);

        thread1.start();
        thread2.start();
    }
}
