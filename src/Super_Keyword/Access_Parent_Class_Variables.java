package Super_Keyword;

class Parent 
{
	String name = "Parent";
}

class Child extends Parent 
{
	String name = "Child";

	void displayNames() 
	{
		System.out.println("Name in Child class: " + name);
		System.out.println("Name in Parent class: " + super.name); // Access Parent's name
	}
}

public class Access_Parent_Class_Variables 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.displayNames();
	}
}
