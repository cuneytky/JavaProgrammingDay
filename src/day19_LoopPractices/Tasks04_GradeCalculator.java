package day19_LoopPractices;
import java.util.Scanner;
public class Tasks04_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score");
            int score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F");
            System.out.println("would you like to continue?");
            String yesNo = scanner.next();
            if (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("invalid entry");
                System.exit(0);
            }
            if (yesNo.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }
}
/*
4. Write a program for grade calculator:
	1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program
				after displaying the error message "Invalid Entry"

	2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

	2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

	If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */