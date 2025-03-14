package Final_Keyword;

final class FinalClass 
{
	public void display() 
	{
		System.out.println("This is a final class.");
	}
}

/* class SubClass extends FinalClass 
   { 
 		This will cause a compilation error
   }
*/

public class Final_Classes 
{
	public static void main(String[] args) 
	{
		FinalClass obj = new FinalClass();
		obj.display();
	}
}
