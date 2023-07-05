package day13_String;
import java.util.Scanner;
public class Task07_CheckWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter first word");
        String firstWord = input.next();
        int first =firstWord.length();

        System.out.println("enter second word");
        String secondWord = input.next();
        int second =secondWord.length();

        System.out.println("enter third word");
        String thirdWord = input.next();
        int third =thirdWord.length();

        if(first==second && first==third){
            System.out.println("All words are same length");
        } else if (first!=second && first!=third) {
            System.out.println("All different length");
        }else {
            System.out.println("Not Same nor Different lengths");
        }
    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
     - if they are same length:  print "All words are same length"
     - if some same length and others not:    print "Not Same nor Different lengths"
     - if all different length :  print "All different length"
 */