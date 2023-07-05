package day43_Abstraction.car;

public abstract class Car {

    // 1 - private olarak variable tanımladık (final olanlara dikkat et varsa staticlere de)
    private final String brand, model; //değişmeyeceği için  final ile tanımladık
    private String color;
    private final int year;  //değişmeyeceği için  final ile tanımladık
    private double price;

    // 4 - constructor ile 5 variable da getiridk. varsa ozel tanımladıklarıız onları set değiştirdik
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;  // özel durum tanımlamayacaksak aynen kalabılır
        this.model = model;  // özel durum tanımlamayacaksak aynen kalabılır
        setColor(color);    // varsa ozel tanımladıklarıız onları set değiştirdik

   // 5 - cons ıcerisnde final olanları (set ile yapamadığımız ıcın) tanımlayabiliriz.
        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year);
        }    // year final olarak tanımladık ama invalid durumlar için tanımlamak yapmalıyız.
             // örneğin <1 886 olamsı halinde geöersiz diyerek prg sonlandırmalı, bunu da throw ile ne ypmalıyız biz belirledik.
        this.year = year;  // özel durum tanımlamayacaksak aynen kalabılır

        setPrice(price);   // varsa ozel tanımladıklarıız onları set değiştirdik
    }

    // 2 - getter ile getirdik (hepsi geldi 5 variable)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    // 3 - setter ile 2 tanesini getirdik finallar gelmedi. dikkat et
    public void setColor(String color) {
        this.color = color;
    }

    // 6- price için şartları tanımladık throw atmasını sağladık. prg sonlandırma sartlarını belirledik.
    public void setPrice(double price) {
        if(price <= 0){   // RuntimeException oldugundan genelde throw tercıh edilir.
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
    }

    // 7 - diğer methodları yazdık: (tüm child lar ıcın gecerlı olanları)
    public  void stop(){
        System.out.println("Press the brake");
    } // bu ozellik(stop) tum sub-class larda gecerli oldugundan method olarak yazdık

    // 8 - // bu ozellik (start) tum sub-class larda var ama her bırınde farklı;
           // bu sebeple bunu method olarak yazmadık abstract olarak tanım yaptık ve detayı sub-class tan almasını soylemıs olduk.
           // bunun için abstract kullandık (bundan emın ol--> aslında yaptıgımız overrıde ama ıslem azalttık galıba?? ekstra yer kaplamamış oluyor)
         // bunu abstract yapınca hata verecek "public abstract class Car" olarak class adını duzeltnce sorun gitti
                                              //( abstract class yapmış olduk) <== ( abstract 3 ana baslığı vardı 1. abstract class)

                                          // abstract method incomplete metod  unutma!!
    public abstract void start();         //  --> bu da abstract method        <== ( abstract 3 ana baslığı vardı 2. abstract method)
                                                                               //  ( abstract 3 ana baslığı vardı 3. inherit)
                                         // abstract method 1. body si yok ve overriding gibi davranır!!!
                                        //  abstract method 2. private olmaz overriding gibi davranacak cunku
                                        //  abstract method 3. static olmaz (instance method gibi diyebilriz sanırım)
                                        //  abstract method 4. final olmaz
                                        //  abstract method 5. multiply implementation
    // 9 - toString i getirdik.(all)
    @Override   // overriding olarak getir....
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
/*
Abstract Method Rules:
• An abstract method can not be static
• An abstract method can not be final
• An abstract method can not have private access modifier
• An abstract method does not have body
• An abstract method can only be created in an abstract class or in an interface

 **Super (parent) class is responsible to provide the variables and methods
 that are needed to the all the sub classes without worrying about the small details

*** Sub (child) classes are responsible for providing the implementations that are needed

***
    Creating Object:
• Abstract class is meant to be inherited only, not meant to be instantiated
• Abstract class is not a concrete class and object has to be concrete
• A sub class of abstract class is called concrete class, and it can be instantiated
• A Concrete class must implement all the inherited abstract methods

***
                  Abstract Class vs Regular class (Concrete)
           Regular class                                    Abstract class
can have constructors, instances and statics        can have constructors, instances and statics
Regular class can be instantiated                   Abstract class can not be instantiated
Regular class can not have abstract method          Abstract class can have abstract method
Regular class can be declared as final              Abstract class can not be declared as final

 */
