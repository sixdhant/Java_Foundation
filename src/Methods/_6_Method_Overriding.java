package Methods;

class Parent 
{
	int i = 100; 
    public void showMessage() 
    {
        System.out.println("Message from Parent class.");
    }
}

class Child extends Parent 
{
    @Override
    public void showMessage() 
    {
        System.out.println("Message from Child class.");
        System.out.println("Number From Parent class : "+i);
    }
}

public class _6_Method_Overriding 
{
    public static void main(String[] args) 
    {
        Parent obj = new Child(); // Polymorphism
        obj.showMessage();
    }
}
/**

Message from Child class.
Number From Parent class : 100


*/