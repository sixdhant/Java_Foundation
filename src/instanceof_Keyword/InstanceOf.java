package instanceof_Keyword;

class Animal 
{

	
}

class Dog extends Animal 
{
	
}

public class InstanceOf 
{
    public static void main(String[] args) 
    {
        Animal animal = new Dog();

        // Checking types using instanceof
        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Dog);    // true

        // Null check
        Animal nullAnimal = null;
        System.out.println(nullAnimal instanceof Animal); // false
    }
}
