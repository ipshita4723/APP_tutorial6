
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double speed;

    public Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

  
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}


public class vehicle {
    public static void main(String[] args) {
       
        Vehicle v1 = new Car("TN-01-AB-1234", "Toyota", 120.5, 4);
        System.out.println("--- Car Details ---");
        v1.displayDetails(); 

        System.out.println();

       
        Vehicle v2 = new Bike("TN-02-CD-5678", "Yamaha", 85.0, true);
        System.out.println("--- Bike Details ---");
        v2.displayDetails(); 
    }
}
