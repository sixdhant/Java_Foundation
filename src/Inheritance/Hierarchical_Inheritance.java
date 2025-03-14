package Inheritance;

//Parent class (Superclass)
class Parent3 {
 void display() {
     System.out.println("This is the Parent class.");
 }
}

//Child1 class (Subclass 1)
class Chiild1 extends Parent3 {
 void show() {
     System.out.println("This is the Child1 class.");
 }
}

//Child2 class (Subclass 2)
class Chiild2 extends Parent3 {
 void print() {
     System.out.println("This is the Child2 class.");
 }
}

//Main class
public class Hierarchical_Inheritance {
 public static void main(String[] args) {
     // Create an object of Child1
     Chiild1 child1Object = new Chiild1();
     child1Object.display(); // Method from Parent class
     child1Object.show();    // Method from Child1 class

     // Create an object of Child2
     Chiild2 child2Object = new Chiild2();
     child2Object.display(); // Method from Parent class
     child2Object.print();   // Method from Child2 class
 }
}
