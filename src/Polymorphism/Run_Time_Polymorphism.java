package Polymorphism;

//Parent class
class Shape {
	void draw() {
		System.out.println("Drawing a generic shape");
	}
}

//Subclass 1
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

//Subclass 2
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
};

//Main class
public class Run_Time_Polymorphism {
	public static void main(String[] args) {
		Shape shape;

		// Reference of parent class pointing to Circle object
		shape = new Circle();
		shape.draw(); // Calls Circle's draw method

		// Reference of parent class pointing to Rectangle object
		shape = new Rectangle();
		shape.draw(); // Calls Rectangle's draw method
	}
}
