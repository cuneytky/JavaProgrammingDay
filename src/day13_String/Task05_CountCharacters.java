package day13_String;
import java.util.Scanner;
public class Task05_CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = input.next();
        int wordlength = word.length();
        if(wordlength>3){
            System.out.println( ""+word.charAt(wordlength - 3) +word.charAt(wordlength - 2)+word.charAt(wordlength - 1));
        }else if(wordlength==0){
            System.out.println("string is empty");
        }else{
            System.out.println(word);
        }
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */