package day19_LoopPractices;
import java.util.Scanner;
public class Tasks02_AreaPerimeterSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            double square = scanner.nextDouble();
            if (square <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area = square * square;
            double per = 4 * square;
            System.out.println("1. Area of square     : " + area);
            System.out.println("2. Perimeter of square: " + per);
            System.out.println("Would you like to calculate another Square?");
            String yesNo = scanner.next().toLowerCase();
            while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("invalid entry, re-enter");
                yesNo = scanner.next().toLowerCase();
            }
            if (yesNo.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }
    }
}
/*
2. Write a program that can calculate the area and perimeter of a Square:
		1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after
				displaying the error message "Invalid Entry for the side of the square"
		2. Display:
					1. Area of square
					2. Perimeter of square
		3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
	If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */