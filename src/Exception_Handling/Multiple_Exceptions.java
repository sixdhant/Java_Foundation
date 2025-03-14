package Exception_Handling;

public class Multiple_Exceptions 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] numbers = new int[5];
			numbers[10] = 50; // This will throw ArrayIndexOutOfBoundsException
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Error: Array index out of bounds.");
		} 
		catch (Exception e)
		{
			System.out.println("General error: " + e);
		} 
		finally 
		{
			System.out.println("This block will always execute.");
		}
	}
}
