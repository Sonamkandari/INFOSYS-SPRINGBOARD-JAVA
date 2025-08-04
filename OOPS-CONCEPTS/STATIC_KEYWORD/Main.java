class Car {
    // Static variable to count number of cars
    static int count = 0;

    // Instance variables
    String model;

    // Constructor
    Car(String model) {
        this.model = model;
        count++;  // Increase count each time a new object is created
    }

    void display() {
        System.out.println("Car Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");
        Car c2 = new Car("BMW");
        Car c3 = new Car("Audi");

        c1.display();
        c2.display();
        c3.display();

        System.out.println("Total number of cars: " + Car.count);  // Accessing static variable using class name
    }
}
