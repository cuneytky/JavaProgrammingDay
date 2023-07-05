package day45_Abstraction.shape;

public class Cube extends Shape implements Volume {
    private double side;
    public Cube( double side) {
        super("Cube");
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
        return side*side*6;
    }

    @Override
    public double perimeter() {
        return side*12;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                ", Volume= " + volume() +
                ", side=" + side +
                '}';
    }
}
