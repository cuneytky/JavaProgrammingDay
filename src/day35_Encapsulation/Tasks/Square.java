package day35_Encapsulation.Tasks;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }
    public double getside(){
        return side;
    }
    public void setSide(double side){
        if(side<0){
            return;
        }
        this.side=side;
    }
    public double calcArea(){
        double area =side*side;
        return area;
    }
    public double calcPerimeter(){
        double perimeter =4*side;
        return perimeter;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
/*
1. Square Task:
	1.1 Create a class named Square:
		Private variables:					side

		Encapsulate all the fields

		Condition:		side of the square should not be negative

		Add a constructor that allows user to set all the fields when the object is created.
			(If the arguments not valid it should not be set to the instances)

		Methods:
			calcArea(): returns the area of square
			calcPerimeter(): returns the perimeter of square
			toString(): can display the side, area, perimeter of square when object is passed in print statement

 */
