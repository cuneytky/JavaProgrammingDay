package day35_Encapsulation;
public class TaskClass_Circle {

    private double radius;
    public static double pi;
    public TaskClass_Circle(int radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    static {
        pi=3.14;
    }
    public void setRadius(double radius){
        if(!(radius<=0)){
            return;
        }
        this.radius=radius;
    }
    public void calcArea(){
        double area = pi*radius*radius;
        System.out.println(area);
    }
    public void calcPerimeter(){
        double perimeter= 2*pi*radius;
        System.out.println(perimeter);
    }
    public String toString() {
        return "TaskClass_Circle{" +
                "radius=" + radius +
                '}';
    }
}
/*
	2. Create a class named Circle
			privtae variables:				radius
			public variable:				pi
	Encapsulate all the private fields
	1. radius of the circle can not be zero or negative
 	Add a constructor that can set the raidus of coircle when circle object is created
 	Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */