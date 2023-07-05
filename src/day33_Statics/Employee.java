package day33_Statics;

public class Employee {

    public String name;
    //public static String name; --> dersem hepsi Fady ismi alacaktı en son o atandı

    public double salary;

    public static boolean isHuman = true;

}
/*
Statik
• Statik anahtar kelime ile bildirilir
• Sınıfa aittir ve sınıf aracılığıyla çağrılabilir
• Sınıfın tüm nesneleri için paylaşılan statikin yalnızca bir kopyası vardır.
• Sınıfın tüm Nesneleri aynı kopyayı paylaşır

Statics Members
• Static is applicable for the following:
• Variables
• Methods
• Blocks

Static Variables
• Refer to the common property of all objects
• It gets memory only once in the class area at the time of class loading
• A single copy of a class ‘s static variable is shared by all objects of the class
• If changes are made to static variables, all other instances will see the effect of
the change

Static Methods
• If we declare any methods as static, it’s known as static methods
• A method that can be called using class name, without creating objects
• Objects can also call static methods
• Static methods only accept static members

Static method
- Static methods can not access instance methods and instance variables directly
- In static methods we can not use the “this” keyword

Instance method
- Instance methods can access instance methods and instance variables directly
- Instance methods can also access static methods and static variables directly

Static Block
• It’s a set of instructions that is run only once when a class is loaded into memory
• A static block is also called static initialization block

Static Imports
• With the help of import, we are able to access classes and interfaces which are
present in any package. But using static import, we can access all the static members
(variables and methods) of a class directly without explicitly calling class name


 */