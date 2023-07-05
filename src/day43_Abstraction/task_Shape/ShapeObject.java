package day43_Abstraction.task_Shape;

public class ShapeObject {
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
