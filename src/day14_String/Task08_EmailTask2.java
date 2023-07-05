package day14_String;
import java.util.Scanner;
public class Task08_EmailTask2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter email");
        String email = input.next();

        int s1=email.indexOf('_');
        int s2=email.indexOf('@');
        int s3=email.indexOf('.');

        String first =email.substring(0,s1);
        String last = email.substring(s1+1,s2);
        String domain= email.substring(s2+1,s3);

        String first2= (first.substring(0,1).toUpperCase()+first.substring(1));
        String last2 = (last.substring(0,1).toUpperCase()+last.substring(1));
        System.out.println("First name: "+first2);
        System.out.println("Last name: "+last2);
        System.out.println("Domain: "+domain);
    }
}
/*
 8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
       Write a program that will print out information about user based on email. Print first name, last name, and domain.
       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
               Ex:
                   input:
                       craig_federighi@apple.com
                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */
