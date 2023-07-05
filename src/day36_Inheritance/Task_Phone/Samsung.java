package day36_Inheritance.Task_Phone;

public class Samsung extends Phone{
    public Samsung( String model, String color, double size, double price) {
        super("Samsung", model, color, size, price);
    }
    public void freeze(){
        System.out.println(brand+" is freezing");
    }


}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */