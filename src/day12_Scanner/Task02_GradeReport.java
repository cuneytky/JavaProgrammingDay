package day12_Scanner;
import java.util.Scanner;
public class Task02_GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Score");
        int score = input.nextInt();
        String level="";
        if(score>=0&&score<=100){
            if(score>=90){
                level="A";
            } else if (score>=80) {
                level="B";
            } else if (score>=70) {
                level="C";
            } else if (score>=60) {
                level="D";
            } else if (score>=0) {
                level="F";
            }
            System.out.println(level);
        }else {
            System.out.println("invalid score");
        }
    }
}
/*
Task:
  2. GradeReport:
      2.1 Ask the user to enter the his/her score
      2.2 Print the grade of the student (A, B, C, D, F)-->  90-80-70-60
      2.3 If user enter invalid score (negative or more than 100) print invalid score
 */