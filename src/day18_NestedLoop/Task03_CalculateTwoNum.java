package day18_NestedLoop;
import java.util.Scanner;
public class Task03_CalculateTwoNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("enter second number:");
            int num2 = scanner.nextInt();
            System.out.println("enter math operator:");
            char ch= scanner.next().charAt(0);
            while (!(ch=='+'||ch=='-'||ch=='*'||ch=='/') ) {
                System.out.println("invalid operator, re-enter:");
                ch = scanner.next().charAt(0);
            }
            int result = ch=='+'?num1+num2: ch=='-'? num1-num2: ch=='*'?num1*num2: num1/num2;
             System.out.println(result);
            /*
                if (ch == '+') {
                    System.out.println(num2 + num1);
                } else if (ch == '-') {
                    System.out.println(num2 - num1);
                } else if (ch == '*') {
                    System.out.println(num2 * num1);
                } else if (ch == '/') {
                    System.out.println(num2 / num1);
                }
*/
            System.out.println("want to continue? (yes/no)");
            String yesNo = scanner.next();

            if (yesNo.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Thanks for using Cydeo calculator");
    }
}
/*
3. Write a program that can calculate two numbers.
        1. Ask user to enter the first number
		2. Ask user to enter a math operator (+,-,/,*)
	(if user enters any invalid operator, repeat this step until user provides a valid operator)
		3. Ask user to enter the second number
		4. Display the result
		5. Ask user if they want to continue? (yes/no)
			if yes ==> repeat the entire steps
			if no ==> print "Thanks for using Cydeo calculator!"
	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */