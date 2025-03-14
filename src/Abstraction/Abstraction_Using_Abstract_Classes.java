package Abstraction;


abstract class Shape 
{
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method (with implementation)
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Abstraction_Using_Abstract_Classes 
{
    public static void main(String[] args) 
    {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();    // Output: Drawing a circle
        shape1.display(); // Output: This is a shape.

        shape2.draw();    // Output: Drawing a rectangle
        shape2.display(); // Output: This is a shape.
    }
}
