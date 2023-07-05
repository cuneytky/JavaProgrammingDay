package tester.test4;

public abstract class Vehicle {

    public abstract void start();
    public abstract void stop();
    public abstract void accelerate(int speed);


}
/*
Create an abstract class called "Vehicle" with the following abstract methods:

void start(): This method should start the vehicle.
void stop(): This method should stop the vehicle.
void accelerate(int speed): This method should accelerate the vehicle to the given speed.
Create two concrete classes that extend the Vehicle class: "Car" and "Motorcycle". Implement the abstract methods in each class as follows:

In the Car class:
Implement the "start()" method to display "Car started."
Implement the "stop()" method to display "Car stopped."
Implement the "accelerate(int speed)" method to display "Car accelerating to [speed] km/h."

In the Motorcycle class:
Implement the "start()" method to display "Motorcycle started."
Implement the "stop()" method to display "Motorcycle stopped."
Implement the "accelerate(int speed)" method to display "Motorcycle accelerating to [speed] km/h."

Create an interface called "Convertible" with the following method:
void openRoof(): This method should open the roof of the convertible vehicle.
Implement the "Convertible" interface in the Car class.
Provide an implementation for the "openRoof()" method that displays "Opening the car roof."

Finally, write a main method in a separate class to test the functionality of the Car and
Motorcycle classes. Create instances of each class and call the "start()",
"stop()", and "accelerate()" methods on the objects.
If the object is an instance of the Car class and also implements the
Convertible interface, call the "openRoof()" method as well.
 */