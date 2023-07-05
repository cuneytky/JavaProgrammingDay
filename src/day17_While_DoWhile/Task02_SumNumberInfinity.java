package day17_While_DoWhile;
import java.util.Scanner;
public class Task02_SumNumberInfinity {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scanner.nextInt();
        int total=0;
        while (num>0){
            total+=num;
            System.out.println("total = " + total);
            System.out.println("enter a number:");
            num=scanner.nextInt();
        }
    }
}
/*
2. Write a program that calculates the sum of numbers entered
by the user until user enters a negative number.
            hint: you need an infinite loop
 */