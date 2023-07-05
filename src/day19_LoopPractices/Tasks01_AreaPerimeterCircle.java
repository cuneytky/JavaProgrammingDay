package day19_LoopPractices;
import java.util.Scanner;
public class Tasks01_AreaPerimeterCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scanner.nextDouble();
            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double dia = 2 * radius;
            double area = 2 * radius * radius * (3.14);
            double per = 2 * radius * 3.14;
            System.out.println("1. Diameter of circle : "+dia); //R=2*r
            System.out.println("2. Area of circle     : "+area); // A=2*3,14*r*r
            System.out.println("3. Perimeter of circle: "+per); //P=2*3,14*r
            System.out.println("Would you like to calculate another circle?");
            String yesNo = scanner.next();
            while (!(yesNo.equalsIgnoreCase("no") || yesNo.equalsIgnoreCase("yes"))) {
                System.err.println("invalid entry re-enter");
                yesNo = scanner.next();
            }
             if (yesNo.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
             }
        }
    }
}
/*
Tasks
1. Write a program that can calculate the area and perimeter of a circle:
	1. Ask the user "Enter the radius of the circle:"
		if user enters 0 or negative numbers, terminate the program after
		displaying the error message "Invalid Entry for the radius of the circle"

	2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

	3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

	If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */