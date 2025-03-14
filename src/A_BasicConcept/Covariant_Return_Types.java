package A_BasicConcept;

class Animal8 {
    // Method in superclass with return type Animal8
    Animal8 getInstance() {
        return new Animal8();
    }
}

class Dog8 extends Animal8 {
    // Overriding method with a covariant return type (Dog8 is a subclass of Animal8)
    @Override
    Dog8 getInstance() {
        return new Dog8();
    }
}

public class Covariant_Return_Types 
{
    public static void main(String[] args) 
    {
        Animal8 Animal8 = new Animal8();
        Dog8 Dog8 = new Dog8();

        // Superclass method
        System.out.println("Superclass instance: " + Animal8.getInstance().getClass().getSimpleName());

        // Subclass method with covariant return type
        System.out.println("Subclass instance: " + Dog8.getInstance().getClass().getSimpleName());
    }
}



