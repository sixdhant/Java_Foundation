package Inheritance;

//Parent class (Superclass)
class Parent1 {
	void display() {
		System.out.println("This is the Parent class.");
	}
}

//Child class (Subclass)
class Child1 extends Parent1 {
	void show() {
		System.out.println("This is the Child class.");
	}
}

//Grandchild class (Subclass of Child)
class Grandchild extends Child1 {
	void print() {
		System.out.println("This is the Grandchild class.");
	}
}

//Main class
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		// Create an object of the Grandchild class
		Grandchild grandchildObject = new Grandchild();

		// Call methods from Parent, Child, and Grandchild classes
		grandchildObject.display(); // Method from Parent class
		grandchildObject.show(); // Method from Child class
		grandchildObject.print(); // Method from Grandchild class
	}
}
