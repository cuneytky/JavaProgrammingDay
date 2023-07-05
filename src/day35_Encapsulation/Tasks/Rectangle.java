package day35_Encapsulation.Tasks;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width<0){
            return;
        }
        this.width = width;
    }
    public double calcArea(){
        double area=length*width;
        return area;
    }
    public double calcPerimeter(){
        double perimete=2*(width+length);
        return perimete;
    }

    public String toString() {
        return "Rectangle{" +
                " length= " + length +
                ", width= " + width +
                " area "+calcArea()+
                " perimeter "+calcPerimeter()+
                '}';
    }
}
/*

2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */