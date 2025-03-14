package Java_Variables;

public class Instance_Variable {

	public static void main(String[] args) 
	{
		Instance_Variable_OBJ Instance_var = new Instance_Variable_OBJ();
		Instance_var.display();
	}
}
class Instance_Variable_OBJ
{
	int localVar = 10; // Instance Variable
	
	void display()
	{
		System.out.println("Instance Variable value: "+localVar);
	}
}
