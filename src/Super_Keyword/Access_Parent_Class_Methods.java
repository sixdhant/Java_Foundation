package Super_Keyword;

class Parent5 
{
    void display() 
    {
        System.out.println("This is the method in the Parent class.");
    }
}

class Child5 extends Parent5 {
    @Override
    void display() 
    {
        System.out.println("This is the method in the Child class.");
    }

    void showParentMethod() 
    {
        super.display(); // Calls the Parent class's display() method
    }
}

public class Access_Parent_Class_Methods 
{
    public static void main(String[] args) 
    {
        Child5 obj = new Child5();
        obj.display();          // Calls Child's display()
        obj.showParentMethod(); // Calls Parent's display() using super
    }
}
