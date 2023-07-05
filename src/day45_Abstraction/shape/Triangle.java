package day45_Abstraction.shape;
public class Triangle extends Shape{
    private double height, lenght;
    private double length2, length3;
    public Triangle( double height, double lenght, double length2, double length3) {
        super("Triangle");
        this.height = height;
        this.lenght = lenght;
        this.length2 = length2;
        this.length3 = length3;
    }
    public double getLength2() {
        return length2;
    }
    public void setLength2(double length2) {
        this.length2 = length2;
    }
    public double getLength3() {
        return length3;
    }
    public void setLength3(double length3) {
        this.length3 = length3;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double area() {
        return height*lenght*0.5;
    }
    @Override
    public double perimeter() {
        return lenght+length2+length3;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                "height=" + height +
                ", lenght=" + lenght +
                '}';
    }
}
