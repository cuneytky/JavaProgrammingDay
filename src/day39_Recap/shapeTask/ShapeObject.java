package day39_Recap.shapeTask;
public class ShapeObject {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);         //Square{side=10.0perimeter= 40.0area= 100.0}

        square.setSide( 15 );
        System.out.println(square);          //Square{side=15.0perimeter= 60.0area= 225.0}
        System.out.println(square.getName()); //Square

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle); //Rectangle{length=5.0, width= 6.0, area= 30.0, perimeter= 22.0}

        rectangle.setLength(10);
        System.out.println( rectangle.getLength() ); //10.0
        System.out.println( rectangle);  //Rectangle{length=10.0, width= 6.0, area= 60.0, perimeter= 32.0}
        System.out.println(rectangle.getName()); //Rectangle
        //System.out.println(rectangle.name()); //Rectangle gelmes getter-setter oldugundan

        System.out.println("------------------------");

        Circle circle = new Circle(7.5);
        System.out.println(circle); //Circle{radius=7.5, pi='3.14', area='176.625', perimeter='47.1'}

        //circle.radius = 15.5;

        circle.setRadius(15.5);
        System.out.println( circle.getRadius() );  //15.5
        System.out.println(circle); //Circle{radius=15.5, pi='3.14', area='754.385', perimeter='97.34'}
        System.out.println(circle.getName()); //Circle
        System.out.println("==================");

       // Square square2 = new Square(-10);
       // System.out.println(square2); //Invalid Side: -10.0 -->Process finished with exit code 1
       // System.out.println("wooden"); // wooden gelip     --> Process finished with exit code 0
       // System.out.println(20/0); // ArithmeticException: / by zero ile hata verdi --> Process finished with exit code 1
        // bu yuzden exit 1 yazdık....
        // Square da= public double side; ile tanım yapsaydık; => hata vermeden negative sonuc getirirdi

    }
}
