package Java_Variables;

public class Local_Variable {

	public static void main(String[] args) 
	{
		Local_Variable_OBJ local_var = new Local_Variable_OBJ();
		local_var.display();
	}
}
class Local_Variable_OBJ
{
	void display()
	{
		int localVar = 10; // Local variable
		System.out.println("Local Variable value: "+localVar);
	}
}
