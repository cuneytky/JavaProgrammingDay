package day33_Statics.Tasks;

public class T04_Iphone {

    public String model;
    public double price;
    public String color;
    public int size;
    public static String brand ="Apple";
    public static String OS="İOS";
    public static String madeIn="China";

    public T04_Iphone(String model, double price, String color, int size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    public static long faceTime = 123456l;
    public static String face = "ıphone.com";
    public static long call = 111222333l;
    public static long text = 999888777l;

    public String toString() {
        return "T04_Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
		Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
