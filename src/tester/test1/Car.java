package tester.test1;

public class Car extends Vehicle{


    public int numDoors;


    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                " make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                " numDoors=" + numDoors +
                '}';
    }
}
