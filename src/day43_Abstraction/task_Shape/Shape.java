package day43_Abstraction.task_Shape;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " area= " + area() +
                " Perimeter= " + perimeter() +
                '}';
    }
}
/*
Shape task:
	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields
		area()
		perimeter()
		toString(): name, area, perimeter

	Create the following subclasses of Shape and add the aditional features that are needed:
				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)
				Square:
					area(): s * s
					perimeter: 4 * s
				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */