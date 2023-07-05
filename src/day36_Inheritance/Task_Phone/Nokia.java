package day36_Inheritance.Task_Phone;

public class Nokia extends Phone {
    public Nokia( String model, String color, double size, double price) {
        super("Nokia", model, color, size, price);
    }
    public void selfDefense(){
        System.out.println(brand+" has a self defence special");
    }


}
/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */