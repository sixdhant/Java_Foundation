/* 		Method Overriding Example - Animal Sound	*/

package com.JavaBasicConcept;
public class _27_Method_Overriding1 
{
    public static void main(String[] args) 
    {
        Animal myAnimal = new Animal();    // Animal object
        myAnimal.sound();                  // Call base class method
        
        Animal myDog = new Dog();          // Dog object as Animal type
        myDog.sound();                     // Call overridden method in Dog class
        
        Animal myCat = new Cat();          // Cat object as Animal type
        myCat.sound();                     // Call overridden method in Cat class
    }
}

class Animal 
{
    // Base class method
    void sound() 
    {
        System.out.println("Animals make sounds First");
    }
}

class Dog extends Animal 
{
    // Overriding the sound method for Dog
    @Override
    void sound() 
    {
        super.sound();  // Optionally call the superclass method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal 
{
    // Overriding the sound method for Cat
    @Override
    void sound() 
    {
        super.sound();  // Optionally call the superclass method
        System.out.println("Cat meows");
    }
}
/*

Animals make sounds First
Animals make sounds First
Dog barks
Animals make sounds First
Cat meows

*/