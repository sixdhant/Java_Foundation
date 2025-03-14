package OOPs;

public class Polymorphism 
{
	 public static void main(String[] args) 
	 {
	     // Polymorphic behavior: Parent class reference, Child class objects
	     Employee emp1 = new Manager("Alice", 80000);
	     Employee emp2 = new Developer("Bob", 60000);

	     // Call methods
	     System.out.println("Details of Manager:");
	     emp1.displayDetails();
	     emp1.calculateBonus(); // Executes Manager's calculateBonus

	     System.out.println("\nDetails of Developer:");
	     emp2.displayDetails();
	     emp2.calculateBonus(); // Executes Developer's calculateBonus
	 }
}

//Superclass (Parent Class)
class Employee 
{
	String name;
	double salary;

	// Constructor
	Employee(String name, double salary) 
	{
     this.name = name;
     this.salary = salary;
	}

	// Method to display employee details
	void displayDetails() 
	{
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
	}

	// Method to calculate bonus (Overridden by subclasses)
	void calculateBonus() 
	{
     System.out.println("General Employee Bonus: " + (salary * 0.10));
	}
}

//Subclass (Child Class) 1
class Manager extends Employee 
{
	// Constructor
	Manager(String name, double salary)
	{
     super(name, salary); // Call parent class constructor
	}

	// Override calculateBonus method
	@Override
	void calculateBonus() 
	{
     System.out.println("Manager Bonus: " + (salary * 0.20));
	}
}

//Subclass (Child Class) 2
class Developer extends Employee 
{
	// Constructor
	Developer(String name, double salary) 
	{
     super(name, salary); // Call parent class constructor
	}

	// Override calculateBonus method
	@Override
	void calculateBonus() 
	{
     System.out.println("Developer Bonus: " + (salary * 0.15));
	}
}

/* 
Inheritance:
The Employee class is the superclass.
The Manager and Developer classes are subclasses that extend Employee.

Method Overriding:
Subclasses (Manager and Developer) override the calculateBonus method of the Employee class to provide specific implementations.

Polymorphism:
The parent class reference (Employee emp1 and Employee emp2) is used to refer to objects of the child classes (Manager and Developer).
At runtime, the method corresponding to the actual object type is called (dynamic method dispatch).



*/