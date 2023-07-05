package day14_String;
import java.util.Scanner;
public class Task01_TwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word");
        String first = input.next();
        System.out.println("enter second word");
        String second = input.next();
        String new1 = first.substring(1);
        String new2 = second.substring(1);
        System.out.println(new1+new2);
    }
}
/*
  1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */