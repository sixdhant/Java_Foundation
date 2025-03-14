package Inheritance;

//Parent class (Superclass)
class Parent {
	void display() {
		System.out.println("This is the Parent class.");
	}
}

//Child class (Subclass)
class Child extends Parent {
	void show() {
		System.out.println("This is the Child class.");
	}
}

//Main class
public class Single_Inheritance {
	public static void main(String[] args) {
		// Create an object of the Child class
		Child childObject = new Child();

		// Call methods from both Parent and Child classes
		childObject.display(); // Method from Parent class
		childObject.show(); // Method from Child class
	}
}
