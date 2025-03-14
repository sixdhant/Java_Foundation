package instanceof_Keyword;

class Shape 
{
	void draw() 
	{
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape 
{
	void draw() 
	{
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape 
{
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class Polymorphism_with_instanceof 
{
	public static void main(String[] args) 
	{
		Shape shape = new Circle();

		if (shape instanceof Circle)
		{
			System.out.println("The shape is a Circle");
		} 
		else if (shape instanceof Rectangle) 
		{
			System.out.println("The shape is a Rectangle");
		} 
		else 
		{
			System.out.println("Unknown shape");
		}
	}
}
