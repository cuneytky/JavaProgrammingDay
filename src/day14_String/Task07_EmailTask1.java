package day14_String;
import java.util.Scanner;
public class Task07_EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter email address:");
        String email=input.next();

        int s1=email.indexOf("_");
        int s2=email.indexOf("@");
        char k =email.charAt(s1);
        String first =email.substring(0,s1);
        String last=email.substring(s1+1,s2);
        String domain=email.substring(s2);
        System.out.println(last+k+first+domain);
    }
}
/*
   7. Create a class calledEmailTask1.
      Assume that email address is constructed by person's first name and followed by an underscore and last name.
      Write a program that can swap first name with last name in the email (Seperated by an underscore).
      If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
