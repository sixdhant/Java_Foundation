package OOPs; // Encapsulation

public class Encapsulation 
{
    public static void main(String[] args) {
        // Create Employeeee object
        Employeeee emp = new Employeeee(101, "John Doe", 50000);

        // Display initial details
        System.out.println("Initial Details:");
        emp.displayDetails();

        // Modify details using setters
        emp.setName("Jane Doe");
        emp.setSalary(60000);

        // Display updated details
        System.out.println("\nUpdated Details:");
        emp.displayDetails();

        // Try setting an invalid salary
        emp.setSalary(-5000); // Outputs: Invalid salary amount!
    }
}


class Employeeee {
    // Private fields (Encapsulation: Hiding data)
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employeeee
    public Employeeee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public getter for ID
    public int getId() {
        return id;
    }

    // Public setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Public getter for Name
    public String getName() {
        return name;
    }

    // Public setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for Salary
    public double getSalary() {
        return salary;
    }

    // Public setter for Salary
    public void setSalary(double salary) {
        if (salary > 0) 
        {
            this.salary = salary;
        } 
        else 
        {
            System.out.println("Invalid salary amount!");
        }
    }

    // Method to display Employeeee details
    public void displayDetails() 
    {
        System.out.println("Employeeee ID: " + id);
        System.out.println("Employeeee Name: " + name);
        System.out.println("Employeeee Salary: $" + salary);
    }
}



