/* 		Method Overriding Example - Animal Sound	*/

package A_BasicConcept;
public class _27_Method_Overriding1 
{
    public static void main(String[] args) 
    {
        Animal2 myAnimal = new Animal2();    // Animal object
        myAnimal.sound();                  // Call base class method
        
        Animal2 myDog = new Dogg2();          // Dog object as Animal type
        myDog.sound();                     // Call overridden method in Dog class
        
        Animal2 myCat = new Cat();          // Cat object as Animal type
        myCat.sound();                     // Call overridden method in Cat class
    }
}

class Animal2 
{
    // Base class method
    void sound() 
    {
        System.out.println("Animals make sounds First");
    }
}

class Dogg2 extends Animal2 
{
    // Overriding the sound method for Dog
    @Override
    void sound() 
    {
        super.sound();  // Optionally call the superclass method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2
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