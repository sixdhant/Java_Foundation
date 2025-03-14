package Final_Keyword;

class Parent 
{
	public final void show() 
	{
		System.out.println("This is a final method.");
	}
}

class Child extends Parent 
{
	/* 
	 public void show() 
	 {
	 	System.out.println("Cannot override final method."); // This will cause a
	 	compilation error
	 } 
	 */
}

public class Final_Methods 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.show(); // Calls the final method from Parent class
	}
}
