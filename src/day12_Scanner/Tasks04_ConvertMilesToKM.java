package day12_Scanner;
import java.util.Scanner;
public class Tasks04_ConvertMilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double mil = input.nextDouble();
        double km = mil*1.609;
        System.out.println(mil+" miles equal to "+km+" kilometers");
    }
}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0
            output:
                10.0 miles equal to 16.09 kilometers
 */