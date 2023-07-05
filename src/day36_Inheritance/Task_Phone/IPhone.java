package day36_Inheritance.Task_Phone;

public class IPhone extends Phone{
    public IPhone( String model, String color, double size, double price) {
        super("Iphone", model, color, size, price);
    }
    public void faceTime(long phoneNumber){
        System.out.println("face time Number is: "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("face time Mail is: "+email);
    }


}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */