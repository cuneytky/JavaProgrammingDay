package day37_Inheritance.phoneTask;


public final class Iphone extends Phone{


    public Iphone( String model, String size, double price, String color) { // buradan brandı kaldırıp , parametre azalttık
        super("Apple", model, size, price, color);// buraya apple yazıp brandı doldurduk statıc olmadı sadece veri bir kere tanımlanmıs oldu.
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}


/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */