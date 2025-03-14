package OOPs;

public class Class1 {
    public static void main(String[] args) {
        // Create an object (instance) of the Car class
        Car myCar = new Car();

        // Set the fields for the Car object
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 50;

        // Call methods on the Car object
        myCar.displayDetails();
        myCar.accelerate(30);
        myCar.displayDetails();
        myCar.brake(60);
        myCar.displayDetails();
    }
}

// Define a class named Car
class Car {
    // Fields (Instance variables)
    String brand;  // Brand of the car
    String color;  // Color of the car
    int speed;     // Current speed of the car

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    // Method to accelerate the car
    void accelerate(int increment) {
        speed += increment;
        System.out.println("The car accelerated by " + increment + " km/h.");
    }

    // Method to brake the car
    void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0; // Speed cannot be negative
        System.out.println("The car slowed down by " + decrement + " km/h.");
    }
}


