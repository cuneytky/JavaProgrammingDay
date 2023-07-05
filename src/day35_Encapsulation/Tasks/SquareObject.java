package day35_Encapsulation.Tasks;

public class SquareObject {
    public static void main(String[] args) {

        Square square=new Square(5);
        System.out.println(square);

        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());

    }
}
