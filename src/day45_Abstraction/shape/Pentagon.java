package day45_Abstraction.shape;
public class Pentagon extends Shape{
    private double side;
    public Pentagon( double side) {
        super("Pentagon");
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
        return side*side*1.73*0.25*5;
    }

    @Override
    public double perimeter() {
        return side*5;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
