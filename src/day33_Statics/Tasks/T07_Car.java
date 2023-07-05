package day33_Statics.Tasks;

public class T07_Car {

    public String make,model,color;
    public int year, price;
    public static int numberOfWheels=4;
    public static boolean hasBattery=true;
    public static boolean hasSeats=true;

    public T07_Car(String make, String model, String color, int year, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public void drive(){
        System.out.println(make+" is good drive.");
    }

    public String toString() {
        return "T07_Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
7. Car Task:
	  1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats
            Add a constructor to initialize all the fields
      Methods:
                drive()
                toString()
 */
