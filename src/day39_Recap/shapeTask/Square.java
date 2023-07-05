package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    // sağ tıkla geneate ile getir
    /*
    public Square(String name, double side) {
        super(name);
        setSide(side);
    }
      bu geldi uzerınde oynama yapıp asagıdakı hale getir
    */
    // extend ile uste baglamayı unutma!!!!

    public Square( double side) {
        super("Square");
        setSide(side); // burada side uzerinde olası değişiklikler vardı.(<0 vs.)
        // bu yuzden this side olmadı set ile yazdık
    }

    // sağ tık-generate-override-area--sonra formulu duzenle
    @Override
    public double area() {
        return side*side;
    }

    // sağ tık-generate-override-perimeter--sonra formulu duzenle
    @Override
    public double perimeter() {
        return side*4;
    }

    // sağ tık-generate-toString--düzenle
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "perimeter= " + perimeter() +
                "area= " + area() +
                '}';
    }

    //finish square
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */