package tester.test1;

public class Vehicle {

    private String make;
    private String model;
    private int year;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
/*
Create a Java class hierarchy to model different types of vehicles.
The hierarchy should include a parent class called "Vehicle"
and two child classes called "Car" and "Motorcycle". Each vehicle has a make, model, and year.
 Cars have an additional variable called "numDoors" to represent the number of doors,
 while motorcycles have an additional variable called "hasSidecar" to indicate whether
 they have a sidecar or not. Implement appropriate constructors and methods to
 get and display the details of each vehicle.
 */