package Java_Variables;

public class Java_Variables {

	public static void main(String[] args) {
	
		Java_Variable_OBJ java_var = new Java_Variable_OBJ();
		java_var.display();
	}

}
class Java_Variable_OBJ
{
	static int Static_Variable = 30;	// static variable
	int instance_variable = 20;	// Instance Variable
	void display()
	{
		int local_variable = 10;	// Local variable
		
		System.out.println("Local Variable value: "+local_variable);
		System.out.println("Instance Variable value: "+instance_variable);
		System.out.println("Static Variable value: "+Static_Variable);
	}
}