package Abstraction;

interface Animal 
{
    void sound(); // Abstract method

    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstraction_Using_Interfaces 
{
    public static void main(String[] args) 
    {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: This animal eats food.

        cat.sound(); // Output: Cat meows
        cat.eat();   // Output: This animal eats food.
    }
}
