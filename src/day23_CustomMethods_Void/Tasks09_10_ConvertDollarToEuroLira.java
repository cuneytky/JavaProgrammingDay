package day23_CustomMethods_Void;
public class Tasks09_10_ConvertDollarToEuroLira {
    public static void main(String[] args) {
        dollarToEuro(5);
        dollarToLira(5);
    }
    public static void dollarToEuro(double dollar){
        double convertDollar = 0.92*dollar; // (date : 04.04.2023)
        System.out.println(dollar+" Dollar = "+convertDollar+" Euro");
    }
    public static void dollarToLira(double dollar){
        double convertDollar = 19.23*dollar; // (date : 04.04.2023)
        System.out.println(dollar+" Dollar = "+convertDollar+" TL");
    }
}
/*
    9. create a method that can convert dollar to euro
	10. create a method that can can convert dollar to lira
 */
