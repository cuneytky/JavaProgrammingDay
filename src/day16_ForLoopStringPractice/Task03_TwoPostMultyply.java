package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task03_TwoPostMultyply {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first num:");
        int num1=scanner.nextInt();
        System.out.println("enter second num:");
        int num2=scanner.nextInt();
        int total =0;
        if(num2>0 &&num1>0){
            for (int i = 0; i < num2; i++) {
                total+=num1;
            }
            System.out.println(total);
        }else{
            System.out.println("invalid");
        }
    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication
    (*) operator.  if user enters any negative numbers, print Invalid
            Ex:
                inputs:
                    10
                    20
                output:
                    200
 */