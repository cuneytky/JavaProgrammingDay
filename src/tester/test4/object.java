package tester.test4;

public class object {
    public static void main(String[] args) {

        Car car= new Car();
        car.start();
        car.stop();
        car.accelerate(90);
        car.openRoof();

        System.out.println("----------");

        Motorcycle motorcycle =new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.accelerate(80);

    }
}
