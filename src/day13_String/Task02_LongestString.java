package day13_String;
import java.util.Scanner;
public class Task02_LongestString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter first word:");
        String first = input.next();

        System.out.println("enter second word:");
        String second = input.next();

        int ch1 =first.length();
        int ch2 =second.length();

        if(ch1>ch2){
            System.out.println("longest word: "+first);
        }else{
            System.out.println("longest word: "+second);
        }
    }
}
/*
2. write a program that asks user to enter two strings,
   and print out the longest string
 */
