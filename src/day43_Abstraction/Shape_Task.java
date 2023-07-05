package day43_Abstraction;

public abstract class Shape_Task {
    private String name;

    public Shape_Task(String name) {
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
final class Circle extends Shape_Task {
    private double radius;
    private final static double pi=3.14;

    public Circle( double radius) {
        super("Radius");
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }
}

final class Square extends Shape_Task{
    private double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }


}

final class Rectangle extends Shape_Task{

    private double width ,length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }


}

class ShapeObject {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(15,20);
        System.out.println(rectangle);

        System.out.println("---------------------");

        Square square =new Square(10.5);
        System.out.println(square);

        System.out.println("---------------------");

        Circle circle = new Circle(10.5);
        System.out.println(circle);
        System.out.println(circle.getRadius());
    }
}