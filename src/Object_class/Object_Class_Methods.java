package Object_class;

public class Object_Class_Methods 
{
    public static void main(String[] args) 
    {
        // Create an object
        MyClass obj1 = new MyClass(1, "Object1");
        MyClass obj2 = new MyClass(1, "Object1");

        // Using toString()
        System.out.println("toString: " + obj1);

        // Using equals()
        System.out.println("Equals: " + obj1.equals(obj2));

        // Using hashCode()
        System.out.println("HashCode obj1: " + obj1.hashCode());
        System.out.println("HashCode obj2: " + obj2.hashCode());

        // Using getClass()
        System.out.println("Class: " + obj1.getClass());
    }
}

// A custom class extending Object
class MyClass {
    int id;
    String name;

    public MyClass(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    // Overriding toString()
    @Override
    public String toString() 
    {
        return "MyClass{id=" + id + ", name='" + name + "'}";
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id && name.equals(myClass.name);
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}

