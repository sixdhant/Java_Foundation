package Encapsulation;

class Person 
{
    // Private fields
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) 
    {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Person person = new Person();

        // Setting values using setters
        person.setName("John");
        person.setAge(25);

        // Getting values using getters
        System.out.println("Name: " + person.getName()); // Output: Name: John
        System.out.println("Age: " + person.getAge());   // Output: Age: 25

        // Invalid age
        person.setAge(-5); // Output: Age must be positive.
    }
}

