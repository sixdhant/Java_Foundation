package Upcasting;

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
    void draw() 
    {
        System.out.println("Drawing a rectangle");
    }
}

public class Upcasting_with_Polymorphism 
{
    public static void main(String[] args) 
    {
        Shape shape; // Reference of superclass

        shape = new Circle(); // Upcasting
        shape.draw(); // Calls Circle's draw()

        shape = new Rectangle(); // Upcasting
        shape.draw(); // Calls Rectangle's draw()
    }
}
