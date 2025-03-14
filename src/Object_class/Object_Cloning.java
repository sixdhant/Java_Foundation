package Object_class;

class Student implements Cloneable {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone(); // Creates a shallow copy
    }

    @Override
    public String toString() 
    {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

public class Object_Cloning {
    public static void main(String[] args) {
        try {
            // Create an original object
            Student student1 = new Student(101, "John");

            // Clone the original object
            Student student2 = (Student) student1.clone();

            // Display both objects
            System.out.println("Original Object: " + student1);
            System.out.println("Cloned Object: " + student2);

            // Modify the original object's data
            student1.name = "Doe";

            // Display both objects again
            System.out.println("\nAfter modifying the original object:");
            System.out.println("Original Object: " + student1);
            System.out.println("Cloned Object: " + student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
