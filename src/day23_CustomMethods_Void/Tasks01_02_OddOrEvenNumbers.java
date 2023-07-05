package day23_CustomMethods_Void;
public class Tasks01_02_OddOrEvenNumbers {
    public static void main(String[] args) {
        evenNumbers();
        System.out.println();
        System.out.println("-----------------");
        oddNumbers();
    }
    public static void evenNumbers(){
        for (int i = 0; i <101 ; i+=2) {
            System.out.print(i+" ");
        }
    }
    public  static void oddNumbers(){
        for (int i = 1; i <101 ; i+=2) {
            System.out.print(i+" ");
        }
    }
}
/*
Tasks:
	1. create a method that can print odd numbers between 1~100 in a same line separated by space
	2. create a method that can print even numbers between 1~100 in a same line separated by space
 */