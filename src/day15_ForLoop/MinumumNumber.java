package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int min = 2147483647; //any number that user enter will be less than 2147483647

        for (int i = 10; i < 15; i++) {
            System.out.println("enter a number:");
            int num = scanner.nextInt();

            if (num<min){
                min=num;
            }
        }
        System.out.println("min = " + min);

    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */