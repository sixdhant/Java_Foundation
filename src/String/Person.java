package String;

public class Person 
{
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method
    @Override
    public String toString() 
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Person person = new Person("Siddhant", 30);
        System.out.println(person.toString()); // Output: Person{name='Alice', age=30}
    }
}
