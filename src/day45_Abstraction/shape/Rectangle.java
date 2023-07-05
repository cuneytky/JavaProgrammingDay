package day45_Abstraction.shape;
public class Rectangle extends Shape{
    private double width, height;
    public Rectangle( double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return width*height;
    }
    @Override
    public double perimeter() {
        return 2*(width+height);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                " width=" + width +
                ", height=" + height +
                '}';
    }
}
