package Java_Variables;

public class Static_Variable {

	public static void main(String[] args) 
	{
		Static_Variable_OBJ static_var = new Static_Variable_OBJ();
		static_var.display();
	}
}
class Static_Variable_OBJ
{
	static int localVar = 10; // static variable
	
	void display()
	{
		System.out.println("Static Variable value: "+localVar);
	}
}
