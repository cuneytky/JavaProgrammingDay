package day13_String;
import java.util.Scanner;
public class Tasks01_Reverse_$$$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter word:");
        String word= input.next();
        int length =word.length();

        if(length==5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }else {
            if(length>5){
                System.out.println("Too long");
            }else {
                System.out.println("Too short");
            }
        }
    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */