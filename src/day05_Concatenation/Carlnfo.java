package day05_Concatenation;

public class Carlnfo {
    public static void main(String[] args) {
        int year = 2015;
        String make = "Honda";
        String model = "H-RV";
        int miles = 100_000;
        String color = "Black";
        int price = 10_000;
        String Mycar = year+" "+make+" "+model+", "+miles+" miles, "+color+", $"+price+".";
        System.out.println(Mycar);

    }
}
/*
TASK-3 :
1. Create a class called CarInfo.java
2. Declare the following variables:
        1. year
        2. make
        3. model
        4. miles
        5. color
        6. price
3. Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */
