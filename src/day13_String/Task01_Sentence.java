package day13_String;
import java.util.Scanner;
public class Task01_Sentence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence =input.nextLine();
        char first =sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);
        System.out.println("first & last characters: "+first+" & "+last);
    }
}
/*
1. write a program that asks user to enter a sentence.
       then print the first & last characters of the sentence
 */