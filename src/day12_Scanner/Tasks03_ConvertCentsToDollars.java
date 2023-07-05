package day12_Scanner;
import java.util.Scanner;
public class Tasks03_ConvertCentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int money = input.nextInt();
        int cents = money%100;
        int dollar =(money-cents)/100;
        System.out.println(money+" cents equal to: "+dollar+" dollars and "+cents+" cents");
    }
}
/*
3. Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225
            output:
                225 cents equal to: 2 dollars and 25 cents
 */