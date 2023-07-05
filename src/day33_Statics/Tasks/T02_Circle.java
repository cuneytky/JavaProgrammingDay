package day33_Statics.Tasks;

public class T02_Circle {

    public double radius;
    public static double pi=3.14;
    public T02_Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }
    public static void printPi(){
        System.out.println("PI's value is :"+pi);
    }

    public String toString() {
        return "T02_Circle{" +
                " radius= " + radius +
                ", diameter= " + (radius*2) +
                ", area= " + calcArea() +
                ", perimeter= " + calcPerimeter() +
                ", PI's value is : " + pi +
                '}';
    }
}
/*

2. Circle Task:
		1. Create a class named Circle:
				Attributes:
					instance: radius, diameter
					static: pi
	Add a constructor that can set All the fields (instances)
	HINT: we only need to know the radius to set the radius & diameter
			Actions:
	calcArea(): returns the area of Circle
	calcPerimeter(): returns the perimeter of Circle
	printPi(): displays PI value
	toString(): displays the radius, diameter, pi, area and perimeter of the circle
	           when the object of circle is passed in the print statement

 */
