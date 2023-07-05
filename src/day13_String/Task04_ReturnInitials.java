package day13_String;
import java.util.Scanner;
public class Task04_ReturnInitials {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter first word:");
        String first= input.next();
        first = first.toUpperCase();

        System.out.println("enter second word");
        String second= input.next();
        second= second.toUpperCase();

        char ch1 = first.charAt(0);
        char ch2 = second.charAt(0);
        System.out.println(ch1+"."+ch2);
    }
}
/*
4. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
        Note: Pay attention to the example output
 */
