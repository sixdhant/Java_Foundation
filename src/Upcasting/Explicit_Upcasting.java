package Upcasting;

class Parent 
{
    void show() 
    {
        System.out.println("Parent show method");
    }
}

class Child extends Parent 
{
    void show() 
    
    {
        System.out.println("Child show method");
    }
    void childSpecificMethod() 
    {
        System.out.println("Child-specific method");
    }
}

public class Explicit_Upcasting 
{
    public static void main(String[] args) 
    {
        Child child = new Child();
        Parent parent = (Parent) child; // Explicit upcasting
        parent.show(); // Calls Child's overridden method
    }
}
