package day43_Abstraction.task_Shape;

public final class Circle extends Shape{
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

