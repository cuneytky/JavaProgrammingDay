package day14_String;
import java.util.Scanner;
public class Task06_AccountNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter a number");
        String number=input.next();

        char first= number.charAt(0);
        int length =number.length();
        if((first=='2' && length==7)||(first=='5' && length==10)){
                System.out.println(number);
        }else {
            System.out.println("Invalid account number");
        }
    }
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */
